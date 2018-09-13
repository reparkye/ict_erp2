package com.ict.erp.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/json/*")
public class JsonFilter implements Filter {
	
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		//Enumeration<String> headerNames = req.getHeaderNames();	
		String contenType = req.getHeader("content-type");
		String method = req.getMethod();
		if(contenType!=null) {
			System.out.println("contentType :" + contenType);
			System.out.println("method :" + method);
		}
		/*while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String header = req.getHeader(headerName);
			System.out.println(headerName + " : " + header);*/
		
		chain.doFilter(request, response);
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}