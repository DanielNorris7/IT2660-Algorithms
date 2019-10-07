public class StudentListingArray 
{
	private StudentListings[] studentListing;

    public StudentListingArray(StudentListings studentName) 
    {
        this.studentListing = new StudentListings[1];
        this.studentListing[0] = studentName;
    }

    public void Print() 
    {
        for (StudentListings studentListing: this.studentListing) 
        {
            System.out.println(studentListing.GetName());
        }
    }

    public void Insert(StudentListings studentListings, int position) 
    {
        if (this.studentListing.length == 0 && position == 0) 
        {
            this.studentListing = new StudentListings [1];
            this.studentListing[0] = studentListings;
            return;
        }

        if (position < 0 || position > this.studentListing.length) 
        {
            return;
        }

        StudentListings[] newStudentListings = new StudentListings [this.studentListing.length + 1];

        for (int i = 0; i < this.studentListing.length + 1; i++) 
        {
            if (i < position) 
            {
            	newStudentListings[i] = this.studentListing[i];
            }
            else if (i > position) 
            {
            	newStudentListings[i] = this.studentListing[i - 1];
            }
            else 
            {
            	newStudentListings[i] = studentListings;
            }
        }

        this.studentListing = newStudentListings;
    }
    
    public StudentListings Fetch(int position)
    {
    	return this.studentListing[position];
    }
    
    public int Count()
    {
    	int count = 0;
    	
    	for (int i = 0; i < this.studentListing.length; i++)
    	{
    		count++;
    	}
    	
    	return count;
    }
    
    public void Delete(int position)
    {
    	int listingCount = this.studentListing.length;
        
 	   	for (int i = 0; i < listingCount; i++)
 	   	{
 		   if (i == position)
 		   {
 			  this.studentListing[i].UpdateStudateInformation("", "", "");
 		   }
 	   	}
    }
    
    public void Update(int position, String updatedName, String updatedID, String updatedGPA)
    {
    	StudentListings student = this.Fetch(position);
    	student.UpdateStudateInformation(updatedName, updatedID, updatedGPA);
    }
}
