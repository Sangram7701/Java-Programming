public class Test1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread task 2");
	}
	public static void main(String[] args)
	{
		Test1 t = new Test1();
		Thread th = new Thread(t);
		th.start(); 
	}
}