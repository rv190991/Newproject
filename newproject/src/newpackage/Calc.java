package newpackage;

public class Calc 
{
	int x,y;
	public int add(int a,int b) 
	{
		x=a;
		y=b;
		return x+y;
	}

	public static void main(String[] args) 
	{
		Calc c=new Calc();
		int n=c.add(20, 40);
		System.out.println(n);

	}

}
