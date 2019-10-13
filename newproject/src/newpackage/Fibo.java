package newpackage;

public class Fibo 
{

	public static void main(String[] args) 
	{
		int i1=0,i2=1,i3,limit = 100;
		
		System.out.print("  "+i1+"  ");
		
		System.out.print("  "+i2+"  ");
		
		for(i3=1;i3<=limit;i3++)
		{
			i3=i1+i2;
			
			System.out.print("  "+i3+"  ");
			
			i1=i2;
			
			i2=i3;
			
			i3 = i1+i2;
		}

	}

}
