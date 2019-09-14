import java.util.Scanner;

public class Listing 
{
	String _name;
	int _age;
	
	public Listing() 
	{
		_name = "";
		_age = 0;
	}
	
	public Listing(String name, int age) 
	{
		_name = name;
		_age = age;
	}
	
	@Override
	public String toString() 
	{
		return "Name: " + this._name + " Age: " + this._age;
	}
	
	public void input()
	{
		Scanner inputNameScanner = new Scanner(System.in);
		System.out.println("Enter a name");
		String entryName = inputNameScanner.nextLine();
		
		Scanner inputAgeScanner = new Scanner(System.in);
		System.out.println("Enter an age");				
		int entryAge = inputAgeScanner.nextInt();
						
		System.out.println("Input Name: " + entryName + ". Input Age: " + entryAge + ".");

		this.setName(entryName);
		this.setAge(entryAge);

		inputNameScanner.close();
		inputAgeScanner.close();
	}
	
	public void setName(String name) 
	{
		_name = name;
	}
	
	public void setAge(int age) 
	{
		_age = age;
	}
	
	public String getName() 
	{
		return _name;
	}
	
	public int getAge()
	{
		return _age;
	}
}
