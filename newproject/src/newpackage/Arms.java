package newpackage;

public class Arms 
{

	public static void main(String[] args) 
	{
		int m = 153, sum =0,n;
		
		n=m;
		
		System.out.println(n);
		
		while(m>0)
		
		{
			
		
		int r = m%10;
		
		System.out.println(r);
		
		sum = sum + (r*r*r);
		
		m = m/10;
		
		System.out.println(m);
		
		}
		
		System.out.println(sum);
		
		if(n==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong");
		}

	}

}
