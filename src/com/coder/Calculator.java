package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String opt=request.getParameter("opt");
		String num1=request.getParameter("num1");
		String num2=request.getParameter("num2");
		Integer i1=Integer.parseInt(num1);
		Integer i2=Integer.parseInt(num2);
		if(opt.equalsIgnoreCase("add"))
		{
			int res=i1+i2;
			pw.print("Result:"+res);
		}
		else if(opt.equalsIgnoreCase("sub"))
		{
			int res=i1-i2;
			pw.print("Result:"+res);
		}
		else if(opt.equalsIgnoreCase("mul"))
		{
			int res=i1*i2;
			pw.print("Result:"+res);
		}
		else if(opt.equalsIgnoreCase("div"))
		{
			int res=i1/i2;
			pw.print("Result:"+res);
		}
		else 
		{
			
			pw.print("Please Select Valid Option!!!");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
					
		}
		
	}

}
