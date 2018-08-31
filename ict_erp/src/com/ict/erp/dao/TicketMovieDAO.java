package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TicketMovieInfo;

public interface TicketMovieDAO extends CommonDAO {

	public List<TicketMovieInfo> selectTmList(TicketMovieInfo ti)throws SQLException;
	public TicketMovieInfo selectTm(TicketMovieInfo ti)throws SQLException;
	
}
