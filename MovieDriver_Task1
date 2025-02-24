package Lab1;

import java.util.Scanner;

// MovieDriver for Task1: Reads input for one movie and prints its info.
public class MovieDriver {
	
	public static void main(String[] args) {
		// Create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
     
		// Create a new Movie object (using the provided Movie.java class)
		Movie movie = new Movie();
     
		// Prompt the user to enter the title of the movie
		System.out.println("Enter the name of a movie");
		String title = keyboard.nextLine();
		movie.setTitle(title);
     
		// Prompt the user to enter the movie's rating
		System.out.println("Enter the rating of the movie");
		String rating = keyboard.nextLine();
		movie.setRating(rating);
     
		// Prompt the user to enter the number of tickets sold
		System.out.println("Enter the number of tickets sold for this movie");
		int tickets = keyboard.nextInt();
		movie.setSoldTickets(tickets);
     
		// Print the goodbye message
		System.out.println("Goodbye");
     
		// Must close the Scanner
		keyboard.close();
	}
}
