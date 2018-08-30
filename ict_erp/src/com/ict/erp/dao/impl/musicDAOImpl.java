package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.musicDAO;
import com.ict.erp.vo.musicInfo;

public class musicDAOImpl extends CommonDAOImpl implements musicDAO{
	//private static String Select_MUSIC_LIST = "select * from music_chart";

	@Override
	public List<musicInfo> selectMusicList(musicInfo mi) throws SQLException {
		String sql = "select * from music_chart";
		try {
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		List<musicInfo> mcList = new ArrayList<musicInfo>();
		while(rs.next()) {
			musicInfo mc = new musicInfo(rs.getInt("mcNum"),rs.getString("mcName"),
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
	public musicInfo selectMusicLL(musicInfo mi) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMusicList(musicInfo mi) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMusicList(musicInfo mi) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMusicList(musicInfo mi) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
	