package com.wipro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquaringServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int k = Integer.parseInt(request.getParameter("k"));

		k = k * k;
		PrintWriter out = response.getWriter();

		out.println("Result is : " + k);
		
		System.out.println("This Servlet Sq is Called");
	}
}
