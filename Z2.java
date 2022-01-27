class Z2
{
	int eid;
    Z2(int eid){
		this.eid=eid;
	}
	public String toString()
	{
		return "eid"+eid;
	}

	public static void main(String[] args) 
	{
		Z2 z=new Z2(1);
		System.out.println(z);
		System.out.println(z.toString());
	}
}
