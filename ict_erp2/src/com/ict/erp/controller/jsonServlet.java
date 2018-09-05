package com.ict.erp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ict.erp.service.LevelService;
import com.ict.erp.service.MusicService;
import com.ict.erp.service.impl.LevelServiceImpl;
import com.ict.erp.service.impl.MusicServiceImpl;
import com.ict.erp.vo.LevelInfo;
import com.ict.erp.vo.MusicInfo;

/**
 * Servlet implementation class jsonServlet
 */
@WebServlet(
		urlPatterns ="/json/*"
		)
public class jsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Gson gs = new Gson();  
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String,String> pMap = gs.fromJson(request.getParameter("param"),Map.class);
		System.out.println(pMap);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		LevelService ls = new LevelServiceImpl();
		try {
		List<LevelInfo> LevelList = ls.getLiList(null);
		String resStr = gs.toJson(LevelList);
		pw.println(resStr);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String> pMap = gs.fromJson(request.getParameter("param"),Map.class);
		System.out.println(pMap);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = response.getWriter();
		MusicService ms = new MusicServiceImpl();
		try {
		List<MusicInfo> MusicList = ms.getMusicList(null);
		String resStr = gs.toJson(MusicList);
		pw.println(resStr);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

		
		/*doGet(request, response);*/
	}
	
	/*public static void main(String[] args) {
		String jsonStr =
		Gson gs = new Gson
	}
	
	
	*/

