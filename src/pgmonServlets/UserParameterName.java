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
 * Servlet implementation class UserParameterName
 */
@WebServlet("/UserParameterName")
public class UserParameterName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserParameterName()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
       response.setContentType("text/html");
       PrintWriter pw = response.getWriter();
       
       Enumeration en=request.getParameterNames();
       while(en.hasMoreElements())
       {
    	   String pname=(String)en.nextElement();
    	   String pvalue=request.getParameter(pname);
    	   
    	   pw.println("Parameter Name:" +pname);
    	   pw.println(" Parameter Value:" +pvalue);
    	   pw.println("<br>");
       }
       pw.close();
	}
}
