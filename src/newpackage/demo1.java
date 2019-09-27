package newpackage;

public class demo1 
{

	public static void main(String[] args) 
	{
		int x=10, y=2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(Math.pow(x, y));
		System.out.println(Math.max(x, y));
		String str=" This is a demo program ",str1=" Hello World ";
		System.out.println(str.length());
		System.out.println(str.substring(3, 15));
		System.out.println(str.concat(str1));
		System.out.println(str.contains("java"));
		System.out.println(str.charAt(6));
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf("demo"));
		System.out.println(str.replaceAll("demo", "Actual"));

	}

}
