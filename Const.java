class Const
{
	Const(int a)
	{
		System.out.println(a);
	}
   Const(double b,double c)
	{
		System.out.println(b+ " "+c);
	}
	Const(int a,double b)
	{
		System.out.println(a+" "+b);
	}
	Const(double a,int b)
	{
		System.out.println(a+" "+b);
	}





	public static void main(String[] args) 
	{
		Const c1=new Const(10);
		Const c2=new Const(12.0,12.5);
		Const c3=new Const(10,12.5);
		Const c4=new Const(12.6,13);
		
	}
}
