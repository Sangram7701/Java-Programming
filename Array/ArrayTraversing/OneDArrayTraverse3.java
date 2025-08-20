//Fourth way to traverse 1D array using do-while loop

class OneDArrayTraverse3
{
	
	public static void main(String[] args)
	{
		
		int[] a = {10,20,30,40};
		
		int i=0;
		
		do
		{
			
			System.out.print(a[i]+" ");
			i++;
			
		}while(i<a.length);
		
	}
	
}