package com.prog32758;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginSession")
public class LoginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginSession() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		RequestDispatcher rd = request.getRequestDispatcher("GameBoard.jsp");
		
		// Initialization of session, instantiate player and gameQuestions as well as loading the questions
		String name = request.getParameter("name");
		HttpSession session = request.getSession();
		
		NewPlayer player = new NewPlayer();
		player.setName(name);
		player.setScore(0);
		
		// setting a Player object attribute to be passed to GameBoard
		session.setAttribute("player", player);
		
		GameQuestions gameQuestion = new GameQuestions();
		gameQuestion.loadQuestions();
		
	
		
		Random rand = new Random();
		int bonus1 = rand.nextInt(25);
		int bonus2 = rand.nextInt(25);
		int checkBonus = bonus2;
		while(checkBonus == bonus1) {
			bonus2 = rand.nextInt(25);
			checkBonus = bonus2;
		}
		
		session.setAttribute("bonus1", bonus1);
		session.setAttribute("bonus2", bonus2);
		
		
		rd.forward(request,response);
	}

}
