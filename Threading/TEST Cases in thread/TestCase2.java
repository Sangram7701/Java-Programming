//performing single task from multiple thread

public class TestCase2 extends Thread
{
	public void run()
	{
		System.out.println("Task 1");
	}
	public static void main(String[] args)
	{
		TestCase2 thread1 = new TestCase2();
		thread1.start();
		
		TestCase2 thread2 = new TestCase2();
		thread2.start();
		
		TestCase2 thread3 = new TestCase2();
		thread3.start();
		
		TestCase2 thread4 = new TestCase2();
		thread4.start();
	}
}
