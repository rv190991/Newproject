package newpackage;

interface Animal
{
	public void test();
}

public class Dog implements Animal 
{
		public void test() 
		{
			System.out.println("Interface method implemented");
		}
		
	public static void main(String[] args) 
	{
		Animal a = new Dog();
		
		a.test();

	}

}
