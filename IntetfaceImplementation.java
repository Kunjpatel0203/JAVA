interface A
{
	final int a=10;
	public void show();
}
class B implements A     //Interface Implemented in class
{
	public void show()
	{
		System.out.println("Value of variable a= " +a);
	}
}
class IntetfaceImplementation
{
	public static void main(String args[])
	{
	B b1= new B();
	b1.show();
	}
}