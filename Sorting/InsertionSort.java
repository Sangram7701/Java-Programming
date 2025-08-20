class InsertionSort
{
	public static void main(String[] args)
	{
		int temp,j;
		int[] a = {2,5,6,8,4,8,1,0,9};
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0&&a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
}