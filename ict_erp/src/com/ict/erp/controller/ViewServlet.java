package com.ict.erp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;


public class ViewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
				/*uri = uri.replaceFirst(request.getContextPath(), "");
				uri = ICTUtils.getJSPPage(uri);*/
		uri = "/WEB-INF" + uri + ".jsp";
		System.out.println(request.getAttribute("str"));
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);   				/*jsp로 호출 보내는것*/
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
