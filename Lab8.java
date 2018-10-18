import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); //import scanner for input
		int i;
	    
		
	    
		
		System.out.println("Welcome to our Java class. Which student would you like to learn more about? Enter a number 1-10: "); //input prompt
		int userSelection = scnr.nextInt();
		
		
		
		//info on students
		String[] names = {"Aalyiah", "Jalen", "Tom", "Dave", "Tim", "Lisa", "Carl", "Rick", "Elijah", "Rebecca" };
		String[] hometowns = {"L.A", "Detroit", "Texas", "Nebraska", "Missisaugua", "Portland", "San francisco", "Lousiana", "New York", "New Orleans"};
		String[] favfoods = {"Shrimp", "Tacos", "Steak", "Salmon", "Smoked Bass", "Filet Mignon", "Hummus", "Crawfish", "Pizza", "Gumbo"};
		
		System.out.println("That is " + names[0]);
		System.out.println("Would you like to know more about " + names[0] + "? (Enter 'favorite' food or 'hometown':  ");
		String userInput = scnr.next();
     
		System.out.println("");
		for (int i1 = 0; i1 < names.length; i1++) {
		System.out.println(names[i1]+"'s" + " favorite food is " + favfoods[i1]);
		}
		
		
	
		
	

		scnr.close();
	}
}