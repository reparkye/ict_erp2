package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.musicDAO;
import com.ict.erp.dao.impl.musicDAOImpl;
import com.ict.erp.service.musicService;
import com.ict.erp.vo.musicInfo;

public class musicServiceImpl implements musicService {
		musicDAO mdao = new musicDAOImpl();
	
	@Override
	public List<musicInfo> getmusicList(musicInfo mi) throws SQLException {
			mdao.setConnection(DBCon.getCon());
		
			return mdao.selectMusicList(mi);
	}

}
