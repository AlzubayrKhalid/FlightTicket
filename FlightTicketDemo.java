package homework;
import java.util.Scanner;


public class FlightTicketDemo {
	
	// Method to check if the user entered a valid ticket class.
	public static boolean isValidClassType(char type) 
	{
		if (type == 'E' || type == 'B' || type == 'F' || type == 'e' || type == 'b' || type == 'f')
		{
			return true;
		}
		
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		// Loop continue until the user finish and types exit.
		while (true)
		{
			// ask for passenger name.
			System.out.print("Enter passenger name (or ‘exit’ to quit): ");
			String passengerName = read.next();
			if (passengerName.equalsIgnoreCase("exit"))
			{
				System.out.println("Goodbye!");
				break;
			}
		
			// ask for class type.
			System.out.print("Enter ticket class ('E', 'B', 'F'): "); 
			char classType = read.next().charAt(0);
			while (!(isValidClassType(classType)))
			{			
				System.out.println("ERROR: Invalid class type. Must be 'E', 'B', or 'F'.");
				System.out.print("Enter ticket class ('E', 'B', 'F'): "); 
				classType = read.next().charAt(0);

			
			}
			
			
			// ask for how much days before flight.
			System.out.print("Enter days before flight: ");
			int daysBeforeFlight = read.nextInt();
			
		
			// Create object for flight ticket.
			FlightTicket t1 = new FlightTicket(passengerName, classType, daysBeforeFlight);
			System.out.println(t1);
			// when we print the object java will search for toString method and print it if it exist.
		    System.out.println("============================");
		}
		
		read.close();

	}

}
