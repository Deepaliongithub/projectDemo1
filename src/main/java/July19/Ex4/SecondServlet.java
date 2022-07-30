package July19.Ex4;
import java.sql.Timestamp;   
import java.io.*;

import java.util.Date;

import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response)  {
        try{  
  
        	System.out.println("Inside servlet 2");
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
        HttpSession obj=request.getSession(false);
        if(obj==null)
        {
        	request.getSession().setAttribute("y", request.getParameter("t1"));
        	long t=request.getSession().getCreationTime();
        	Timestamp ts=new Timestamp( t); 
        	out.print((String)request.getSession().getId()+ " Session Created at"+ts);
        }
        else {
        String val=(String) obj.getAttribute("x");
        out.print("Session Created ...");
        System.out.println(val);
        }
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  