public class Interrupted extends Thread
{
	public void run()
	{
		System.out.println("A1 : "+Thread.interrupted());// true-----> false
		 System.out.println("A2 : "+Thread.interrupted()); //false---->true
		//System.out.println(Thread.currentThread().isInterrupted());   //true
		//System.out.println(Thread.currentThread().isInterrupted()); //true
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println("B : "+Thread.interrupted());
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread interrupted : "+e);
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Interrupted in = new Interrupted();
		in.start();
		
		in.interrupt();
	}
}