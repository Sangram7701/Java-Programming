public class Trim
{
    public static void main(String[] args)
    {
        String name1 = "abc   ";
		String name2 = "   abc    xyz  ";
        String email = "sangram@gmail.com";
        String pass = "";
		
		System.out.println(name1.trim());
		System.out.println(name2.trim());
		System.out.println(email.trim());
		System.out.println(pass.trim());

        if(pass.trim().length() == 0)
        {
            System.out.println("pass is empty");
        }
		else
		{
			System.out.println("Pass is given");
		}
    }
}
