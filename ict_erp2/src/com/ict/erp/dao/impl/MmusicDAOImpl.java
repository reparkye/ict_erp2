package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MmusicDAO;
import com.ict.erp.vo.MmusicInfo;

public class MmusicDAOImpl extends CommonDAOImpl implements MmusicDAO {

	@Override
	public List<MmusicInfo> selectMmusicList(MmusicInfo mi) throws SQLException {
		String sql = "select * from music_chart";
		try {
			ps= con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<MmusicInfo> mList = new ArrayList<MmusicInfo>();
			while(rs.next()) {
				MmusicInfo min = new MmusicInfo(rs.getInt("mcNum"),rs.getString("mcName"),rs.getString("mcSinger"),
						rs.getString("mcVendor"),rs.getInt("mcLike"),rs.getInt("mcDisLike"),rs.getString("mcCredat"),rs.getString("mcDesc"));
						mList.add(min);
			}
				return mList;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}
	
	
	public static void main(String[] args) {
		MmusicDAO mdao = new MmusicDAOImpl();
		try {
			mdao.setConnection(DBCon.getCon());
			mdao.selectMmusicList(null);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public MmusicInfo selectMmusic(MmusicInfo mi) throws SQLException {
		String sql = "select * from music_chart where mcNum=?";
		try {
			ps= con.prepareStatement(sql);
			ps.setInt(1, mi.getMcNum());
			rs = ps.executeQuery();
			while(rs.next()) {
				MmusicInfo min = new MmusicInfo(rs.getInt("mcNum"), rs.getString("mcName"),rs.getString("mcSinger"),
						rs.getString("mcVendor"),rs.getInt("mcLike"),rs.getInt("mcDisLike"),rs.getString("mcCredat"),rs.getString("mcDesc"));
				return min;
			}
			return null;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}
		

	@Override
	public int insertList(MmusicInfo mi) throws SQLException {
		String sql = "insert into music_chart(mcNum,mcName,mcSinger,mcVendor,mcLike,mcDisLike,mcCredat,mcDesc)";
		sql += "values(seq_mcnum.nextval,?,?,?,0,0,?,?)";
		try {
				ps = con.prepareStatement(sql);
				ps.setString(1, mi.getMcName());
				ps.setString(2, mi.getMcSinger());
				ps.setString(3, mi.getMcVendor());
				ps.setInt(4, mi.getMcLike());
				ps.setInt(5, mi.getMcDisLike());
				ps.setString(6, mi.getMcCredat());
				ps.setString(7, mi.getMcDesc());
			return ps.executeUpdate();
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}
			
		
	@Override
	public int deleteList(MmusicInfo mi) throws SQLException {
		String sql = "delete from music_chart where mcNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, mi.getMcNum());
			return ps.executeUpdate();
			
			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
		
	}
		
	@Override
	public int updateList(MmusicInfo mi) throws SQLException {
	String sql = "update music_chart set mcName=?, mcSinger=?, mcVendor=?, mcCredat=?, mcDesc=? where mcNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, mi.getMcName());
			ps.setString(2, mi.getMcSinger());
			ps.setString(3, mi.getMcVendor());
			ps.setString(4, mi.getMcCredat());
			ps.setString(5, mi.getMcDesc());
			ps.setInt(6, mi.getMcNum());
			return ps.executeUpdate();
			
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}	
	}
}
