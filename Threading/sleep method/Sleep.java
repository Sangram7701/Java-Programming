public class Sleep extends Thread
{
	public void run()
	{
		for (int i=1;i<=6;i++)
		{
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws Exception
	{
		Sleep s1 = new Sleep();
		s1.start();
	}
	
}