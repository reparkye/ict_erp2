package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TestInfo;

public interface TestDAO {

	public List<TestInfo> selectList(TestInfo ti) throws SQLException;
	public TestInfo selectList(int tiNum) throws SQLException;

	}
