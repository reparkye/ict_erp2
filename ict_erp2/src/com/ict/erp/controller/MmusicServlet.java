package com.ict.erp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.MmusicService;
import com.ict.erp.service.impl.MmusicServiceImpl;
import com.ict.erp.vo.MmusicInfo;


public class MmusicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MmusicService ms = new MmusicServiceImpl();
    private String uri;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		try {
			if(cmd.equals("mMusicList")) {
				MmusicInfo mi = new MmusicInfo();
				request.setAttribute("tList", ms.getSelectMmusicList(mi));
			}else if(cmd.equals("mMusicview")) {
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
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
