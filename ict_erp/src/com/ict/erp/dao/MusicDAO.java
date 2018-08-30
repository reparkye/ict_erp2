package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MusicInfo;

public interface MusicDAO extends CommonDAO{

	public List<MusicInfo> selectMusicList(MusicInfo mi)throws SQLException;
	public MusicInfo selectMusicLL(MusicInfo mi)throws SQLException;
	public int insertMusicList(MusicInfo mi)throws SQLException;
	public int updateMusicList(MusicInfo mi)throws SQLException;
	public int deleteMusicList(MusicInfo mi)throws SQLException;
}
