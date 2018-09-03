package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TicketMovieDAO;
import com.ict.erp.dao.impl.TicketMovieDAOImpl;
import com.ict.erp.service.TicketMovieService;
import com.ict.erp.vo.TicketMovie;

public class TicketMovieServiceImpl implements TicketMovieService{

	private TicketMovieDAO tdao = new TicketMovieDAOImpl(); 
	@Override
	public List<TicketMovie> selectTicketList(TicketMovie tm) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
			return tdao.selectTicketList(tm);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	
	}

	@Override
	public TicketMovie selectTicket(TicketMovie tm) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
			return tdao.selectTicket(tm);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.getCon();
		}
	}

	@Override
	public int insertTicketList(TicketMovie tm) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
			return tdao.insertTicketList(tm);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int updateTicketList(TicketMovie tm) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTicketList(TicketMovie tm) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
