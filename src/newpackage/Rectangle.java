package newpackage;

public class Rectangle extends Shape 
{
	public Rectangle()
	{
		System.out.println("constructor of Rectangle class");
	}
	public void draw()
	{
		System.out.println("Draw the Rectangle");
	}
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle();
		
		r.draw();
		r.x = 20;
		

	}

}
