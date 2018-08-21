package com.ict.erp.common;

public class ICTUtils {
	private static final String PRE_FIX = "/WEB-INF";
	private static final String SUF_FIX = ".jsp";
	private static final String SEP_STR = "/";

	public static String getCmd(String uri) {
		int idx = uri.lastIndexOf(SEP_STR);      //留덉�留� / 湲곗��쑝濡� �옄瑜대뒗寃� 
		if(idx == -1) {								
			return null;
		}
		return uri.substring(idx+1);
	}
	public static String getJSPPage(String uri) {
		return PRE_FIX + uri + SUF_FIX;             ///WEB-INF/views +uri +
		
	}
	
	
}


/*//
public class ICTUtils {
	public static String getCmd(String uri){
	int idx = uri.lastIndex("/");
	if(idx == -1){
	return null;
	}
	return uri.substring(idx+1);
}}

//*/