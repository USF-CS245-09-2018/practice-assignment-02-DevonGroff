public class BinaryIterativeSearch implements Practice2Search
{
	// Method to produce the name of the type of search we will be performing. 
	public String searchName()
	{
		return "Binary search (Iterative)";
	}

	// Method to run the binary search algorithm iteratively.
	public int search(int[] arr, int target)
	{
		// Data Members
		int lower = 0;
		int upper = arr.length - 1;

		// While loop to run through values until it finds target or lower is => upper.
		while (lower <= upper) 
		{
			// Create the middle value variable.
			int middleValue = (upper + lower) / 2;
			
			// Check if the middle value is the target. 
			if (arr[middleValue] == target) 
			{
				return middleValue;
			}

			// If the middle value is less than target, we move the lower to one index above middle.
			else if (arr[middleValue] < target) 
			{
				lower = middleValue + 1;
			}

			// If the middle value is greater than the target, we move the upper down one index below middle.
			else if (arr[middleValue] > target) 
			{
				upper = middleValue - 1;
			}
		}

		// Return -1 if you cannot find the target.
		return -1;
	}
}