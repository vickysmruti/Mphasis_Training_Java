
class ArrayRot {
	/*Function to left rotate arr[] of size n by d*/
	void leftRotate(int arr[], int d, int n)
	{
		for (int i = 0; i < d; i++)
			leftRotatebyOne(arr, n);
	}

	void leftRotatebyOne(int arr[], int n)
	{
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[n-1] = temp;
	}

	void printArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args)
	{
		ArrayRot rotate = new ArrayRot();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		rotate.leftRotate(arr, 3, 9);
		rotate.printArray(arr, 9);
	}
}
