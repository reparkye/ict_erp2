package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MmusicDAO;
import com.ict.erp.dao.impl.MmusicDAOImpl;
import com.ict.erp.service.MmusicService;
import com.ict.erp.vo.MmusicInfo;

public class MmusicServiceImpl implements MmusicService {

	MmusicDAO mdao = new MmusicDAOImpl();
	@Override
	public List<MmusicInfo> getSelectMmusicList(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.selectMmusicList(mi);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	public static void main(String[] args) {
		MmusicService ms = new MmusicServiceImpl();
		try {
			System.out.println(ms.getSelectMmusicList(null));
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public MmusicInfo getSelectMmusic(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.selectMmusic(mi);
		}catch(SQLException e) {
		throw e;
		}finally {
			DBCon.getCon();
		}
		
	}

	@Override
	public int insertList(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.insertList(mi);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.getCon();
		}
	
	}
	@Override
	public int deleteList(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.deleteList(mi);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.getCon();
		}
		
	}

	@Override
	public int updateList(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.updateList(mi);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.getCon();
		}
		
	}

}
