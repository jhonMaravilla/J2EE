<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.prog32758.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<embed src="Sound/BacMusic.mp3" autostart="true" loop="true" width="0"
	height="0">
<title>Sheridan Jeopardy</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
<link href="https://fonts.googleapis.com/css?family=Cabin"
	rel="stylesheet">
</head>

<body>
	<div id="container">
		<div id="content">
			<%
				NewPlayer player = (NewPlayer) session.getAttribute("player");
			%>
			<center>
			<img src="Images/GameOver.png"> <br>
			<br>
			<p>
				Player
				<%= player.getName() %>
				has scored:
				<%= player.getScore() %>
			</p>					
			
			<form action="index.jsp">
				 <br> <br> <br> 
					<input type="submit" value="Play Again" class="submit" id="submit">
				</center>
			</form>
			
				<%
			    session.invalidate();
			    GameQuestions.answeredQuestion.clear();	
			    GameQuestions.question.clear();
			    %>	
		</div>
	</div>
</body>
</html>