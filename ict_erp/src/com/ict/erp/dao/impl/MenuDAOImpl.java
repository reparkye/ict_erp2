package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MenuDAO;
import com.ict.erp.vo.MenuInfo;

public class MenuDAOImpl extends CommonDAOImpl implements MenuDAO{
	
	
	@Override
	public List<MenuInfo> selectMenuList(MenuInfo menu) throws SQLException {
		
		
		String sql = "select * from menu_info";
		List<MenuInfo> menuList = new ArrayList<MenuInfo>();
		
		try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			MenuInfo mi = new MenuInfo(rs.getLong("meiNum"),
					rs.getString("meiName"),
					rs.getLong("meiPrice"),
					rs.getString("meiDesc")
					);
			menuList.add(mi);
		}
		}catch(SQLException e) {
			throw e;
		}finally {
			close();    //해주는 이유는 ps,rs 를  닫기위해
		}
		return null;
	}
public static void main(String[] args) {
	MenuDAO mdao = new MenuDAOImpl();
	try {
		mdao.setConnection(DBCon.getCon());
		System.out.println(mdao.selectMenuList(null));
		MenuInfo menu = new MenuInfo();
		menu.setMeiNum(1l);
		menu.setMeiName("비이");
		menu.setMeiPrice(10000l);
		menu.setMeiDesc("이건뭐지");
		System.out.println(mdao.selectMenu(menu));
		System.out.println(mdao.insertMenu(menu));

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	@Override
	public MenuInfo selectMenu(MenuInfo menu) throws SQLException {
		String sql = "select * from menu_info where meiNum=?";
		try {
		
		ps = con.prepareStatement(sql);
		ps.setLong(1, menu.getMeiNum());
		
		rs = ps.executeQuery();
		while(rs.next()) {
			MenuInfo mi = new MenuInfo(rs.getLong("meiNum"),
					rs.getString("meiName"),
					rs.getLong("meiPrice"),
					rs.getString("meiDesc")
					);
			return mi;
			}
		return null;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();   
		}
	}

	@Override
	public int insertMenu(MenuInfo menu) throws SQLException {
		String sql = "insert into menu_info(meiNum,meiName,meiPrice,meiDesc)";
		sql += "values(seq_meiNum.nextval,?,?,?)";
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, menu.getMeiName());
		ps.setLong(2, menu.getMeiPrice());
		ps.setString(3, menu.getMeiDesc());
		return ps.executeUpdate();
	}catch(SQLException e) {
			throw e;
		}finally {
			close();   
		}
	}
		
	
	@Override
	public int updateMenu(MenuInfo menu) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMenu(MenuInfo menu) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
