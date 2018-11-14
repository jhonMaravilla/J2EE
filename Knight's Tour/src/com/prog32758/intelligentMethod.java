package com.prog32758;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/intelligentMethod")
public class intelligentMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public intelligentMethod() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				RequestDispatcher rd = request.getRequestDispatcher("intelligentDispatcher");
				rd.forward(request,response);
	}

}
