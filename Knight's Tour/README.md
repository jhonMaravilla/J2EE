![alt text](Project ScreenShot/index.png)

- The program is pretty straight forward. 
	* Inside WebContent folder, run index.jsp
	* Choose either intelligent or non intelligent method
	* Enter the number of tries
	* Enter your desired matrix position

- For error page, I have an invalidValueErrorPage.jsp page where it prints out a ServletException. It executes when the user either enters a negative value of tries or the position is out of bounds.

- File Location: A button "File Location" is placed at the bottom part of the matrix printout which will indicate where the Location of the text file is.

- RequestDispatcher: I used RequestDispatcher to redirect intelligentMethod to a servlet where the path of the file will print out.

- sendRedirect: Same thing as RequestDispatcher but I used it for nonIntelligentMethod to redirect you to a page where the nonIntelligent matrix text file is saved.
