class elementfoundarray
{
	public static void main(String[] args)
	{
		int[] arr={13,11,12,15,11,17};
		int element=15;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				flag=true;
				System.out.println(element+"found @ index"+i);
			}
		}
		if(flag==false)
		{
			System.out.println(element+"not found in array");
		}
	}
}