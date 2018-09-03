package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TmenuDAO;
import com.ict.erp.vo.TmenuInfo;

public class TmenuDAOImpl extends CommonDAOImpl implements TmenuDAO {


	@Override
	public List<TmenuInfo> selectTmenuList(TmenuInfo ti) throws SQLException {
		String sql = "select * from menu_info";
		List<TmenuInfo> tList = new ArrayList<TmenuInfo>();

		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				TmenuInfo tmi = new TmenuInfo(rs.getLong("meiNum"),rs.getString("meiName"),
						rs.getLong("meiPrice"),rs.getString("meiDesc"));
				tList.add(tmi);
			}
			return tList;
		}catch(SQLException e) {
			throw e;
		}
	}

	public static void main(String[] args) {
		TmenuDAO tdao = new TmenuDAOImpl();
		tdao.setConnection(DBCon.getCon());
		try {
			tdao.selectTmenuList(null);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public TmenuInfo selectTmenu(TmenuInfo ti) throws SQLException {
		String sql = "select * from menu_info where meiNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, ti.getMeiNum());
			rs = ps.executeQuery();
			while(rs.next()) {
				TmenuInfo tmi = new TmenuInfo(rs.getLong("meiNum"),rs.getString("meiName"),
						rs.getLong("meiPrice"),rs.getString("meiDesc"));
				return tmi;
			}
			return null;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
		
	}
	@Override
	public int insertList(TmenuInfo ti) throws SQLException {
		String sql = "insert into menu_info";
		sql += "values(seq_meiNum.?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, ti.getMeiName());
			ps.setLong(2, ti.getMeiPrice());
			ps.setString(3, ti.getMeiDesc());
			return ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}
	}

	@Override
	public int deleteList(TmenuInfo ti) throws SQLException {
		String sql = "delete from menu_info where meinum=? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, ti.getMeiNum());
			return ps.executeUpdate();
			
		}catch(SQLException e) {
			throw e;
		}finally{
			close();
		}
	}

	@Override
	public int updateList(TmenuInfo ti) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
