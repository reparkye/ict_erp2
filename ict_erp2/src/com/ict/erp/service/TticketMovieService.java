package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TticketMovie;

public interface TticketMovieService {

	public List<TticketMovie> getSelectMovieList(TticketMovie tm)throws SQLException;
	public TticketMovie getSelectMovie(TticketMovie tm)throws SQLException;
	public int getInsertMovie(TticketMovie tm)throws SQLException;
	public int getDeleteMovie(TticketMovie tm)throws SQLException;
}
