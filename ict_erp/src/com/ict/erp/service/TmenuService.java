package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TmenuInfo;

public interface TmenuService {

	public List<TmenuInfo> getSelectList(TmenuInfo ti)throws SQLException;
	public TmenuInfo getSelect(TmenuInfo ti)throws SQLException;
	public int insertList(TmenuInfo ti)throws SQLException;
	public int deleteList(TmenuInfo ti)throws SQLException;
	public int updateList(TmenuInfo ti)throws SQLException;

	
}
