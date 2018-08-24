package com.ict.erp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.DepartService;
import com.ict.erp.service.impl.DepartServiceImpl;
import com.ict.erp.vo.DepartInfo;

@WebServlet(
			urlPatterns = "/depart/*",   /*s로 끝나므로 복수 즉 배열*/
			name="DepartServlet"
		)
public class DepartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private DepartService ds = new DepartServiceImpl();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		uri = "/views" + uri;
		try {
			if(cmd.equals("departList")) {
				DepartInfo di = new DepartInfo();
				req.setAttribute("diList", ds.getDepartInfoList(di));
		}else if(cmd.equals("depart")) {
		
		}else {
			
		}
		} catch(SQLException e) {
			e.printStackTrace();	
		}
			doService(req,res);

		}	
		
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doService(req,res);
	}
	
	
	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri ="/views" + req.getRequestURI();
		RequestDispatcher rd = req.getRequestDispatcher(uri);
		rd.forward(req, res);
	}
}