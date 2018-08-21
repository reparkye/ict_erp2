package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.LevelInfo;

/*레벨에서 기준이 되는건 멤버!!*/
public interface LevelService  {
	public List<LevelInfo> getLiList(LevelInfo li) throws SQLException;

	}

