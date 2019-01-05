package com.prog32758;
import java.util.*;


public class GameQuestions {
	public static ArrayList<Question> question = new ArrayList<Question>();
	public static ArrayList<String> answeredQuestion = new ArrayList<>();
	
	public void loadQuestions(){
		// Canada Questions
		question.add(new Question("Canada" , 100 , "What is the most populated city in Canada?" , "Vancouver" , "Ottawa" , "Manitoba" , "Toronto" , "Toronto"));
		question.add(new Question("Canada" , 200 , "What is the oldest walled city that still exists north of Mexico?" , "Montereal" , "Halifax" , "Quebec City" , 
				"Vancouver" , "Quebec City"));
		question.add(new Question("Canada" , 300 , "What is the only official bilingual province in Canada?" , "Quebec" , "New Brunswick" , "Ontario" , 
				"Nova Scotia" , "New Brunswick"));
		question.add(new Question("Canada" , 400 , "How many oceans border Canada?" , "4" , "2" , "3" , "1" , "3"));
		question.add(new Question("Canada" , 500 , "What is the population of Canada?" , "30 million" , "23 million" , "32 million" , "36 million" , 
				"36 million"));
		
		// Java Questions
		question.add(new Question("Java" , 100 , "Which of these operators is used to allocate memory to array variable in Java?" , "malloc" , "alloc" , 
				"new" , "new malloc" , "new"));
		question.add(new Question("Java" , 200 , "Which of these classes is not part of Java collection framework?" , "Maps" , "Queue" , 
				"Stack" , "Array" , "Queue"));
		question.add(new Question("Java" , 300 , "To prevent any method from overriding, we declare the method as?" , "final" , "const" , 
				"static" , "abstract" , "final"));
		question.add(new Question("Java" , 400 , "A class that is declared inside a class but outside a method is known as?" , "Anonymous Inner class" 
				, "Member Inner class" , "Local Inner class" , "Static nested class" , "Member Inner class"));
		question.add(new Question("Java" , 500 , "A class which cannot be instantiated is known as?" , "Polymorphism" , "Abstract Class" , 
				"Encapsulation" , "Abstract Method" , "Abstract Class"));
		
		// Science Questions
		question.add(new Question("Science" , 100 , "What makes a reptile a reptile?" , "Cold blooded" , "Warm Blooded" , "Non-Hearing" , "Egg-laying" , "Egg-laying"));
		question.add(new Question("Science" , 200 , "Insulin controls the metabolism of?" , "Fats" , "Carbohydrates" , "Proteins" , "Hormones" , "Carbohydrates"));
		question.add(new Question("Science" , 300 , "Hertz is used to meassure?" , "Force" , "Frequency" , "Magnetic Flux" , "Electric charge" , "Frequency"));
		question.add(new Question("Science" , 400 , "Which blood cells are called 'Soldiers' of the body?" , "Red Blood Cell" , "Platelets" , "All of the Above" , 
				"White Blood Cell" , "White Blood Cell"));
		question.add(new Question("Science" , 500 , "Who among the following considered as the 'father of artificial intelligence'?" , "John McCarthy" , 
				"Charles Babbage" , "Lee De Forest" , "JP Eckert" , "John McCarthy"));
		
		// Movie Questions
		question.add(new Question("Movie" , 100 , "In the \"Toy Story\" movies, what kind of dog is Buster?" , "Pug" , "Poodle" , 
				"Fox Terrier" , "Dachshund" , "Dachshund"));
		question.add(new Question("Movie" , 200 , "Which transformer did Sam Witwicky drive and consider as his car in the 2007 Transformers movie?" , 
				"Jazz" , "Oprimus Prime" , "Ratchet" , "Bumblebee" , "Bumblebee"));
		question.add(new Question("Movie" , 300 , "What object did Loki possesses that the Avengers team was desperate to recover?" , "The Tesseract" , 
				"The Ark of the Covenant" , "The Glowstick of Destiny" , "Pieces of Kryptonite" , "The Tesseract"));
		question.add(new Question("Movie" , 400 , "What comedian played the grinch in the 2000 film How the Grinch Stole Christmas?" , "Will Ferrell" 
				, "Drew Carey" , "Jim Carrey" , "Neil Patrick Harris" , "Jim Carrey"));
		question.add(new Question("Movie" , 500 , "In the movie Forrest Gump where did Forrest get shot?" , "His arm" , "His leg" , 
				"His buttocks" , "His foot" , "His buttocks"));
		
		// Music Questions
		question.add(new Question("Music" , 100 , "Which artist has won the Grammy Award for 'Best Rap Album' the most times?" , "OutKast" , 
				"Jay-Z" , "Kanye West" , "Eminem" , "Eminem"));
		question.add(new Question("Music" , 200 , "Which singers collaborated to record the song 'Empire State of Mind'?" , "Usher & Alicia Keys" , 
				"Usher & Beyoncé" , "Jay-Z & Alicia Keys" , "Jay-Z & Beyoncé" , "Jay-Z & Alicia Keys"));
		question.add(new Question("Music" , 300 , "Which Beatle was NOT an original member of the band?" , "John Lennon" , "George Harrison" , 
				"Paul McCartney" , "Ringo Starr" , "Ringo Starr"));
		question.add(new Question("Music" , 400 , "What is missing from the title of the pop group \"Chilli Peppers\"?" , "Extremely Hot" , "Mexican Hot" , 
				"Red Hot" , "Very Hot" , "Red Hot"));
		question.add(new Question("Music" , 500 , "Which of these bands recorded these songs: \"Highway To Hell\", \"You Shook Me All Night Long\" and \"Back In Black\"?" ,
				"Iron Maiden" , "Judas Priest" , "Black Sabbath" , "AC/DC" , "AC/DC"));
	}
	
	public static String disableQuestion(String question) {
		String disable = " ";
		for(String var:answeredQuestion) {
			if (var.equals(question)) {
				disable = "disabled=\"disabled\" style=\"opacity: .5; text-decoration: line-through;\" id=\"noHover\"";
			} else {
				disable = " ";
			}
		}
		return disable;
	}
}
