package com.benz.sort;

import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) {
//int i =1;
//i=get(i++);
//System.out.println(i);
//	}
//	public static int get(int i)
//	{
//		i++;
//		return i;
		System.out.println(System.getProperty("line.separator").length());
byte[] bytes;
try {
	bytes = "ÄãºÃ".getBytes("utf-8");
	System.out.println(bytes.length+":"+"ÄãºÃ".length());
} catch (UnsupportedEncodingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
