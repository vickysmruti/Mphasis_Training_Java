
import java.util.Arrays;
import java.util.Collections;

class OrderStat {
	// Function to return k'th smallest
	// element in a given array
	public static int find(Integer[] arr, int k)
	{
		Arrays.sort(arr);

		return arr[k - 1];
	}

	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19, 45, 98, 63};
		int k = 4;
		System.out.print(k + "th smallest element is " + find(arr, k));
	}
}
