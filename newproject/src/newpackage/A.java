package newpackage;

public class A 
{
	public void f1() 	//declaring method f1
	{
		System.out.println("This is called from Class A");
	}
	public static void main(String[] args) 
	{
		A a= new A();
		a.f1();
	}

}
