package com.prog32758;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckBet")
public class CheckBet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckBet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("QuestionSelect.jsp");
		RequestDispatcher rd2 = request.getRequestDispatcher("BonusPage.jsp");

		NewPlayer player = (NewPlayer) request.getSession().getAttribute("player");
		
		try {
			int validate = Integer.parseInt(request.getParameter("bet"));
		} catch(NumberFormatException ex) {
			request.setAttribute("invalid", "Invalid Bet, please try again");
			rd2.forward(request, response);
		}
		
		int bet = Integer.parseInt(request.getParameter("bet"));

			if (player.getScore() < 1000) {
				if (bet <= 1000 && bet > 0) {
					request.setAttribute("bet", bet);
					rd.forward(request, response);
				} else {
					request.setAttribute("invalid", "Invalid Bet, please try again");
					rd2.forward(request, response);
				}
			}

			else if (player.getScore() >= 1000) {
				if (bet <= player.getScore() && bet > 0) {
					request.setAttribute("bet", bet);
					rd.forward(request, response);
				} else {
					request.setAttribute("invalid", "Invalid Bet, please try again");
					rd2.forward(request, response);
				}

			}
		
			
		 

	}

}
