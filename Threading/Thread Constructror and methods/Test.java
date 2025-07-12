public class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread task is printed by : "+Thread.currentThread().getName());
	}
	public static void main(String[] args)
	{
		System.out.println("Hello is printed by : "+Thread.currentThread().getName());
		Test t1 = new Test();
		t1.start();
		
		Test t2 = new Test();
		t2.start();
		
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
	
}