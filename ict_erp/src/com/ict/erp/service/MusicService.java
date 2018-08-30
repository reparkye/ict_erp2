package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MusicInfo;

public interface MusicService {

	public List<MusicInfo> getmusicList(MusicInfo mi)throws SQLException;
	public  MusicInfo getmusic(MusicInfo mi)throws SQLException;
}
