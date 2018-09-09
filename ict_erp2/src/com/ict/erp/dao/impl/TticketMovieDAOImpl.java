package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TticketMovieDAO;
import com.ict.erp.vo.TicketMovie;
import com.ict.erp.vo.TticketMovie;

public class TticketMovieDAOImpl extends CommonDAOImpl implements TticketMovieDAO{

	@Override
	public List<TticketMovie> selectTicketList(TticketMovie tm) throws SQLException {
		String sql = "select * from ticket_movie";
		try {
			ps = con.prepareStatement(sql);
			/*ResultSet*/ rs = ps.executeQuery(); 
			List<TticketMovie> tList = new ArrayList<TticketMovie>();
			while(rs.next()) {
				TticketMovie ti = new TticketMovie(rs.getInt("tmNUm"),rs.getString("tmName"),rs.getInt("tmPrice"),
				rs.getString("tmStartDat"),rs.getString("tmEndDat"),rs.getString("tmCredat"),
				rs.getString("tmDesc"),rs.getInt("tmCnt"),rs.getString("tmImg"));
				tList.add(ti);
			}
		return tList;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	public static void main(String[] args) {
		TticketMovieDAO tdao = new TticketMovieDAOImpl();
		tdao.setConnection(DBCon.getCon());
		try {
			tdao.selectTicketList(null);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public TticketMovie selectTicket(TticketMovie tm) throws SQLException {
		String sql = "select * from ticket_movie there tmNum=?";
		//Connection con = DBCon.getCon();
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, tm.getTmNum());
			rs = ps.executeQuery();
			while(rs.next()) {
				TticketMovie tmo = new TticketMovie(rs.getInt("tmNum"),rs.getString("tmName"),rs.getInt("tmPrice"),
						rs.getString("tmStartDat"),rs.getString("tmEndDat"),rs.getString("tmCredat"),
						rs.getString("tmDesc"),rs.getInt("tmCnt"),rs.getString("tmImg"));
				return tmo;
			}
			return null;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
		

	}

	@Override
	public int insertTicketList(TticketMovie tm) throws SQLException {
		String sql = "insert into TticketMovie(tmNum,tmName,tmPrice,tmStartdat,tmEnddat,tmCredat,tmDesc,tmImg)";
		sql += "values(seq_tmNum.nextval,?,?,?,?,to_char(sysdate,'YYYYMMDD'),?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, tm.getTmName());
			ps.setInt(2, tm.getTmPrice());
			ps.setString(3, tm.getTmStartDat().replace("-", ""));
			ps.setString(4, tm.getTmEndDat().replace("-", ""));
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
	public int deleteTicketList(TticketMovie tm) throws SQLException {
		String sql = "delete from ticket_movie where tmNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, tm.getTmNum());
			return ps.executeUpdate();
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	@Override
	public int updateTicketList(TticketMovie tm) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
