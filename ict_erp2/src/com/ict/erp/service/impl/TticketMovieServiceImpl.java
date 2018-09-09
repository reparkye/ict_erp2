package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TticketMovieDAO;
import com.ict.erp.dao.impl.TticketMovieDAOImpl;
import com.ict.erp.service.TticketMovieService;
import com.ict.erp.vo.TticketMovie;

public class TticketMovieServiceImpl implements TticketMovieService {
	private TticketMovieDAO tdao = new TticketMovieDAOImpl();
	
	@Override
	public List<TticketMovie> getSelectMovieList(TticketMovie tm) throws SQLException {
		tdao.setConnection(DBCon.getCon());
		try {
			return tdao.selectTicketList(tm);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}
	
	public static void main(String[] args) {
		TticketMovieService ts = new TticketMovieServiceImpl();
		
		try {
			System.out.println(ts.getSelectMovieList(null));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public TticketMovie getSelectMovie(TticketMovie tm) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInsertMovie(TticketMovie tm) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDeleteMovie(TticketMovie tm) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
