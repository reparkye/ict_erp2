package com.ict.erp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.TicketMovieService;
import com.ict.erp.service.impl.TicketMovieServiceImpl;
import com.ict.erp.vo.TicketMovieInfo;


public class TicketMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TicketMovieService ts = new TicketMovieServiceImpl();   
	private String uri;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		
		try {
			if(cmd.equals("TicketMovieList")) {
				TicketMovieInfo ti = new TicketMovieInfo();
				request.setAttribute("ticketList", ts.getTicketMovieList(ti));
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
		rd.forward(request,response);
		
	}
}
