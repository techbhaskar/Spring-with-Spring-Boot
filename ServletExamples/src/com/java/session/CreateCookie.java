package com.java.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookie
 */
@WebServlet("/CreateCookie")
public class CreateCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateCookie() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create cookies for first and last names.      
	      Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
	      Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));

	      // Set expiry date after 24 Hrs for both the cookies.
	      firstName.setMaxAge(60*60*24);
	      lastName.setMaxAge(60*60*24);

	      // Add both the cookies in the response header.
	      response.addCookie( firstName );
	      response.addCookie( lastName );

	      // Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String title = "Setting Cookies Example";
	      String docType =
	         "<!DOCTYPE html>\n";
	      
	      out.println(docType +
	         "<html>\n" +
	            "<head>	               <title>" + title + "</title>	            </head>\n" +
	            
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  <li><b>First Name</b>: "
	                  + request.getParameter("first_name") + "\n" +
	                  "  <li><b>Last Name</b>: "
	                  + request.getParameter("last_name") + "\n" +
	               "</ul>\n" +
	            "</body>	         </html>"
	      );
	      out.println("<a href='http://localhost:8080/ServletExamples/ReadCookie'>ReadCookie</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
