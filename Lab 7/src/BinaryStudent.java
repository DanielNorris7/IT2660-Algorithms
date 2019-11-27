public class BinaryStudent 
{
	private String _name;
	private double _gpa;
	private int _id;
	
	BinaryStudent left;
	BinaryStudent right;
	
	public BinaryStudent(String name, double gpa, int id)
	{
		_name = name;
		_gpa = gpa;
		_id = id;
		left = null;
		right = null;
	}
	
	public String Name() { return _name; }
	public double GPA() { return _gpa; }
	public int ID() { return _id; }
	
	public int SetID(int newID) 
	{
		return _id = newID;
	}
}
