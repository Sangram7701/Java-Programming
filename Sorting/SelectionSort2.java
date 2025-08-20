//Section sort

class SelectionSort2
{
	public static void main(String[] args)
	{
		int i,j,min;
		String temp="";
		String[] a = {"sangram","viraj","vishal","tushar","mantasha"};
		
		for(i=0;i<a.length;i++)
		{
			min=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j].compareTo(a[min])<0)
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