import java.util.Scanner;
public class MovieDriver {
	
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		
		String answer="";
		
		
		while(!(answer.equalsIgnoreCase("y"))) {
			
			System.out.println("enter the title of the movie ");
			
				String movieTitle=scanner.nextLine();
			
			System.out.println("what rating do you give the movie ");
			
				String movieRating=scanner.nextLine();
			
			System.out.println("How many tickets were sold at the movie ");
			
				int movieTickets=scanner.nextInt();
				
				Movie myMovie = new Movie(movieTitle,movieRating,movieTickets);
				
			System.out.println(myMovie.toString());
			
			System.out.println("\n would you like to continue, y for yes, anything else for no \n");
			
		}
		System.out.println("\n goodbye");
	
	}
	}
		
	