package newpackage;

public class Class1 
{
	int x,y;
	
	public void add()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) 
	{
		Class1 c= new Class1();
		c.x=20;
		c.y=40;
		c.add();

	}

}
