
//Extending Thread class
class Threads extends Thread
{
	public void run()
	{
		System.out.println("Run method executed by child Thread");
	}
	public static void main(String[] args)
	{
		Threads t = new Threads();
		t.start();
		System.out.println("Main method executed by main thread");
	}
}

//Implementing Runnable interface
class Test implements Runnable {
	public void run()
	{
		System.out.println("Run method executed by child Thread");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		Thread t1 = new Thread(t);
		t1.start();
		System.out.println("Main method executed by main thread");
	}
}
