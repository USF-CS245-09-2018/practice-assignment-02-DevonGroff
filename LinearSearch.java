public class LinearSearch implements Practice2Search
{
	// Method to produce the name of the type of search we will be performing. 
	public String searchName()
	{
		return "Linear search";
	}

	// Method to run the linear search algorithm. 
	public int search(int [] arr, int target)
	{
		// Loops through the entire loop from start to finish.
		for (int i = 0; i < arr.length; i++)
		{
			// Conditional to find the target and return it if found. 
			if (arr[i] == target)
			{
				return i;
			}
		}
		
		// Returns -1 if it cannot find the target.
		return -1;
	}
}