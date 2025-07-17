public class Join1 extends Thread
{
	public void run()
	{
		try
		{
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
		Join1 j = new Join1();
		j.start();
		
		j.join();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread : "+i);
			Thread.sleep(1000);
		}
	}
}