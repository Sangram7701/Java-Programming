public class ThreadYield extends Thread
{
	public void run()
	{
		Thread.yield();
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
	public static void main(String[] args)
	{
		ThreadYield t = new ThreadYield();
		t.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}