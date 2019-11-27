public class BinaryTree 
{
	BinaryStudent _root;
	
	private BinaryStudent addRecursive (BinaryStudent current, BinaryStudent value)
	{
	    if (current == null) 
	    {
	        return new BinaryStudent(value.Name(), value.GPA(), value.ID());
	    }
	 
	    if (value.ID() < current.ID()) 
	    {
	        current.left = addRecursive(current.left, value);
	    } 
	    else if (value.ID() > current.ID()) 
	    {
	        current.right = addRecursive(current.right, value);
	    } 
	    else 
	    {
	        // value already exists
	        return current;
	    }

	    return current;
	}
	
	public void Add(BinaryStudent value)
	{
		_root = addRecursive(_root, value);
	}
	
	private boolean containsStudentRecursive(BinaryStudent current, BinaryStudent value) 
	{
	    if (current == null)
	    {
	        return false;
	    } 
	    if (value.ID() == current.ID()) 
	    {
	        return true;
	    } 
	    return value.ID() < current.ID()
	      ? containsStudentRecursive(current.left, value)
	      : containsStudentRecursive(current.right, value);
	}
	
	public boolean ContainsStudent(BinaryStudent value) 
	{
	    return containsStudentRecursive(_root, value);
	}
	
	private BinaryStudent deleteRecursive(BinaryStudent current, BinaryStudent value) 
	{
	    if (current == null) 
	    {
	        return null;
	    }
	 
	    if (value.ID() == current.ID())
	    {
	    	// Node has no children
	    	if (current.left == null && current.right == null) 
	    	{
	    	    return null;
	    	}
	    	
	    	// Node has one child
	    	if (current.right == null) 
	    	{
	    	    return current.left;
	    	}
	    	
	    	// Node has two children
	    	if (current.left == null) 
	    	{
	    	    return current.right;
	    	}
	    	
	    } 
	    
	    if (value.ID() < current.ID()) 
	    {
	        current.left = deleteRecursive(current.left, value);
	        return current;
	    }
	    
	    int smallestValue = findSmallestValue(current.right);
	    current.SetID(smallestValue);	    
	    current.right = deleteRecursive(current.right, value);
	    return current;
	}
	
	private int findSmallestValue(BinaryStudent root)
	{
		return _root.left == null ? _root.ID() : findSmallestValue(_root.left);
	}
	
	public void Delete(BinaryStudent value)
	{
		_root = deleteRecursive(_root, value);
	}
	
	public void DescendingOrder(BinaryStudent node)
	{
		if (node != null)
		{
			DescendingOrder(node.right);
			System.out.print(" " + node.ID() + ":" + node.Name());
			DescendingOrder(node.left);
		}
	}
	
	public void Print(BinaryStudent node)
	{
		if (node != null)
		{
			System.out.print(" " + node.ID() + ":" + node.Name());
			Print(node.left);
			Print(node.right);
		}
	}
}
