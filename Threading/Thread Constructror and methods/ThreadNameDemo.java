public class ThreadNameDemo
{
	public static void main(String[] args)
	{
		System.out.println("Hello ji");
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Sangram");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}