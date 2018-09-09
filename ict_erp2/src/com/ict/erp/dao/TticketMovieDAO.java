package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TticketMovie;

public interface TticketMovieDAO extends CommonDAO {

	public List<TticketMovie> selectTicketList(TticketMovie tm)throws SQLException;
	public TticketMovie selectTicket(TticketMovie tm)throws SQLException;
	public int insertTicketList(TticketMovie tm)throws SQLException;
	public int deleteTicketList(TticketMovie tm)throws SQLException;
	public int updateTicketList(TticketMovie tm)throws SQLException;
	
}
