public class IsEmpty
{
    public static void main(String[] args)
    {
        String name = "abc";
        String email = "sangram@gmail.com";
        String pass = "";
		String pass2 = null;

        System.out.println(name.isEmpty());   // false
        System.out.println(pass.isEmpty());   // true

        if(pass.isEmpty() == true)
        {
            System.out.println("pass is empty");
        }
		else
		{
			System.out.println("Valid password");
		}
    }
}
