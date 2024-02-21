import java.util.Scanner;
public class Movie_Driver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String mName;
		String mRating;
		String check;
		int tickets;
		boolean isTrue=true;
		// TODO Auto-generated method stub
//		Create a new object of type Scanner that reads from the keyboard
//		Create a new movie object
//		Prompt the user to enter the title of a movie 
//		Read in the line that the user types
//		Set the title in the movie object
//		Prompt the user to enter the movie’s rating
//		Read in the line that the user types
//		Set the rating in the movie object
//		Prompt the user to enter the number of tickets sold at a (unnamed) theater
//		Read in the integer that the user types
//		Set the number of tickets sold in the movie object
//		Print out the information using the movie’s toString method
		while(isTrue==true) {
			Movie N = new Movie();
			System.out.println("Enter a name of the movie ");
			mName= keyboard.nextLine();
			N.setTitle(mName);
			System.out.println("Enter the Rating of the movie");
			mRating =keyboard.nextLine();
			N.setRating(mRating);
		
			System.out.println("Enter the number of tickets sold for the movie");
			tickets = keyboard.nextInt();
			N.setSoldTickets(tickets);
			System.out.println(N.toString());
			System.out.println("Would you like to add another movie  (y or n)");
			check= keyboard.nextLine();
			check= keyboard.nextLine();
			if(check.equalsIgnoreCase("y"))
				isTrue =true;
			else
				isTrue = false;
		}
		System.out.println("Goodbye");
	}

}
