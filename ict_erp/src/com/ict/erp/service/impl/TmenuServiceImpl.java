package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TmenuDAO;
import com.ict.erp.dao.impl.TmenuDAOImpl;
import com.ict.erp.service.TmenuService;
import com.ict.erp.vo.TmenuInfo;

public class TmenuServiceImpl implements TmenuService {
	TmenuDAO tdao = new TmenuDAOImpl();
	
	@Override
	public List<TmenuInfo> getSelectList(TmenuInfo ti) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
			return tdao.selectTmenuList(ti);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
	}
	
	public static void main(String[] args) {
		TmenuService ts = new TmenuServiceImpl();
		
		try {
			System.out.println(ts.getSelectList(null));
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public TmenuInfo getSelect(TmenuInfo ti) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
		
			return tdao.selectTmenu(ti);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
		
	}

	@Override
	public int insertList(TmenuInfo ti) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
			return tdao.insertList(ti);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.getCon();
		}
		
	}

	@Override
	public int deleteList(TmenuInfo ti) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
			return tdao.deleteList(ti);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int updateList(TmenuInfo ti) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
