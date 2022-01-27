class PrimeLoop1
{
	public static void main(String[] args) 
	{
		int i=10;
		while(i>=1)
		{
		
		boolean flag=true;
		int j=2;
		while(j<i)
		{
			if(i%j==0)
			{
				flag=false;
				
				
	   }
	     j++;
		}
	   
		
		
	
		
  if(flag==true)
		{
	System.out.println(i+"is prime");
		
		}
		else
			{
			System.out.println(i+"not prime");
	  }
		
		i--;
		}
		}
		
		
		
		
	}



