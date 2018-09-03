package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TicketMovieDAO;
import com.ict.erp.vo.TicketMovie;

public class TicketMovieDAOImpl extends CommonDAOImpl implements TicketMovieDAO {
	
	@Override
	public List<TicketMovie> selectTmList(TicketMovie ti) throws SQLException {
		String sql = "select * from ticket_movie";
		try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		List<TicketMovie> tmList = new ArrayList<TicketMovie>();
		while(rs.next()) {
			TicketMovie tm = new TicketMovie(rs.getInt("tmNum"),rs.getString("tmName"),
					rs.getInt("tmPrice"),rs.getString("tmStartDat"),rs.getString("tmEndDat"),
					rs.getString("tmCredat"),rs.getString("tmDesc"),rs.getInt("tmCnt"),rs.getString("tmImg"));
			tmList.add(tm);
		}
		return tmList;
		
	}catch(SQLException e) {
		throw e;
		
	}finally {
		close();
	}
	}
	
	public static void main(String[] args) {
		TicketMovieDAO td = new TicketMovieDAOImpl();
		td.setConnection(DBCon.getCon());
		try {
			td.selectTmList(null);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public TicketMovie selectTm(TicketMovie ti) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
