import java.io.FileInputStream;

class Test
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fis = new FileInputStream("d:/ab.txt");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}