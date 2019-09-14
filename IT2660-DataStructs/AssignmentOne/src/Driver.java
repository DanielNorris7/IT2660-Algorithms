
public class Driver 
{
	
	public static void main(String args[])
	{
		boolean toggle = false;
		
		// This is funny. However, question two fails when executed right after question 1. 
		// From debugging it, it seems that the scanner from the second question is not initializing after 
		// the scanner is closed in the first question. Running methods independently works. 
		// Although weird, this gets both methods to work in harmony. 
		while(toggle)
		{
			questionFortyOne();	
			toggle = true;
		}
		questionFortyTwo();
	}
	
	private static void questionFortyOne()
	{
		// No parameter constructor
		Listing firstListing = new Listing();
		
		// Properties
		System.out.println("Name: " + firstListing._name);
		System.out.println("Age: "+ firstListing._age);
		
		
		// Parameter constructor
		Listing secondListing = new Listing("Baker", 24);
		
		// Properties
		System.out.println("Name: " + secondListing._name);
		System.out.println("Age: "+ secondListing._age);
		
		// toString()
		System.out.println("toString(): " + secondListing.toString());
		
		// void input
		
		secondListing.input();
		
		// setName
		secondListing.setName("Tom");
		
		// setAge
		secondListing.setAge(42);
		
		// getName
		System.out.println("getName: " + secondListing.getName());
		
		// getAge
		System.out.println("getAge: " + secondListing.getAge());
	}
	
	private static void questionFortyTwo() 
	{
		ListingArray driverListingArray = new ListingArray();
		driverListingArray.userListingArray();
	}
}
