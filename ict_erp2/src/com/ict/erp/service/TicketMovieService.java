package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TicketMovie;

public interface TicketMovieService {

	public List<TicketMovie> selectTicketList(TicketMovie tm)throws SQLException;
	public TicketMovie selectTicket(TicketMovie tm)throws SQLException;
	public int insertTicketList(TicketMovie tm)throws SQLException;
	public int updateTicketList(TicketMovie tm)throws SQLException;
	public int deleteTicketList(TicketMovie tm)throws SQLException;

	
}
