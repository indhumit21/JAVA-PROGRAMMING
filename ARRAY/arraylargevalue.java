class arraylargevalue
{
	public static void main(String[] args)
	{
		
	int[] arr={13,12,15,17,16};
	int large=arr[0]; //13,15,17
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i] > large)
		{
			large=arr[i];
		}
	}
	System.out.println("large values : "+large);
	}
	
}
