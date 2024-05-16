interface A
{
	final int a=10;
	public void show();
}
interface B extends A     //Interface inherited from another interface
{
	final int b=20;
	public void display();
}
class C implements B     
{
	public void show()
	{
		System.out.println("Value of variable a=" +a);
	}
	public void display()
	{
		System.out.println("Value of variable b=" +b);
	}
}
class IntetfaceInheritance
{
	public static void main(String args[])
	{
	C c1= new C();
	c1.show();
	c1.display();
	}
}