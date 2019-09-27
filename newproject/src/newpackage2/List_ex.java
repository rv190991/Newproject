package newpackage2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;

public class List_ex 
{

	public static void main(String[] args) 
	{
		List<String> ls = new ArrayList<String>();
		ls.add("Selenium");
		ls.add("testing");
		ls.add("java");
		ls.add("testing");
		ls.add("qtp");
		ls.add("loadrunner");
		ls.add("webdriver");
		ls.add("soapui");
		
		ls.add(2, "linux");
		ls.remove(7);
		for(String x : ls)
		{
			System.out.println(x);
		}
		System.out.println("=================");
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("hari");
		ts.add("kumar");
		ts.add("john");
		ts.add("abhi");
		ts.add("charan");
		ts.add("bobby");
		
		for(String x : ts)
		{
			System.out.println(x);
		}
		System.out.println("=================");
		Stack<String> s=new Stack<String>();
		s.add("hari");
		s.add("kumar");
		s.add("john");
		s.add("abhi");
		s.add("charan");
		s.add("bobby");
		
		for(String x : s)
		{
			System.out.println(x);
		}

	}

}
