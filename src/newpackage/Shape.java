package newpackage;

public abstract class Shape 
{
	int sides, area;
	int x=10;
	public Shape()
	{
		System.out.println("constructor of Shape class");
	}
	public abstract void draw();
	
}
