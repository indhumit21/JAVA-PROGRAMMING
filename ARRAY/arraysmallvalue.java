class arraysmallvalue
{
	public static void main(String[] args)
	{
		
	int[] arr={13,12,15,17,16};
	int small=arr[0]; //13,15,17
	for(int i=0;i>arr.length;i++)
	{
		if(arr[i] <  small)
		{
			small=arr[i];
		}
	}
	System.out.println("small values : "+small);
	}
	
}
