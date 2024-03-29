import javax.swing.JOptionPane;

public class StudentListings 
{
	private String _name;
	private String _id;
	private String _gpa;
	private StudentListings _nextStudent;
	
	public StudentListings(String name, String id, String gpa)
	{
		_name = name;
		_id = id;
		_gpa = gpa;
	}
	
	public StudentListings()
	{
		
	}
	
	public StudentListings DeepClone()
	{
		return new StudentListings(_name, _id, _gpa); 
	}
	
	public int CompareTo(String target) 
	{
		return(_name.compareTo(target));
	}
	
	public void Input()
	{
		_name = JOptionPane.showInputDialog("Enter a name");
		_id = JOptionPane.showInputDialog("Enter an ID");
		_gpa = JOptionPane.showInputDialog("Enter a gpa");
	}
	
	public String GetName()
	{		
		return _name;
	}
	
	public String GetID()
	{
		return _id;
	}
	
	public String GetGPA()
	{
		return _gpa;
	}
	
	public void UpdateStudateInformation(String name, String ID, String GPA)
	{
		_name = name;
		_id = ID;
		_gpa = GPA;
	}
	
	public StudentListings GetNextStudent()
	{
		if (_nextStudent == null)
			_nextStudent = this;
		
		return _nextStudent;
	}
	
	public void SetNextStudent(StudentListings studentListings) 
	{
		_nextStudent = studentListings;
	}
}
