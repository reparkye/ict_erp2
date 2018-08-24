package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.DepartDAO;
import com.ict.erp.vo.DepartInfo;

public class DepartDAOImpl implements DepartDAO {

	private Connection con = null;
	
	public void setConnection(Connection con) {
		this.con = con;
	}
	
	@Override
	public List<DepartInfo> selectDepartInfoList(DepartInfo di) throws SQLException {
		Connection con = DBCon.getCon();
		String sql = "select diNum, diCode, diName, diDesc from Depart_info";
		/*if(di!=null) {
			if(di.getDiName()!=null) {
				sql += "where diName like '%' || ? || '%'";
			}else {
				sql += "where diDesc like '%'|| ? || '%'";
			}
		}*/
		PreparedStatement ps = con.prepareStatement(sql);
		
		/*if(di!=null) {
			if(di.getDiName()!=null) {
				ps.setString(1, di.getDiName());
			}else {
				ps.setString(1, di.getDiDesc());
			}
		}*/
		ResultSet rs = ps.executeQuery();
		List<DepartInfo> diList = new ArrayList<DepartInfo>();
		while(rs.next()) {
			di = new DepartInfo(rs.getInt("diNum"), rs.getString("diCode"), rs.getString("diName"), rs.getString("diDesc"));
			diList.add(di);
		}
		DBCon.close();
		return diList;
	}

	@Override
	public DepartInfo selectDepartInfo(int diNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> inserDepartInfo(DepartInfo di) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> updateDepartInfo(DepartInfo di) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> deleteDepartInfo(DepartInfo di) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		
		System.out.println();
	}
}
