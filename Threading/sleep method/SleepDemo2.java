public class SleepDemo2 extends Thread
{
	public void run()
	{		
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+" :"+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
		SleepDemo2 s2 = new SleepDemo2();
		s2.start();
		
		SleepDemo2 s3 = new SleepDemo2();
		s3.start();
	}
	
}