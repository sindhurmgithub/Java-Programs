import java.util.Scanner;
class Scan1 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Sum is"+c);
	}
}
