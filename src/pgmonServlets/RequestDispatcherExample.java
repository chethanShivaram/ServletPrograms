package pgmonServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class a
 */
@WebServlet("/RequestDispatcherExample")
public class RequestDispatcherExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDispatcherExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{	
		    String name=request.getParameter("username");
			String pass=request.getParameter("password");
			PrintWriter pw = response.getWriter();
			if(name.equals("chethan") && pass.equals("chethan123"))
			{
				RequestDispatcher dis = request.getRequestDispatcher("WelcomeUser");
				dis.forward(request, response);
			}
			else
			{	    
				RequestDispatcher dis = request.getRequestDispatcher("userrequest.html");
				dis.include(request, response);
				pw.print("User name or password is incorrect!");  
			}
		}
}
