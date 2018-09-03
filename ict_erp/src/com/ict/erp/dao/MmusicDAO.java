package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MmusicInfo;

public interface MmusicDAO extends CommonDAO{
	
	public List<MmusicInfo> selectMusicList(MmusicInfo mi)throws SQLException;
	public MmusicInfo selectMusic(MmusicInfo mi)throws SQLException;
	public int InsertMusicList(MmusicInfo mi)throws SQLException;
	public int DeleteMusicList(MmusicInfo mi)throws SQLException;
	public int UpdateMusicList(MmusicInfo mi)throws SQLException;

}
