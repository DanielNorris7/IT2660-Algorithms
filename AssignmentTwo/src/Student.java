public class Student 
{
	public static void main(String args[])
	{
        System.out.println();
        System.out.println("In Order:");
        StudentListingArray studentListingOne = new StudentListingArray(new StudentListings("Adam", "123", "3.0"));
        studentListingOne.Insert(new StudentListings("Bravo", "456", "4.0"), 1);
        studentListingOne.Insert(new StudentListings("Charles", "789", "3.5"), 2);
        studentListingOne.Insert(new StudentListings("David", "912", "2.0"), 3);
        studentListingOne.Insert(new StudentListings("Edward", "934", "3.3"), 4);
        studentListingOne.Print();
        
        System.out.println();
        System.out.println("Fetch:");
        System.out.println(studentListingOne.Fetch(3).GetName());

        System.out.println();
        System.out.println("Reverse Order:");
        StudentListingArray studentListingTwo = new StudentListingArray(new StudentListings("Adam", "123", "3.0"));
        studentListingTwo.Insert(new StudentListings("Bravo", "123", "4.0"), 0);
        studentListingTwo.Insert(new StudentListings("Charles", "789", "3.5"), 0);
        studentListingTwo.Insert(new StudentListings("David", "912", "2.0"), 0);
        studentListingTwo.Insert(new StudentListings("Edward", "934", "3.3"), 0);
        studentListingTwo.Print();
        
        System.out.println();
        System.out.println("Delete: " + studentListingTwo.Fetch(3).GetName());
        studentListingTwo.Delete(3);
        studentListingTwo.Print();

        System.out.println();
        System.out.println("Mixed Order:");
        StudentListingArray studentListingsThree = new StudentListingArray(new StudentListings("Adam", "123", "3.0"));
        studentListingsThree.Insert(new StudentListings("Bravo", "123", "4.0"), 1);
        studentListingsThree.Insert(new StudentListings("Charles", "789", "3.5"), 2);
        studentListingsThree.Insert(new StudentListings("David", "912", "2.0"), 1);
        studentListingsThree.Insert(new StudentListings("Edward", "934", "3.3"), 2);
        studentListingsThree.Print();
        
        System.out.println();
        System.out.println("Update: " + studentListingsThree.Fetch(3).GetName());
        studentListingsThree.Update(3, "Franklin", "777", "4.0");
        studentListingsThree.Print();
	}
}
