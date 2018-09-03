package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TicketMovie;

public interface TicketMovieService {

	public List<TicketMovie> getTicketMovieList(TicketMovie ti)throws SQLException;
	public TicketMovie getTicketMoviell(TicketMovie ti)throws SQLException;
}
