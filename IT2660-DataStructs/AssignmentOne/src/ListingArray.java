import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListingArray 
{
	public ListingArray() 
	{
		
	}
	
	public void userListingArray()
	{
		ArrayList<Listing> userListings = new ArrayList<Listing>();
		String userName = null;
		int userAge = 0;
		
		int listingCount = 0;
		
		Scanner userInputName = new Scanner(System.in);
		Scanner userInputAge = new Scanner(System.in);				
		
		while(listingCount < 3)
		{
			// Displaying listingCount + 1 so the base zero number isn't displayed.
			System.out.println("Current Number of Listings entered: " + (listingCount + 1));
			
			System.out.println("Please enter a Name.");
			userName = userInputName.nextLine();
			
			System.out.println("Please enter an age.");
			
			userAge = userInputAge.nextInt();
			
			Listing userCreatedListing = new Listing(userName, userAge);
			userListings.add(userCreatedListing);
			
			listingCount++;			
		}
			
		userInputName.close();
		userInputAge.close();
		
		// Print the list in reverse
		simpleReversal(userListings);
		reverseArray(userListings);		
	}
	
	private void reverseArray(ArrayList<Listing> userArrayList)
	{	
		Listing[] listingArray = userArrayList.toArray(new Listing[userArrayList.size()]);
		
        for (int i = listingArray.length - 1; i >= 0; i--) 
        {  
            System.out.print(listingArray[i] + " ");  
        } 
	}

	private void simpleReversal(ArrayList<Listing> userArrayList) 
	{
		Collections.reverse(userArrayList);
		System.out.println("Simple Reverse: " + userArrayList);
	}
}
