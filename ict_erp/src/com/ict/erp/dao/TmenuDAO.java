package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TmenuInfo;

public interface TmenuDAO extends CommonDAO {

	
	public List<TmenuInfo> selectTmenuList(TmenuInfo ti)throws SQLException;
	public TmenuInfo selectTmenu(TmenuInfo ti)throws SQLException;
	public int insertList(TmenuInfo ti)throws SQLException;
	public int deleteList(TmenuInfo ti)throws SQLException;
	public int updateList(TmenuInfo ti)throws SQLException;
}
