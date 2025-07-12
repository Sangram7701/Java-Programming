public class Length
{
    public static void main(String[] args)  // 
    {
        String name = "abc";
        String email = "sangram@gmail.com";
        String pass = "";
		String pass2 = null;

        System.out.println(name.length());   
        System.out.println(pass.length());   
		//System.out.println(pass2.length());//NullPointerException		

        int i = name.length();
        if(i == 0)
        {
            System.out.println("pass is empty");
        }
		else 
		{
			System.out.println("Valid password");
		}
    }
}
