package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.LevelInfo;

public interface LevelDAO {
	public List<LevelInfo> selectLiList(LevelInfo li)throws SQLException ;
	
}
