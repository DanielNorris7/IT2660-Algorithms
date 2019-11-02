
public class StudentListingStack 
{
	private StudentListings[] studentListings;
	private int top, size;
	
	public StudentListingStack(int stackSize)
	{
		this.top = -1; 
		this.size = stackSize;
		studentListings = new StudentListings[stackSize];
	}

	public boolean Push(StudentListings newStudent)
	{
		StudentListings student = newStudent;
		
		if (this.top == this.size - 1)
		{
			return false; // You're overflowing...
		}
		else
		{
			this.top = this.top + 1;
			studentListings[this.top] = student.DeepClone();
			return true;
		}
	}
	
	public StudentListings Pop() 
	{
		int topLocation;
		
		if (this.top == -1)
		{
			return null; // You're overflowing. 
		}
		else
		{
			topLocation = this.top;
			this.top = this.top - 1;
			return studentListings[topLocation];
		}
	}
	
	public void ShowAllStack()
	{
		for (int i = this.top; i >= 0; i--)
		{
			System.out.println(studentListings[i].GetName());
		}
	}
}
