package newpackage;

public class rev1 
{

	public static void main(String[] args) 
	{
		String str = "Ravi kiran Vuyyala";
		
		System.out.println("str : "+str);
		
		System.out.println("==================================");
		
		//String str1 = "Ravi kiran Vuyyala";
		
		StringBuilder rev = new StringBuilder();
		
		rev = rev.append(str);
		
		String str2 = rev.toString();
		
		System.out.println("str2 : "+str2);
		
		System.out.println("==================================");
		
		rev = rev.reverse();
		
		System.out.println("rev : "+rev);
		
		System.out.println("==================================");
		
		String rev1 = rev.toString();
		
		System.out.println("rev1 : "+rev1);
		
		System.out.println("==================================");
		
		if(str==str2)
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
		
		

	}

}
