package com.prog32758;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Answer")
public class Answer extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Answer() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("GameBoard.jsp");
		
		out.println("</br>");
		String category = (String)request.getSession().getAttribute("category");
		String value = (String)request.getSession().getAttribute("value");
		String answer = (String) request.getParameter("select");
		int value2 = Integer.parseInt(value);
		int index = (Integer)request.getSession().getAttribute("index");
		String betValue;
		int value3 = 0;
		
		out.println(category);
		out.println(value);
		out.println(answer);
		out.println(value2);
		out.println(index);
		GameQuestions.question.get(index).getCorrectAnswer();
		out.print(GameQuestions.question.get(index).getCorrectAnswer());
		
		if(request.getSession().getAttribute("bet") != null) {
			betValue = (String)request.getSession().getAttribute("bet");
			value3 = Integer.parseInt(betValue);
		}
		
		if(GameQuestions.question.get(index).getCorrectAnswer().equals(answer)) {
			if((Integer)request.getSession().getAttribute("bonus1") == index || (Integer)request.getSession().getAttribute("bonus2") == index) {
				request.setAttribute("score", value3);
				GameQuestions.answeredQuestion.add(category + value);
				request.getSession().setAttribute(category + value, "disabled=\"disabled\" style=\"opacity: .5; text-decoration: line-through;\" id=\"noHover\"");	
			}
			else {
				request.setAttribute("score", value2);
				GameQuestions.answeredQuestion.add(category + value);
				request.getSession().setAttribute(category + value, "disabled=\"disabled\" style=\"opacity: .5; text-decoration: line-through;\" id=\"noHover\"");
			}
		} else { 
			if((Integer)request.getSession().getAttribute("bonus1") == index || (Integer)request.getSession().getAttribute("bonus2") == index) {
				request.setAttribute("score", -(value3));
				GameQuestions.answeredQuestion.add(category + value);
				request.getSession().setAttribute(category + value, "disabled=\"disabled\" style=\"opacity: .5; text-decoration: line-through;\" id=\"noHover\"");	
			} else {
				request.setAttribute("score", -(value2));
				GameQuestions.answeredQuestion.add(category + value);
				request.getSession().setAttribute(category + value, "disabled=\"disabled\" style=\"opacity: .5; text-decoration: line-through;\" id=\"noHover\"");
			}
			
		}
		
		rd.forward(request, response);

	}
}
