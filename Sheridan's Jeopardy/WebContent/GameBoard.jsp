<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.prog32758.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Sheridan Jeopardy</title>
<link rel="stylesheet" type="text/css" href="CSS/style2.css">
<link href="https://fonts.googleapis.com/css?family=Cabin"
	rel="stylesheet">
</head>

<body>
	<%
		// Creating an instance of a player with the value of the session Player object we created in loginSession Servlet
		NewPlayer player = (NewPlayer) session.getAttribute("player");

		// Add or minus score to the object's score
		if (request.getAttribute("score") != null) {
			int score = (Integer) request.getAttribute("score");
			player.setScore(score + player.getScore());
		}

		// If all 25 questions are answered, game will be redirected to the EndGame page
		if (GameQuestions.answeredQuestion.size() == 25) {
			request.getRequestDispatcher("EndGame.jsp").forward(request, response);
		}
	%>
	<div id="container">
		<div id="header">
			<p>
				Player name:
				<%=player.getName()%>
				| Score:
				<%=player.getScore()%>
			</p>
		</div>
		<div id="content">
			<p>
				<b> Sheridan Jeopardy </b>
			</p>
			<br> <br>
			<form method="post">
				<center>
					<table class="questionTable">
						<tr>
							<th>Canada</th>
							<th>Java</th>
							<th>Science</th>
							<th>Movie</th>
							<th>Music</th>
						</tr>

						<tr>
							<td><button type="submit" formaction="PickQuestion"
									value="100" name="Canada" class="unstyled"
									<%=request.getSession().getAttribute("Canada100")%>>
									$100</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="100" name="Java" class="unstyled"
									<%=request.getSession().getAttribute("Java100")%>>
									$100</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="100" name="Science" class="unstyled"
									<%=request.getSession().getAttribute("Science100")%>>
									$100</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="100" name="Movie" class="unstyled"
									<%=request.getSession().getAttribute("Movie100")%>>
									$100</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="100" name="Music" class="unstyled"
									<%=request.getSession().getAttribute("Music100")%>>
									$100</button></td>
						</tr>

						<tr>
							<td><button type="submit" formaction="PickQuestion"
									value="200" name="Canada" class="unstyled"
									<%=request.getSession().getAttribute("Canada200")%>>
									$200</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="200" name="Java" class="unstyled"
									<%=request.getSession().getAttribute("Java200")%>>
									$200</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="200" name="Science" class="unstyled"
									<%=request.getSession().getAttribute("Science200")%>>
									$200</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="200" name="Movie" class="unstyled"
									<%=request.getSession().getAttribute("Movie200")%>>
									$200</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="200" name="Music" class="unstyled"
									<%=request.getSession().getAttribute("Music200")%>>
									$200</button></td>
						</tr>

						<tr>
							<td><button type="submit" formaction="PickQuestion"
									value="300" name="Canada" class="unstyled"
									<%=request.getSession().getAttribute("Canada300")%>>
									$300</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="300" name="Java" class="unstyled"
									<%=request.getSession().getAttribute("Java300")%>>
									$300</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="300" name="Science" class="unstyled"
									<%=request.getSession().getAttribute("Science300")%>>
									$300</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="300" name="Movie" class="unstyled"
									<%=request.getSession().getAttribute("Movie300")%>>
									$300</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="300" name="Music" class="unstyled"
									<%=request.getSession().getAttribute("Music300")%>>
									$300</button></td>
						</tr>
						<tr>
							<td><button type="submit" formaction="PickQuestion"
									value="400" name="Canada" class="unstyled"
									<%=request.getSession().getAttribute("Canada400")%>>
									$400</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="400" name="Java" class="unstyled"
									<%=request.getSession().getAttribute("Java400")%>>
									$400</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="400" name="Science" class="unstyled"
									<%=request.getSession().getAttribute("Science400")%>>
									$400</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="400" name="Movie" class="unstyled"
									<%=request.getSession().getAttribute("Movie400")%>>
									$400</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="400" name="Music" class="unstyled"
									<%=request.getSession().getAttribute("Music400")%>>
									$400</button></td>
						</tr>

						<tr>
							<td><button type="submit" formaction="PickQuestion"
									value="500" name="Canada" class="unstyled"
									<%=request.getSession().getAttribute("Canada500")%>>
									$500</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="500" name="Java" class="unstyled"
									<%=request.getSession().getAttribute("Java500")%>>
									$500</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="500" name="Science" class="unstyled"
									<%=request.getSession().getAttribute("Science500")%>>
									$500</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="500" name="Movie" class="unstyled"
									<%=request.getSession().getAttribute("Movie500")%>>
									$500</button></td>

							<td><button type="submit" formaction="PickQuestion"
									value="500" name="Music" class="unstyled"
									<%=request.getSession().getAttribute("Music500")%>>
									$500</button></td>
						</tr>
					</table>
				</center>
			</form>
		</div>
	</div>
</body>

</html>