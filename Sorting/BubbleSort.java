public class BubbleSort
{
	
	public static void main(String[] args)
	{
		
		int temp,i,j;
		
		int[] a = {7,2,10,22};
		
		for(i=0;i<a.length;i++)
		{
			int flag=0;
			for(j=0;j<a.length-1-i;j++)
			{
				
				if(a[j]>a[j+1])
				{
					
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				
				break;
				
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
			
			
	}
	
}