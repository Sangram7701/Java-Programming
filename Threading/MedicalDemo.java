class Medical extends Thread
{
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Medical Starts !");
				Thread.sleep(3000);
				System.out.println("Medical completed !");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
class TestDriver extends Thread
{
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Test of Driver starts!");
				Thread.sleep(5000);
				System.out.println("Test completed !");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class OfficerSign extends Thread
{
	
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Review The file!");
				Thread.sleep(3000);
				System.out.println("Sign completed!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class LicencelDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		
		Medical m =  new Medical();
		m.start();
		
		m.join();
		
		TestDriver td = new TestDriver();
		td.start();
		
		td.join();
		
		OfficerSign os = new OfficerSign();
		os.start();
		
		
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("main thread : "+i);
			Thread.sleep(1000);
		}
	}
}