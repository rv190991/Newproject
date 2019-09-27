package newpackage;

public class strrpt 
{

	public static void main(String[] args) 
	{
		String s1="This is Sample data";
		String s2=s1.replace("is", "");
		System.out.println(s2);
		System.out.println("is repeated for "+((s1.length()-s2.length())/2)+" times");


	}

}
