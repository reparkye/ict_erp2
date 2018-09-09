package com.ict.erp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.TticketMovieService;
import com.ict.erp.service.impl.TticketMovieServiceImpl;
import com.ict.erp.vo.TticketMovie;


public class TticketMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private TticketMovieService ts = new TticketMovieServiceImpl();
	private String uri;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		
		try {
			if(cmd.equals("tTicketMovieList")) {
				
				TticketMovie tm = new TticketMovie();
				request.setAttribute("tList", ts.getSelectMovieList(tm));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		doService(request,response);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		try {
			if(cmd.equals("tTicketMovieInsert")) {
				if(!ServletFileUpload.isMultipartContent(request)) {
					throw new ServletException("적합하지 않는다.");
				}
				DiskFileItemFactory dfFactory = new DiskFileItemFactory();
				
				ServletFileUpload sfu = new ServletFileUpload(dfFactory);
				sfu.setHeaderEncoding("utf-8");
				sfu.setSizeMax();
				sfu.setFileSizeMax();
				
			}
		}*/
		
		
		doService(request, response);
	}
	
	protected void doService (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri = "views" + uri;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
		
	}
}
