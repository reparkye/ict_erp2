package com.ict.erp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.TmenuService;
import com.ict.erp.service.impl.TmenuServiceImpl;
import com.ict.erp.vo.TmenuInfo;


public class TmenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TmenuService ts = new TmenuServiceImpl();   
    private String uri ;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		try {
			if(cmd.equals("TmenuList")) {
				TmenuInfo tti = new TmenuInfo();
				request.setAttribute("tl", ts.getSelectList(tti));
			}else if(cmd.equals("TmenuView")) {
				//String meiNum = request.getParameter("meiNum");
					String meiNum = request.getParameter("meiNum");
				TmenuInfo tti = new TmenuInfo();
				//tti.setMeiNum(Long.parseLong(meiNum));
				tti.setMeiNum(Long.parseLong(meiNum));
				request.setAttribute("mei", ts.getSelect(tti));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		doService(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doService(request,response);
	}
	
	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = "/views" + uri;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}
}
