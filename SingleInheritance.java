class SingleInheritance
{
 public static void main(String args[])
 {
	 B b = new B();
	 b.show();
	 b.display();
 } 
}
class A
{
	void show()
	{
		System.out.println("Mehod of A class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("Mehod of B class");
	}
}