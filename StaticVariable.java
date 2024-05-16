class StaticVariable
{   int a=0;
	static int b=0;
	public static void main(String args[])
	{   StaticVariable ob1= new StaticVariable();
		ob1.show();
		StaticVariable ob2= new StaticVariable();
		ob2.show();
		StaticVariable ob3= new StaticVariable();
		ob3.show();
		
	}
	StaticVariable()
		{
			a++;
			b++;
		}
	void show()
		{
			System.out.println("Value of a=" +a);
			System.out.println("Value of b=" +b);
		}
}