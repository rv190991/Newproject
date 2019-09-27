package newpackage1;

public class Access 
{
	private int x;
	protected int y;
	public int z;
	int n;
	
	public void f1()
	{
		x=5;y=10;z=15;n=20;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(n);
		
	}
	public static void main(String[] args) 
	{
		Access obj=new Access();
		obj.f1();

	}

}
