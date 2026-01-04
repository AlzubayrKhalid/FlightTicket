package homework;

public class FlightTicket {
	private static int numOfTicket =0; 	// Static variable to count a number of tickets created.

	// Instance variables
	private String passengerName;
	private String ticketID;
	private char classType;
	private int daysBeforeFlight;
	
	
	// Constructor
	public FlightTicket (String passengerName, char classType, int daysBeforeFlight)
	{
		this.passengerName= passengerName;
		this.classType= classType;
		this.daysBeforeFlight= daysBeforeFlight;
		generateTicketID();
		numOfTicket++;
	}
	
	
	// Method to generate the ticket ID based on rules given.
	private String generateTicketID()
	{

		// Determine the two-mid-letter  based on passengerName.
		
		String mid;
		
		if (passengerName.length()< 2)
			mid = passengerName.toUpperCase();
		
		else
			mid = passengerName.substring(passengerName.length()-2, passengerName.length()).toUpperCase();
		
		
		// Determine the two-first-letter based on class type (Economy, Business,First).
		if (classType == 'E' || classType == 'e')
		{
			ticketID = "EC"+ mid + numOfTicket;
			classType = 'E';
		}
		
		else if (classType == 'B' || classType == 'b')
		{
			ticketID = "BU"+ mid + numOfTicket;
			classType = 'B';
		}
		
		else
		{
			ticketID = "FI"+ mid + numOfTicket;
			classType = 'F';
		}
		
		return ticketID;
	}
	
	
	
	
	// Method to calculate ticket price based on type-class and rules of calculate price.
	public double calculateTicketPrice()
	{
		double TotalPrice;
		if (classType == 'E' || classType == 'e')
			TotalPrice = 850 + (10*daysBeforeFlight);
		else if (classType == 'B' || classType == 'b')
			TotalPrice = 1500 + (15*daysBeforeFlight);
		else
			TotalPrice = 2500 + (20*daysBeforeFlight);
		
		return TotalPrice;
		
	}
	
	
	
	
	// toString method to return ticket info of object when we print the object.
	public String toString()
	{
		String objToString = "Passenger: " + passengerName + ", ID: " + ticketID + ", Class: " + classType + ", Days Before Flight: " + daysBeforeFlight + ", Total: " + String.format("%.2f" ,calculateTicketPrice()) + " SAR" ;
		return objToString;
	}



	
	
	// getters and setters.
	
	
	public static int getNumOfTicket() {
		return numOfTicket;
	}



	public static void setNumOfTicket(int numOfTicket) {
		FlightTicket.numOfTicket = numOfTicket;
	}



	public String getPassengerName() {
		return passengerName;
	}



	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}



	public String getTicketID() {
		return ticketID;
	}



	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}



	public char getClassType() {
		return classType;
	}



	public void setClassType(char classType) {
		this.classType = classType;
	}



	public int getDaysBeforeFlight() {
		return daysBeforeFlight;
	}



	public void setDaysBeforeFlight(int daysBeforeFlight) {
		this.daysBeforeFlight = daysBeforeFlight;
	}
	
	
	
}
