import java.util.ArrayList;
import java.util.Arrays;

public class StudentListingBinaryTree 
{
	@SuppressWarnings("unused")
	private StudentListings student;
	@SuppressWarnings("unused")
	private StudentListingBinaryTree leftChild;
	@SuppressWarnings("unused")
	private StudentListingBinaryTree rightChild;
	private ArrayList<StudentListings> sortedList = new ArrayList<StudentListings>();
	
	public StudentListingBinaryTree(StudentListings student)
	{
		this.student = student;
	}
	
	public StudentListingBinaryTree(ArrayList<StudentListings> studentArrayList)
	{
		int length = studentArrayList.size();
		
		switch (length)
		{
			// Base Case 1
			case 1:
				this.student = studentArrayList.get(0);
				this.sortedList.add(studentArrayList.get(0));
				return;	
			
			// Base Case 2	
			case 2: 				
				if (studentArrayList.get(0).GetName().compareTo(studentArrayList.get(1).GetName()) == 0)
				{
					this.student = studentArrayList.get(1);
					this.leftChild = new StudentListingBinaryTree(studentArrayList.get(1));
				}
			
			// Recursion
			default: 
				int median = length / 2;
				
				ArrayList<StudentListings> leftArray = new ArrayList<StudentListings>();
				ArrayList<StudentListings> rightArray = new ArrayList<StudentListings>();
				
				for (int i = 0; i < median; i++)
				{
					leftArray.add(studentArrayList.get(i));
				}
				
				for (int i = median + 1; i < studentArrayList.size(); i++)
				{
					rightArray.add(studentArrayList.get(i));
				}
				
				if (leftArray.size() > 0)
					this.leftChild = new StudentListingBinaryTree(leftArray);
				
				this.student = studentArrayList.get(median);
				
				if (rightArray.size() > 0)
					this.rightChild = new StudentListingBinaryTree(rightArray);
		}
	}
	
	public void Print() 
	{
		for (StudentListings printStudent: this.sortedList)
		{
			System.out.println(printStudent);
		}
	}
}
