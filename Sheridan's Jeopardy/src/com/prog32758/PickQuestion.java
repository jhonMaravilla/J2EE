package com.prog32758;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;


@WebServlet("/PickQuestion")
public class PickQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PickQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
	
		Enumeration pickedQuestion = request.getParameterNames();

		while(pickedQuestion.hasMoreElements()) {
			
			int index = 0;
			int bonus1 = (Integer)request.getSession().getAttribute("bonus1");
			int bonus2 = (Integer)request.getSession().getAttribute("bonus2");
			
			Object obj = pickedQuestion.nextElement();
			
			
			String param = (String)obj;
			String value = request.getParameter(param);
			
			request.getSession().setAttribute("category", param);
			request.getSession().setAttribute("value",value);
			
			for(int x = 0; x < GameQuestions.question.size(); x++){
	            String category = GameQuestions.question.get(x).getCategory();
	            int catValue = GameQuestions.question.get(x).getValue();
	            if(category.equals(param) && catValue == Integer.parseInt(value)){
	                index = x;
	            }
	        }
			
			request.getSession().setAttribute("index", index);
			request.getSession().setAttribute("catQuestion", GameQuestions.question.get(index).getQuestion());
			request.getSession().setAttribute("answer1", GameQuestions.question.get(index).getAnswer1());
			request.getSession().setAttribute("answer2", GameQuestions.question.get(index).getAnswer2());
			request.getSession().setAttribute("answer3", GameQuestions.question.get(index).getAnswer3());
			request.getSession().setAttribute("answer4", GameQuestions.question.get(index).getAnswer4());
			request.getSession().setAttribute("correctAnswer", GameQuestions.question.get(index).getCorrectAnswer());
			
			if(index == bonus1 || index == bonus2) {
				RequestDispatcher rd = request.getRequestDispatcher("BonusPage.jsp");
				rd.forward(request, response);
			}else {
				RequestDispatcher rd = request.getRequestDispatcher("QuestionSelect.jsp");
				rd.forward(request, response);
			}
			

		}
			
		
	}

}
