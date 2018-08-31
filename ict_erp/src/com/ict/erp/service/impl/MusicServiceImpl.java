package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MusicDAO;
import com.ict.erp.dao.impl.MusicDAOImpl;
import com.ict.erp.service.MusicService;
import com.ict.erp.vo.MusicInfo;

public class MusicServiceImpl implements MusicService {
		private MusicDAO mdao = new MusicDAOImpl();
	
	@Override
	public List<MusicInfo> getmusicList(MusicInfo mi) throws SQLException {
			mdao.setConnection(DBCon.getCon());
			try {
				return mdao.selectMusicList(mi);
	}catch(SQLException e) {
		throw e;
	}finally {
		DBCon.getCon();
		}
	}
	
	
	public static void main(String[] args) {
		MusicService ms = new MusicServiceImpl();
		try {
		System.out.println(ms.getmusicList(null));	
			}catch(SQLException e) {
	}
	}

	@Override
	public MusicInfo getmusic(MusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.selectMusicLL(mi);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}


	@Override
	public int insertMusic(MusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
		return mdao.insertMusicList(mi);
	}catch(SQLException e) {
		throw e;
	}finally {
		DBCon.close();
	}
}


	@Override
	public int deleteMusic(MusicInfo mi) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.deleteMusicList(mi);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}
}
