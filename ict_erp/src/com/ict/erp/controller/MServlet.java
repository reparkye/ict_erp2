package com.ict.erp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns="/mm/*",
		name = "MServlet",
		loadOnStartup=1
		)
public class MServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		
		System.out.println(uri);
		
		int l = uri.lastIndexOf("/")+1;
		
		String cmd = uri.substring(l, uri.length());
		
		System.out.println(cmd);
		
		uri = "/WEB-INF" + uri + ".jsp";
		
		System.out.println(uri);
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
