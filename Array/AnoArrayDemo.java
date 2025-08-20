class AnoArrayDemo
{
	
	public static void main(String[] args)
	{
		
		AnoArrayDemo.sum(new int[]{10,20,30,40});
		
	}
	
	static void sum(int[] no)
	{
		
		int total = 0;
		for(int i:no)
		{
			
			total=total+i;
			
		}
		
		System.out.println("Sum of array elements are : "+total);
		
	}
}