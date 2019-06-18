package pgmonServlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServletDemo extends HttpServlet {

   private String mymsg;

   public void init() throws ServletException
   {
      mymsg = "Hello World!";
   }

   public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException 
   {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<h1>" + mymsg + "</h1>");
   }

   public void destroy()
   {
	   
   }
}