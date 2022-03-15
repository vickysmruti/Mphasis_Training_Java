public class Hello {

	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println(a);
		
		System.out.println("Performing Implicit Type Casting");
		long b=a;
		System.out.println(b);
		float c=a;
		System.out.println(c);
		double d=a;
		System.out.println(d);
		
		System.out.println("Performing Explicit Type Casting");
		double x=81.7;
		System.out.println(x);
		int y = (int)x;
		System.out.println(y);

	}
	
}
