<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.prog32758.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Trirong"
	rel="stylesheet">
	<link rel="icon" type="image/ico" href="Photos/logo.png" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table {
	border: 2px solid white;
	border-radius: 10px;
}

body {
	font-family: 'Trirong', serif;
	color: white;
	background-image: url("Photos/resultBg2.png");
	background-repeat: no-repeat;
	background-size: cover;
}

.halfWidth {
	width: 10%;
	height: 30px;
	border-radius: 4px;
}
</style>
<title>Knight's Tour</title>
</head>
<body>

	<%
		String path = getServletContext().getRealPath("/");
		nonIntelligent dumb = new nonIntelligent();
		intelligent smart = new intelligent();
		// Non-Intelligent Method

		if (Integer.parseInt(request.getParameter("mode")) == 1) {
			dumb.deleteFile(path);
			if (Integer.parseInt(request.getParameter("tries")) <= 0) {
				throw new ServletException("Number of tries must be a positive number!");
			} else {
				if (Integer.parseInt(request.getParameter("positionX")) >= 8
						|| Integer.parseInt(request.getParameter("positionY")) >= 8
						|| Integer.parseInt(request.getParameter("positionX")) < 0
						|| Integer.parseInt(request.getParameter("positionY")) < 0) {
					throw new ServletException("Position out of bounds! Position should be from 0 to 7.");
				} else {
					for (int tries = 0; tries < Integer.parseInt(request.getParameter("tries")); tries++) {
						if (!dumb.playTour(Integer.parseInt(request.getParameter("positionX")),
								Integer.parseInt(request.getParameter("positionY")))) {
							out.println("<center>");
							out.println("The knight was able to successfully touch " + dumb.pieceCount);
							out.println("</br></br>");
							out.print("<table width='30%' cellpadding='10' cellspacing='10'>");
							for (int x = 0; x < 8; x++) {
								out.print("<tr>");
								for (int y = 0; y < 8; y++) {
									out.print("<td>");
									out.print(dumb.finalMatrix[x][y]);
									out.print(" </td>");
								}
								out.print("</tr>");
							}
							dumb.writeToFile(path);
							dumb.clearMatrix();
							out.print("</table></center>");
							out.print("</br>");
							
						}
					}
	%>
	
	<center>
		<form action="nonIntelligentMethod">
			<input type="submit" value="File Location" class="halfWidth">
		</form>
	</center>
	<%
		}
			}
		}

		// Intelligent Method	
		else {
			smart.deleteFile(path);
			// 
			if (Integer.parseInt(request.getParameter("tries")) <= 0) {
				throw new ServletException("Number of tries must be a positive number!");
			} else {
				if (Integer.parseInt(request.getParameter("positionX")) >= 8
						|| Integer.parseInt(request.getParameter("positionY")) >= 8
						|| Integer.parseInt(request.getParameter("positionX")) < 0
						|| Integer.parseInt(request.getParameter("positionY")) < 0) {
					throw new ServletException("Position out of bounds! Position should be from 0 to 7.");
				} else {
					if (Integer.parseInt(request.getParameter("tries")) <= 0) {
						throw new ServletException("Number of tries must be a positive number!");
					} else {
						for (int tries = 0; tries < Integer.parseInt(request.getParameter("tries")); tries++) {
							if (!smart.playTour(Integer.parseInt(request.getParameter("positionX")),
									Integer.parseInt(request.getParameter("positionY")))) {
								out.println("<center>");
								out.println("The knight was able to successfully touch " + smart.pieceCount);
								out.println("</br></br>");
								out.print("<table width='30%' cellpadding='10' cellspacing='10'>");
								for (int x = 0; x < 8; x++) {
									out.print("<tr>");
									for (int y = 0; y < 8; y++) {
										out.print("<td>");
										out.print(smart.finalMatrix[x][y]);
										out.print(" </td>");
									}
									out.print("</tr>");
								}
								smart.writeToFile(path);
								smart.clearMatrix();
								out.print("</table></center>");
								out.print("</br>");
							}
						}
	%>

	<center>
		<form action="intelligentMethod">
			<input type="submit" value="File Location" class="halfWidth">
		</form>
	</center>

	<%
		}
				}
			}
		}
	%>



</body>
</html>