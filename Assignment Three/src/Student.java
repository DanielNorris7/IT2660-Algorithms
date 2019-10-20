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
        System.out.println("Delete: ");
        System.out.println(studentListingTwo.Fetch(3).GetName());
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
        System.out.println("Update: ");
        System.out.println(studentListingsThree.Fetch(3).GetName());
        studentListingsThree.Update(3, "Franklin", "777", "4.0");
        studentListingsThree.Print();
        
        System.out.println();
        System.out.println("Queueing - Enqueue:");
        StudentListingQueue studentEnqueue = new StudentListingQueue(3);
        studentEnqueue.Enqueue(new StudentListings("Dan", "456", "4.0"));
        studentEnqueue.Enqueue(new StudentListings("Molly", "1", "3.5"));
        studentEnqueue.Enqueue(new StudentListings("Berkeley", "2012", "2.0"));
        // Failure is over queue limit and should not be displayed as it is not part of the queue. 
        studentEnqueue.Enqueue(new StudentListings("Failure", "2019", "1.0"));
        studentEnqueue.ShowAllQueue();

        System.out.println();
        System.out.println("Queueing - Dequeue (Null):");
        StudentListingQueue studentNullDequeue = new StudentListingQueue(3);
        System.out.println(studentNullDequeue.Deque());
        
        System.out.println();
        System.out.println("Queueing - Dequeue (Inital):");
        StudentListingQueue studentDequeue = new StudentListingQueue(3);
        studentDequeue.Enqueue(new StudentListings("Dan", "456", "4.0"));
        studentDequeue.Enqueue(new StudentListings("Molly", "1", "3.5"));
        studentDequeue.Enqueue(new StudentListings("Berkeley", "2012", "2.0"));        
        studentDequeue.ShowAllQueue();
        System.out.println();
        System.out.println("Queueing - Denqueue (Removed Node):");
        studentDequeue.Deque();
        studentDequeue.ShowAllQueue();
        
        System.out.println();
        System.out.println("Stacking - Pushing:");
        StudentListingStack studentPushStack = new StudentListingStack(3);
        studentPushStack.Push(new StudentListings("Luke" , "54321" , "2.6"));
        studentPushStack.Push(new StudentListings("Morgan" , "2934" , "3.6"));
        studentPushStack.Push(new StudentListings("HARDY" , "876" , "1.4"));
        // Failure is over the stack limit and should not be displayed as it is not part of the stack.
        studentPushStack.Push(new StudentListings("Failure", "1", "0.0"));
        studentPushStack.ShowAllStack();
        
        System.out.println();
        System.out.println("Stacking - Popping (Null)");
        StudentListingStack studentNullPopStack = new StudentListingStack(3);
        System.out.println(studentNullPopStack.Pop());
        
        System.out.println();
        System.out.println("Stacking - Popping (Inital)");
        StudentListingStack studentPopStack = new StudentListingStack(3);  
        studentPopStack.Push(new StudentListings("Luke" , "54321" , "2.6"));
        studentPopStack.Push(new StudentListings("Morgan" , "2934" , "3.6"));
        studentPopStack.Push(new StudentListings("HARDY" , "876" , "1.4"));
        studentPopStack.ShowAllStack();
        System.out.println();
        System.out.println("Stacking - Popping (Removed Node)");
        studentPopStack.Pop();
        studentPopStack.ShowAllStack();
	}
}
