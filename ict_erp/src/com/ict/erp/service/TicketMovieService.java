package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TicketMovieInfo;

public interface TicketMovieService {

	public List<TicketMovieInfo> getTicketMovieList(TicketMovieInfo ti)throws SQLException;
	public TicketMovieInfo getTicketMoviell(TicketMovieInfo ti)throws SQLException;
}
