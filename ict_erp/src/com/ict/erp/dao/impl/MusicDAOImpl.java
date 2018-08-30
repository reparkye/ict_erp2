package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.MusicDAO;
import com.ict.erp.vo.MusicInfo;

public class MusicDAOImpl extends CommonDAOImpl implements MusicDAO{

	@Override
	public List<MusicInfo> selectMusicList(MusicInfo mi) throws SQLException {
		String sql = "select * from music_chart";
		List<MusicInfo> mcList = new ArrayList<MusicInfo>();

		try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()) {
			MusicInfo mc = new MusicInfo(rs.getInt("mcNum"),rs.getString("mcName"),
					rs.getString("mcSinger"),rs.getString("mcVendor"),rs.getInt("mcLike"),
					rs.getInt("mcDislike"),rs.getString("mcCredat"),rs.getString("mcDesc"));
			mcList.add(mc);
		}		
		return mcList;
	}catch(SQLException e) {
		throw e;
	}finally {
		close();
	}
	}
	
	
	@Override
	public MusicInfo selectMusicLL(MusicInfo mi) throws SQLException {
		String sql = "select * from music_chart where mcNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, mi.getMcNum());
			rs = ps.executeQuery();
			while(rs.next()) {
				MusicInfo mc = new MusicInfo(rs.getInt("mcNum"),rs.getString("mcName"),
						rs.getString("mcSinger"),rs.getString("mcVendor"),rs.getInt("mcLike"),
						rs.getInt("mcDislike"),rs.getString("mcCredat"),rs.getString("mcDesc"));
				return mc;
			}
			return null;
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		}
	}

	@Override
	public int insertMusicList(MusicInfo mi) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMusicList(MusicInfo mi) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMusicList(MusicInfo mi) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
	