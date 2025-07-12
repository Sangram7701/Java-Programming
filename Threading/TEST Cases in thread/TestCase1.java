//performing single task from single thread

public class TestCase1 extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
	public static void main(String[] args)
	{
		TestCase1 thread1 = new TestCase1();
		thread1.start();
	}
}
