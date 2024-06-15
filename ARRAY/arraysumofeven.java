class   arraysumofeven
{
	public static void main(String[] args)
	{
		int[]arr={12,12,15,17,16};
		int sum=0;//13,25,40,57,73
		for(int i=0;i<arr.length;i++)
		{
		if (sum%2==0)
			sum=sum+arr[i];
			
		}
			
		System.out.println("sum : "+sum);
	}                                             //39
}

