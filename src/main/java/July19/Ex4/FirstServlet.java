package July19.Ex4;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class FirstServlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        	System.out.println("Inside servlet 1 ");
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("t1");  
        out.print("Welcome "+n);  
          
        HttpSession obj=request.getSession(true);  
        obj.setAttribute("x",n);  
        System.out.println("Session Object set as "+obj.getAttribute("x"));
       // out.print("<a href='hs2'>visit</a>");  
                  
        out.print("<form action='hs2'>");  
		out.print("<input type='submit' value='go'>");  
		out.print("</form>");  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
}  
