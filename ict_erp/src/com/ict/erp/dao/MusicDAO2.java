package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MusicInfo2;

public interface MusicDAO2 {

	
	public List<MusicInfo2> SelectMusicList(MusicInfo2 mi)throws SQLException;
	public MusicInfo2 SelectMusic(MusicInfo2 mi)throws SQLException;
}
