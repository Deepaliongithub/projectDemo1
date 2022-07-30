package July19.Ex3;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
public class SecondServlet extends HttpServlet
{  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
      
    //Getting the value from the hidden field  
    String n=request.getParameter("t2");  
    if(n==null)
    	out.print("Welcome New User !!!");
    else
    	out.print("I am Servlet 2  "+n);  

    out.close();  
    }
}