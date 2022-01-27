class  Methstat
{
	public static void main(String[] args) 
	{
		Meth.method_static();
		System.out.println(Meth.c);
	}
}
class Meth
{
	static char c='A';
public static void method_static()
	{
	System.out.println("Creating static");
}
}
