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
		<!-- Delete session and clear ArrayList -->
		<%
			session.invalidate();
			GameQuestions.answeredQuestion.clear();
			GameQuestions.question.clear();
		%>
		<div id="content">
			<p>
				<b> Sheridan Jeopardy </b>
			</p>
			<br> <br>
			<form action="LoginSession" method="post">
				<center>
					<input type="text" name="name" placeholder="Enter your name"
						class="name" id="name" autofocus> <br> <br> <br>
					<input type="submit" value="Play Now" class="submit" id="submit">
				</center>
			</form>
		</div>
	</div>

</body>

<script>
	// Checks if the textbox is empty.
	document.getElementById("submit").onclick = function() {
		var name = document.getElementById("name");
		if (name.value.length == 0 || name.value == " ") {
			name.style.border = "5px solid red";
			name.placeholder = "This is a Required Field!";
			name.focus();
			return false;
		}
	}
</script>
</html>