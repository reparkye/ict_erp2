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
			request.setAttribute("chartList", ms.getSelectList(mi));
			
			}else if(cmd.equals("mMusicView")) {
				String mcNumStr = request.getParameter("mcNum");
				MmusicInfo mi = new MmusicInfo();
				mi.setMcNum(Integer.parseInt(mcNumStr));
				request.setAttribute("mu", ms.getSelect(mi));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
		doService(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		try {
			if(cmd.equals("mMusicInsert")) {
				String mcName = request.getParameter("mcName");
				String mcSinger = request.getParameter("mcSinger");
				String mcVendor = request.getParameter("mcVendor");
				String mcCredat = request.getParameter("mcCredat");
				String mcDesc = request.getParameter("mcDesc");
				MmusicInfo mi = new MmusicInfo(null,mcName,mcSinger,mcVendor,0,0,mcCredat,mcDesc);
				request.setAttribute("mmi", ms.getInsert(mi));
				
			}else if(cmd.equals("mMusicDelete")) {
				String mcNum = request.getParameter("mcNum");
				MmusicInfo mi = new MmusicInfo(Integer.parseInt(mcNum),null,null,null,0,0,null,null);
				uri = "/mMusic/mMusicView";
				request.setAttribute("mmi", ms.getDelete(mi));
			
			}else if(cmd.equals("mMusicUpdate")) {
				
				String mcNum = request.getParameter("mcNum");
				String mcName = request.getParameter("mcName");
				String mcSinger = request.getParameter("mcSinger");
				String mcVendor = request.getParameter("mcVendor");
				String mcCredat = request.getParameter("mcCredat");
				String mcDesc = request.getParameter("mcDesc");
			
				MmusicInfo mi = new MmusicInfo(Integer.parseInt(mcNum),mcName,mcSinger,mcVendor,0,0,mcCredat,mcDesc);
				uri = "/mMusic/mMusicView";
				request.setAttribute("mmi", ms.getupdate(mi));
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		doService(request,response);
	}
	
	
	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = "/views" + uri;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
		
	}
}
