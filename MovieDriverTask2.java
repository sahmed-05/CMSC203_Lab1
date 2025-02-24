package Lab1;

import java.util.Scanner;

// MovieDriver for Task2: Reads input for multiple movies using a loop.
public class MovieDriverTask2 {
	
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String continueChoice;  // To store the user's response to continue
        
        // Loop to read multiple movies
        do {
            // Create a new Movie object for each iteration
            Movie movie = new Movie();
            
            // Prompt for the movie's title
            System.out.println("Enter the name of a movie");
            String title = keyboard.nextLine();
            movie.setTitle(title);
            
            // Prompt for the movie's rating
            System.out.println("Enter the rating of the movie");
            String rating = keyboard.nextLine();
            movie.setRating(rating);
            
            // Prompt for the number of tickets sold
            System.out.println("Enter the number of tickets sold for this movie");
            int tickets = keyboard.nextInt();
            movie.setSoldTickets(tickets);
            
            // Clear the newline left over from nextInt()
            keyboard.nextLine();
            
            // Print out the movie information
            System.out.println(movie.toString());
            
            // Ask if the user wants to enter another movie
            System.out.println("Do you want to enter another? (y or n)");
            continueChoice = keyboard.nextLine();
            
        } while (continueChoice.equalsIgnoreCase("y"));
        
        // Print the goodbye message when finished
        System.out.println("Goodbye");
        
        // Must close the Scanner
        keyboard.close();
    }
}
