// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Pattern6 {
    public static void main(String[] args) {
       
       for(int i=1;i<=5;i++)
       {
           for(int s=4;s>=i;s--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
		   System.out.println();
       }
       // System.out.println();
       
       for(int i=1;i<=4;i++)
       {
           for(int s=1;s<=i;s++)
           {
               System.out.print(" ");
           }
           for(int j=4;j>=i;j--)
           {
               System.out.print("*");
           }
		    System.out.println();
        }
        
       //System.out.println();
    }
}