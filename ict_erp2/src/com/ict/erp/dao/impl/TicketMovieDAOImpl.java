package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.TicketMovieDAO;
import com.ict.erp.vo.TicketMovie;

public class TicketMovieDAOImpl extends CommonDAOImpl implements TicketMovieDAO {

	@Override
	public List<TicketMovie> selectTicketList(TicketMovie tm) throws SQLException {
		String sql = "select * from ticket_movie";
		try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		List<TicketMovie> tList = new ArrayList<TicketMovie>();
		while(rs.next()) {
			TicketMovie tim = new TicketMovie(rs.getInt("tmNum"),rs.getString("tmName"),rs.getInt("tmPrice"),
					rs.getString("tmStartDat"),rs.getString("tmEndDat"),rs.getString("tmCredat"),
					rs.getString("tmDesc"),rs.getInt("tmCnt"),rs.getString("tmImg"));
					
			tList.add(tim);
		}
			return tList;

	}catch(SQLException e) {
		throw e;
	}finally {
		close();
	}
		
	}
	
	@Override
	public TicketMovie selectTicket(TicketMovie tm) throws SQLException {
		String sql = "select * from ticket_movie where tmnum=?";
		try {
		ps = con.prepareStatement(sql);
		ps.setInt(1, tm.getTmNum());
		rs = ps.executeQuery();
		while(rs.next()) {
			TicketMovie tim = new TicketMovie(rs.getInt("tmNum"),rs.getString("tmName"),rs.getInt("tmPrice"),
					rs.getString("tmStartDat"),rs.getString("tmEndDat"),rs.getString("tmCredat"),
					rs.getString("tmDesc"),rs.getInt("tmCnt"),rs.getString("tmImg"));
			return tim;
		}
		return null;
	}catch(SQLException e) {
		throw e;
	}finally {
		close();
	}
	}
	@Override
	public int insertTicketList(TicketMovie tm) throws SQLException {
		String sql = "insert into ticket_movie(tmNum , tmName, tmPrice,"
				+ "tmStartdat,tmEnddat, tmCredat, tmDesc, tmImg)" +
					" values(seq_tmnum.nextVal,?,?,?,?,to_char(sysdate,'YYYYMMDD'),?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, tm.getTmName());
			ps.setInt(2, tm.getTmPrice());
			ps.setString(3, tm.getTmStartDat().replace("-",""));
			ps.setString(4, tm.getTmEndDat().replace("-",""));
			ps.setString(5, tm.getTmDesc());
			ps.setString(6, tm.getTmImg());
			return ps.executeUpdate();
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
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
