public class Join2 extends Thread
{
	static Thread mainthread;
	public void run()
	{
		try
		{
			mainthread.join();
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child thread : "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
	 mainthread = Thread.currentThread();
		Join2 j2 = new Join2();
		j2.start();
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread : "+i);
			Thread.sleep(1000);
		}
	}
}