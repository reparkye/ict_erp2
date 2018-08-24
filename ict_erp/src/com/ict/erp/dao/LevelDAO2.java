package com.ict.erp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.LevelInfo2;

public interface LevelDAO2 {

	public void setConnection(Connection con);
	public List<LevelInfo2> selectLiList(LevelInfo2 li)throws SQLException;
	public int insertLiList(List<LevelInfo2> liList) throws SQLException;
	public int deleteLiList(int[] LiNums) throws SQLException;
	public int updateLiList(List<LevelInfo2> liList) throws SQLException;
}
