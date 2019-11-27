import java.util.ArrayList;

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
        
        
        System.out.println();
        System.out.println("Linked List");
        StudentLinkedList studentLinkedList = new StudentLinkedList(new StudentListings("Test 1", "12345", "3.2"));
        studentLinkedList.Append(new StudentListings("Test 2", "8675", "1.5"));
        studentLinkedList.Append(new StudentListings("Test 3", "34567", "2.2"));
        studentLinkedList.InsertStudentListingAtPosition((new StudentListings("Test 0", "3030", "2.45")), 0);
        studentLinkedList.InsertStudentListingAtPosition((new StudentListings("Test 1", "3145", "1.65")), 1);
        studentLinkedList.InsertStudentListingAtPosition((new StudentListings("Test 3", "7865", "3.45")), 2);
        studentLinkedList.InsertStudentListingAtPosition((new StudentListings("Test 6", "9867", "3.95")), 6);
        studentLinkedList.Print();
        System.out.println();
        
//        System.out.println();
//        System.out.println("Binary Tree");        
//        ArrayList<StudentListings> studentArrayList = new ArrayList<StudentListings>();
//        studentArrayList.add(new StudentListings("Adam", "123", "3.0"));
//        studentArrayList.add(new StudentListings("Edward", "934", "3.3"));
//        studentArrayList.add(new StudentListings("Bravo", "123", "4.0"));
//        studentArrayList.add(new StudentListings("David", "912", "2.0"));
//        studentArrayList.add(new StudentListings("Charles", "789", "3.5"));
//        
//        StudentListingBinaryTree binaryTreeResults = new StudentListingBinaryTree(studentArrayList);
//        binaryTreeResults.Print();
        
        BinaryStudent adam = new BinaryStudent("Adam", 3.0, 15);
        BinaryStudent edward = new BinaryStudent("Edward",3.3, 30);
        BinaryStudent bravo = new BinaryStudent("Bravo",4.0, 25);
        BinaryStudent david = new BinaryStudent("David", 2.0, 20);
        BinaryStudent charles = new BinaryStudent("Charles", 3.5, 40);
        
        System.out.println();
        System.out.println("Binary Tree:");  
        BinaryTree bt = new BinaryTree();
        bt.Add(adam);
        bt.Add(edward);
        bt.Add(bravo);
        bt.Add(david);
        bt.Add(charles);
        
        System.out.println("Orignal List");
        bt.Print(bt._root);
        
        System.out.println();
        System.out.println("Inserted List");
        bt.Add(new BinaryStudent("Chuck", 1.0, 27));
        bt.Print(bt._root);
        
        System.out.println();
        System.out.println("Search for a Student named Edward");
        
        if (bt.ContainsStudent(edward))
        	System.out.println("Found the Edward");
        else
        	System.out.println("Edward is lost! Oh no!");
        
        System.out.println();
        System.out.println("Deleting Bravo");
        bt.Delete(bravo);
        bt.Print(bt._root);
        
        System.out.println();
        System.out.println("Descending Order");
        bt.DescendingOrder(bt._root);
	}
}
