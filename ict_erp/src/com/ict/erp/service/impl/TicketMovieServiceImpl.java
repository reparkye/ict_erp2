package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TicketMovieDAO;
import com.ict.erp.dao.impl.TicketMovieDAOImpl;
import com.ict.erp.service.TicketMovieService;
import com.ict.erp.vo.TicketMovieInfo;

public class TicketMovieServiceImpl implements TicketMovieService{
	TicketMovieDAO tm = new TicketMovieDAOImpl();
	
	
	@Override
	public List<TicketMovieInfo> getTicketMovieList(TicketMovieInfo ti) throws SQLException {

		try {
			tm.setConnection(DBCon.getCon());
			return tm.selectTmList(ti);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
		
	}

	@Override
	public TicketMovieInfo getTicketMoviell(TicketMovieInfo ti) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
