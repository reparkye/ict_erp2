package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TicketMovie;

public interface TicketMovieDAO extends CommonDAO {

	public List<TicketMovie> selectTmList(TicketMovie ti)throws SQLException;
	public TicketMovie selectTm(TicketMovie ti)throws SQLException;
	
}
