class Book 
{
	String title;
	double price;
	String author;
	{
		System.out.println("non static initializer");
	}
	public void display()
	{
		System.out.println(title);
		System.out.println(price);
		System.out.println(author);
	}
	Book()
	{
		System.out.println("no argument constructor");
	}


	public static void main(String[] args) 
	{
		Book b1=new Book();
		b1.title="Harry potter";
		b1.price=230;
	                b1.author="John";
		b1.display();
	}
}
