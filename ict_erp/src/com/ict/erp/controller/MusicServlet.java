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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		
		try {
			if (cmd.equals("musicList")) {
				MusicInfo mi = new MusicInfo();
				request.setAttribute("musicList", ms.getmusicList(mi));

			} else if (cmd.equals("musicView")) {
				String mcNumStr = request.getParameter("mcNum");
				if (mcNumStr == null || mcNumStr.equals("")) {
					throw new SQLException("메뉴번호가 없다.");
				}
				MusicInfo mi = new MusicInfo();
				mi.setMcNum(Integer.parseInt(mcNumStr));
				
				request.setAttribute("mc", ms.getmusic(mi));
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		doService(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		
		try {
			if(cmd.equals("musicInsert")) {
				String mcName = request.getParameter("mcName");
				String mcSinger = request.getParameter("mcSinger");
				String mcVendor = request.getParameter("mcVendor");
				/*String mcLike = request.getParameter("mcLike");
				String mcDislike = request.getParameter("mcDislike");*/
				String mcCredat = request.getParameter("mcCredat");
				String mcDesc = request.getParameter("mcDesc");
				MusicInfo mi = new MusicInfo(null,mcName,mcSinger,mcVendor,0,0,mcCredat,mcDesc);
				request.setAttribute("mu", ms.insertMusic(mi));
			
			}else if(cmd.equals("musicDelete")) {
				String mcNum = request.getParameter("mcNum");
				MusicInfo mi = new MusicInfo(Integer.parseInt(mcNum),null,null,null,0,0,null,null);
				uri = "/music/musicView";

				request.setAttribute("rmusic",ms.deleteMusic(mi));

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		doService(request, response);
	}

	public void doService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		uri = "/views" + uri;
		RequestDispatcher rd = request.getRequestDispatcher(uri);
		rd.forward(request, response);
	}
}
