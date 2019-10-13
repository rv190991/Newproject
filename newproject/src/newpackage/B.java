package newpackage;

public class B 
{
	public A f2()		//declaring method f2 of type A
	{
		System.out.println("This is called from Class B");
		return new A();	//returning value of type A
		
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.f2();
		A a = new A();
		a.f1();
	}

}
