package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.TicketMovieDAO;
import com.ict.erp.vo.TicketMovieInfo;

public class TicketMovieDAOImpl extends CommonDAOImpl implements TicketMovieDAO {
	private Connection con;
	
	@Override
	public void setConnection(Connection con) {
		con = this.con;
		
	}

	@Override
	public int totalCount(String tableName) throws SQLException {
		
		
		return 0;
	}

	@Override
	public List<TicketMovieInfo> selectTmList(TicketMovieInfo ti) throws SQLException {
		String sql = "select * from ticket_movie";
		try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		List<TicketMovieInfo> tmList = new ArrayList<TicketMovieInfo>();
		while(rs.next()) {
			TicketMovieInfo tm = new TicketMovieInfo(rs.getInt("tmNum"),rs.getString("tmName"),
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
	@Override
	public TicketMovieInfo selectTm(TicketMovieInfo ti) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
