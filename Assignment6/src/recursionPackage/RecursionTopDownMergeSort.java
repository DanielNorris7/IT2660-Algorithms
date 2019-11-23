package recursionPackage;

import java.util.ArrayList;

public class RecursionTopDownMergeSort 
{
	public static void main(String args[]) 
	{
		ArrayList<Integer> randomNumList = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++)
		{
			randomNumList.add((int)(Math.random() * 100));
		}
		
		ArrayList<Integer> sortedList = mergeSort(randomNumList);
		System.out.println("Unsorted List");
		
		for (int i = 0; i < randomNumList.size(); i ++)
		{
			System.out.println(randomNumList.get(i));
		}
		
		System.out.println("---");
		System.out.println("Sorted List:");
		
		for (int i = 0; i < sortedList.size(); i ++)
		{
			System.out.println(sortedList.get(i));
		}
			
	}
	
	private static ArrayList<Integer> mergeSort(ArrayList<Integer> recursionCollection) 
	{		
		// Base Case
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		
		int rSize = recursionCollection.size();
		
		if (rSize <= 1)
			return recursionCollection;

		// Find the middle
		int middle = rSize / 2;
		
		for (int i = 0; i < middle; i++) 
		{
			if (recursionCollection.get(i) != null)
				left.add(recursionCollection.get(i));
		}
		
		for (int i = middle; i < rSize; i++) 
		{
			if (recursionCollection.get(i) != null)
				right.add(recursionCollection.get(i));
		}
		
		// Recursively sort both sublist
		left = mergeSort(left);
		right = mergeSort(right);
		
		// Then merge the now-sorted sublist.
		return merge(left, right);
	}
	
	private static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right)
	{
		final ArrayList<Integer> merged = new ArrayList<Integer>();
		
		while (!left.isEmpty() && !right.isEmpty())
		{
			if (left.get(0).compareTo(right.get(0)) <= 0)
			{
				merged.add(left.remove(0));
			}
			else 
			{
				merged.add(right.remove(0));
			}
		}
		
		// Either left or right may have elements left; consume them.
		// Only one of the following iterators will be hit.
		while (!left.isEmpty())
		{
			merged.add(left.remove(0));
		}
		
		while (!right.isEmpty())
		{
			merged.add(right.remove(0));
		}
		
		return merged;
	}
}
