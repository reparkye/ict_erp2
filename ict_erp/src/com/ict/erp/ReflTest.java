package com.ict.erp;

import java.lang.reflect.Method;

public class ReflTest {

	public static void main(String[] args) {
		String classPath = "com.ict.erp.Person";  //현재 펄슨의 위치
		try {
			Class clazz = Class.forName(classPath);
			Object obj  = clazz.newInstance();  		// 빨간줄 나옴 2번째?
			System.out.println(obj);
			Method[] methods = clazz.getMethods();		// import 리플렉트로 해준다. 
			for(Method meth : methods) {
				System.out.println(meth.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
