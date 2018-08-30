package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.musicInfo;

public interface musicService {

	public List<musicInfo> getmusicList(musicInfo mi)throws SQLException;
	
}
