public class IsEmpty
{
    public static void main(String[] args)
    {
        String name = "abc";
        String email = "sangram@gmail.com";
        String pass = "";
		String pass2 = null;
		String pass3 = "  ";

        System.out.println(name.isEmpty());   // false
        System.out.println(pass.isEmpty());
		//System.out.println(pass2.isEmpty()); 
		System.out.println(pass3.isEmpty()); 
	

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
