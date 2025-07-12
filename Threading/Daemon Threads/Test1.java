public class Test1 extends Thread
{
	public void run()
	{
		System.out.println("Child thread ");
		System.out.println("Child Thread new priority : "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args)
	{
		System.out.println("Main thread old Priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Main thread new Priority : "+Thread.currentThread().getPriority());
		Test1 t = new Test1();
		t.start();
	}
}