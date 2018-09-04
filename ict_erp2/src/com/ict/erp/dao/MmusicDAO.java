package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MmusicInfo;

public interface MmusicDAO extends CommonDAO {

	public List<MmusicInfo> selectMmusicList(MmusicInfo mi)throws SQLException;
	public MmusicInfo selectMmusic(MmusicInfo mi)throws SQLException;
	public int insertList(MmusicInfo mi)throws SQLException;
	public int deleteList(MmusicInfo mi)throws SQLException;
	public int updateList(MmusicInfo mi)throws SQLException;
		
}
