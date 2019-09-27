package newpackage;

public class C 
{

	public static void main(String[] args) 
	{
		B obj=new B();		//declaring variable obj of type B
		A x=obj.f2();       //1st Calling method f2 from class B and assigning it to variable x of type A 
		x.f1();				//2nd Calling method f1 from class A
		obj.f2().f1();		//3rd and 4th Calling methods f2 and f1 from classes B and A 

	}

}
