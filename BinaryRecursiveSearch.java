public class BinaryRecursiveSearch implements Practice2Search
{
	// Method to produce the name of the type of search we will be performing. 
	public String searchName()
	{
		return "Binary search (Recursive)";
	}

	// Method to prepare values to be searched.
	public int search(int[] arr, int target)
	{
		// Data Members.
		int lower = 0;
		int upper = arr.length - 1;

		// Sends data to the overloaded method. 
		return search(arr, target, lower, upper);
	}

	// Method to run the binary search algorithm recursively.
	public int search(int [] arr, int target, int lower, int upper)
	{
		// Data Members.
		int middleValue = (upper + lower) / 2;

		// Base case.
		if (upper < lower)
		{
			return -1;
		}

		// Checks if the middle value is the target.
		if (arr[middleValue] == target)
		{
			return middleValue;
		}

		// If the middle value is less than target, we move the lower to one index above middle.
		else if (arr[middleValue] < target)
		{
			return search(arr, target, middleValue + 1, upper);
		}

		// If the middle value is greater than the target, we move the upper down one index below middle.
		else
		{
			return search(arr, target, lower, middleValue - 1);
		}
	}
}