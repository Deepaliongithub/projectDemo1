package com.varsha.Addpkg;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddTwoNo extends HttpServlet{

	public void doGet(HttpServletRequest hreq,HttpServletResponse hrsp) 
			throws IOException,ServletException
	{
		String s1=hreq.getParameter("a");
		String s2=hreq.getParameter("b");
		int no1=Integer.parseInt(s1);
		int no2=Integer.parseInt(s2);
		
		hrsp.setContentType("text/html");
		PrintWriter p=hrsp.getWriter();
		p.print("Addition is "+(no1+no2));
		
	}
}
