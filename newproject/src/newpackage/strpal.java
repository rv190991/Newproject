package newpackage;

import java.util.Scanner;

public class strpal 
{

	public static void main(String[] args) 
	{
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse of the given string is:"+rev);
		if(str.equals(rev))
		{
			System.out.println("The given string is a Pallindrome");
		}
		else
		{
			System.out.println("The given string is not a Pallindrome");
		}
	}

}
