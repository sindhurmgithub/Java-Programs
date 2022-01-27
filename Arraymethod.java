import java.util.Scanner;
class Arraymethod 
{
	public static int summ(int a[])

	{

		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		return sum;

	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int add=summ(a);
		System.out.println(add);
	}
}
