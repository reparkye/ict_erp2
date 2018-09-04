package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MmusicInfo;

public interface MmusicService {

	
	public List<MmusicInfo> getSelectMmusicList(MmusicInfo mi)throws SQLException;
	public MmusicInfo getSelectMmusic(MmusicInfo mi)throws SQLException;
	public int insertList(MmusicInfo mi)throws SQLException;
	public int deleteList(MmusicInfo mi)throws SQLException;
	public int updateList(MmusicInfo mi)throws SQLException;
	
}
