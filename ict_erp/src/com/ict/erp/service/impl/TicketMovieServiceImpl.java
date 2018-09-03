package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TicketMovieDAO;
import com.ict.erp.dao.impl.TicketMovieDAOImpl;
import com.ict.erp.service.TicketMovieService;
import com.ict.erp.vo.TicketMovie;

public class TicketMovieServiceImpl implements TicketMovieService{
	TicketMovieDAO tm = new TicketMovieDAOImpl();
	
	
	@Override
	public List<TicketMovie> getTicketMovieList(TicketMovie ti) throws SQLException {

		try {
			tm.setConnection(DBCon.getCon());
			return tm.selectTmList(ti);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
	}
	public static void main(String[] args) {
		TicketMovieService ts = new TicketMovieServiceImpl();
		try {
			System.out.println(ts.getTicketMovieList(null));
			
		}catch(SQLException e){
	}
	}
	@Override
	public TicketMovie getTicketMoviell(TicketMovie ti) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
