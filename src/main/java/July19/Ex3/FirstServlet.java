package July19.Ex3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str=req.getParameter("t1");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("Welcome "+str);
		
		out.print("<form action='hf2'>");  
		out.print("<input type='hidden' name='t2' value='"+str+"'>");  
		out.print("<input type='submit' value='go'>");  
		out.print("</form>");  
		
	}
	

}
