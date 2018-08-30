package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.musicInfo;

public interface musicDAO extends CommonDAO{

	public List<musicInfo> selectMusicList(musicInfo mi)throws SQLException;
	public musicInfo selectMusicLL(musicInfo mi)throws SQLException;
	public int insertMusicList(musicInfo mi)throws SQLException;
	public int updateMusicList(musicInfo mi)throws SQLException;
	public int deleteMusicList(musicInfo mi)throws SQLException;
}
