package newpackage;

public class cahrrpt 
{

	public static void main(String[] args) 
	{
		String str="this is sample data";
		String str1=(str.replace("t", ""));
		System.out.println("t is repeated for : "+(str.length()-str1.length()));
		String str2=(str.replace("h", ""));
		System.out.println("h is repeated for : "+(str.length()-str2.length()));
		String str3=(str.replace("s", ""));
		System.out.println("s is repeated for : "+(str.length()-str3.length()));
		String str4=(str.replace("a", ""));
		System.out.println("a is repeated for : "+(str.length()-str4.length()));
		String str5=(str.replace("i", ""));
		System.out.println("i is repeated for : "+(str.length()-str5.length()));
		String str6=(str.replace(" ", ""));
		System.out.println("space is repeated for : "+(str.length()-str6.length()));
		String str7=(str.replace("e", ""));
		System.out.println("e is repeated for : "+(str.length()-str7.length()));

	}

}
