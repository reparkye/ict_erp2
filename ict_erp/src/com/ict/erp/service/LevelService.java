package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ict.erp.vo.LevelInfo;

public interface LevelService {				/*리스트와 결과(userList)는 나와야한다.*/
	public List<LevelInfo> getLiList(LevelInfo li)throws SQLException ;
	public Map<String,Object> insertNUpdateLiList(Map<String,List<LevelInfo>> liList) throws SQLException;
	public Map<String,Object> deleteLiList(List<LevelInfo> liList)throws SQLException;
}
