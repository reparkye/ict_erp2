package com.ict.erp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.MusicService;
import com.ict.erp.service.impl.MusicServiceImpl;
import com.ict.erp.vo.MusicInfo;


public class MusicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MusicService ms = new MusicServiceImpl();
    private String uri;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		response.setContentType("text/html);charset=uft-8");
		PrintWriter pw = response.getWriter();
		try {
			if(cmd.equals("musicList")) {
			request.setAttribute("musicList",ms.getmusicList(null));
			
			}else if(cmd.equals("musicView")) {
				String mcNumStr = request.getParameter("mcNum");
				if(mcNumStr==null || mcNumStr.equals("")) {
					throw new SQLException("메뉴번호가 없다.");
				}
				MusicInfo mi = new MusicInfo();
				mi.setMcNum(Integer.parseInt(mcNumStr));
				pw.print(ms.getmusic(mi));
			}	
		}catch(SQLException e) {
				pw.print("에러발생");
				pw.print("에러이유는" + e);
				throw null;
			}
		doService(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 uri = "/views" + uri;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
}
}

