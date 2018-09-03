package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MmusicInfo;

public interface MmusicService {

	public List<MmusicInfo> getSelectList(MmusicInfo mi)throws SQLException;
	public MmusicInfo getSelect(MmusicInfo mi)throws SQLException;
	public int getInsert(MmusicInfo mi)throws SQLException;
	public int getDelete(MmusicInfo mi)throws SQLException;
	public int getupdate(MmusicInfo mi)throws SQLException;
}
