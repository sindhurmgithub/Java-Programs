class Con1
{
	public static void main(String[] args) 
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			if(i==5)
			{
				i++;
				continue;
			}
			i++;
		}
	}
}
