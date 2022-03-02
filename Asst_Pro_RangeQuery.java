
class RangeQuery{
	static int sumOfN(int n)
	{
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	static int suminRange(int L, int R)
	{
		return sumOfN(R) - sumOfN(L - 1);
	}

	public static void main(String[] args)
	{
		int L = 10, R = 20;
		System.out.println("Sum of numbers from L to R is "+suminRange(L, R));

	}
}