package pgmonServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderInformation
 */
@WebServlet("/HeaderInformation")
public class HeaderInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeaderInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw = response.getWriter();
		pw.println("HTTP header Information:<br>");
		
		Enumeration en = request.getHeaderNames();
		while(en.hasMoreElements())
		{
			String hName = (String)en.nextElement();
	        String hValue = request.getHeader(hName);
	        pw.println("<br>"+hName+":"+hValue + "<br>");
	     }
	  }
}