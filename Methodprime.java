class Methodprime
{
	public static void main(String[] args) 
	{
	
		prime();
		notPrime();
		
	}
	public static void prime()
	{

		System.out.println("The prime numbers from 1 to 100");
		for(int i=1;i<=100;i++)
		{
		boolean a=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				a=false;
	
				
	}
}
		
    if(a==true)
		{
	System.out.println(i);
	
	}	
		}
	}

		public static void notPrime()
	{

		System.out.println("The non prime from 1 to 100");
		for(int i=1;i<=100;i++)
		{
		boolean a=true;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				a=false;
	
				
	}
}
		
    if(a==false)
		{
	System.out.println(i);
	
	}	
		}



}
}


