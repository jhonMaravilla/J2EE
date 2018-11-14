package com.prog32758;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/nonIntelligentMethod")
public class nonIntelligentMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public nonIntelligentMethod() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("nonIntelligentRedirect");
	}

}
