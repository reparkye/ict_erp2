package com.ict.erp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AuthFilter implements Filter {
	private Log log = LogFactory.getLog(this.getClass());
  
    public AuthFilter() {
    	
       
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest)request;
		HttpSession hs = hsr.getSession();
		//1.트레이스   연계되는것			가장높다.
		log.trace(hsr.getRequestURI());
		//2.디버그
		log.debug(hsr.getRequestURI());
		//3.인포		운영할때 필요한정보
		log.info(hsr.getRequestURI());
		//4.워닝		좀지켜주었으면 좋겠을...
		log.warn(hsr.getRequestURI());
		//5.에러		exception 안될때
		log.error(hsr.getRequestURI());
		//6.겁나심각한에러		(치명적인)심각한      가장 낮다.
		log.fatal(hsr.getRequestURI());
		if(hs.getAttribute("user")!=null) {
			//TDOD 권한처리 필요.(로그인 페이지 이동 로직추가 필요)
			System.out.println("너 권한없음");
		}
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
