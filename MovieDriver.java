package Lab1;

import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        // Creating a new movie object
        Movie movie = new Movie();

        System.out.println("Enter the name of a movie");
        String title = keyboard.nextLine();
        // Setting the title in the movie object
        movie.setTitle(title);

        System.out.println("Enter the rating of the movie");
        String rating = keyboard.nextLine();
        // Setting the rating in the movie object
        movie.setRating(rating);

        System.out.println("Enter the number of tickets sold for this movie");
        int soldTickets = keyboard.nextInt();
        // Setting the number of tickets sold in the movie object
        movie.setSoldTickets(soldTickets);

        keyboard.close();

        System.out.println("Goodbye");
    }
}
