public class StudentLinkedList 
{
	private StudentListings _rootStudent;
	private StudentListings _lastStudent;
	private int _size;
	
	public StudentLinkedList(StudentListings studentListing)
	{
		_rootStudent = studentListing;
		_lastStudent = studentListing;
		_size = 1;		
	}
	
	public void Append(StudentListings studentListing)
	{
		_lastStudent.SetNextStudent(studentListing);
		_rootStudent = studentListing;
		_size++;
	}
	
	public void Insert(StudentListings studentListing, int index)
	{
		StudentListings student = getNextStudent(index, false);
		studentListing.SetNextStudent(student.GetNextStudent());
		student.SetNextStudent(studentListing);
		_size++;
	}
	
	public void InsertNewStudentRoot(StudentListings studentListing)
	{
		studentListing.SetNextStudent(_rootStudent);
		_rootStudent = studentListing;
		_size++;
	}
	
	public void InsertStudentListingAtPosition(StudentListings studentListing, int position)
	{
		if (position == 0)
			InsertNewStudentRoot(studentListing);
		else if (position == _size)
			Append(studentListing);
		else
			Insert(studentListing, position);
	}
	
	public void Print() 
	{
		System.out.println("Last Size: [" + _size + "]");
		getNextStudent(_size, true);
	}
	
	private StudentListings getNextStudent (int position, boolean print)
	{
		StudentListings student = _rootStudent;
		
		for (int i = 1; i <= position; i++)
		{
			if (print)
				System.out.print(student.GetName() + " ");
			
			student = student.GetNextStudent();
		}
		
		return student;
	}
}
