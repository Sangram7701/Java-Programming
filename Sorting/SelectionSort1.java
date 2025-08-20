//Section sort

class SelectionSort1
{
	public static void main(String[] args)
	{
		int i,j,temp=0,min;
		int[] a = {11,2,0,6,5,10,1};
		
		for(i=0;i<a.length;i++)
		{
			min=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}