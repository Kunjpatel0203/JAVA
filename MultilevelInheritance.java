class MultilevelInheritance
{
   public static void main(String args[])
 {
	 C c = new C();
	 c.show();
	 c.display();
	 c.print();
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
class C extends B 
{
	void print()
	{
		System.out.println("Mehod of C class");
	}
}