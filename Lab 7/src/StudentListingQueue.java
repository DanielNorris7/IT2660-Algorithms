public class StudentListingQueue 
{
	private StudentListings[] studentListings;
	private int size, numberOfNods, front, rear;
	

    public StudentListingQueue(int queueSize) 
    {
        this.size = queueSize;
        this.numberOfNods = 0;
        this.front = 0;
        this.rear = 0;
        this.studentListings = new StudentListings[queueSize];
    }

    public boolean Enqueue(StudentListings students)
    {
    	if (this.numberOfNods == this.size)
    	{
    		return false; // You didn't push.
    	}
    	else
    	{
    		this.numberOfNods = this.numberOfNods + 1;
    		this.studentListings[this.rear] = students.DeepClone();
    		this.rear = (this.rear + 1) % this.size;
    		return true; // You pushed!
    	}
    }
    
    public StudentListings Deque()
    {
    	int frontLocation;
    	
    	if (this.numberOfNods == 0)
    	{
    		return null; // Nothing to remove, you fool! 
    	}
    	else 
    	{
    		frontLocation = this.front;
    		this.front = (this.front + 1) % this.size;
    		numberOfNods = this.numberOfNods - 1;
    		return studentListings[frontLocation]; // Node removed.
    	}
    }
    
    public void ShowAllQueue()
    {
    	int index = this.front;
    	
    	for (int i = 1; i <= this.numberOfNods; i++)
    	{
			System.out.println(studentListings[index].GetName());
			index = (index + 1) % this.size;
		}
    }
}
