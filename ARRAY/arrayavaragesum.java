class   arrayavaragesum
{
	public static void main(String[] args)
	{
		int[]arr={12,12,15,17,16}; 
		int sum=0;//13,25,40,57,73
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		avg=sum/arr.length;                                                 
		System.out.println("sum : "+sum);
		
		System.out.println("avg : "+avg);
	}
}
   