package com.prog32758;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nonIntelligentRedirect")
public class nonIntelligentRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public nonIntelligentRedirect() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = getServletContext().getRealPath("/JhonMaravillaNonIntelligentMethod.txt");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><h3> File Location: " +  path + "</h3></html>");	
	}

}
