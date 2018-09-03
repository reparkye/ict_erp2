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
	public List<MmusicInfo> getSelectList(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.selectMusicList(mi);
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.getCon();
		}

	}

	public static void main(String[] args) {
		MmusicService ms = new MmusicServiceImpl();
		try {
			System.out.println(ms.getSelectList(null));
		} catch (SQLException e) {
		}
	}

	@Override
	public MmusicInfo getSelect(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.selectMusic(mi);
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}
	}

	@Override
	public int getInsert(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.InsertMusicList(mi);
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}
	}

	@Override
	public int getDelete(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.DeleteMusicList(mi);		
		}catch(SQLException e) {
		throw e;	
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int getupdate(MmusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.UpdateMusicList(mi);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
	}
}
