package July19.Ex5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//   "+str+"
/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String str=request.getParameter("t1");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.append("Welcome "+str) ;
		out.append("<a href='SecondServlet?t1="+str+"'>"+"Go to second servlet"+"</a>");
	}

}
