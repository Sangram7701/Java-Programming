public class Pattern5
{
    public static void main(String[] args)
    {
        System.out.println("Hello ji");
        for(int i=1; i<=5; i++)
        {
            // Print spaces first
            for(int space=1; space<i; space++)
            {
                System.out.print(" ");
            }

            // Print stars
            for(int j=5; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
