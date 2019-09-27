package newpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Myclass 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter your Name: ");
	 BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	 String name= reader.readLine();
	 System.out.println(name);
	}
}
