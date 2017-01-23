package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter())
		{
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String pass = request.getParameter("pass");
			
			try
			{
				if(fname != null && lname!= null && email!=null && pass!= null)
				{
					if(fname.equals("Aman") && lname.equals("Sharma") && email.equals("wimoxez") && pass.equals("systems"))
					{
						response.sendRedirect("Login.jsp");
					}
					else
					{
						out.println("Login failed");
					
					}
				}
			}
			
			catch(Exception e)
			{
				
				out.println("Error:"+e.getMessage());
			}
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
