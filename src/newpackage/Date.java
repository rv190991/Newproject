package newpackage;

public class Date {

	public static void main(String[] args) 
	{
		String dt="19-sep-1991";
		if(dt.matches("\\d{2}\\-[a-z]{3}\\-\\d{4}"))
			System.out.println("Valid date format");
		else
			System.out.println("Invalid date ");
		
		String s1="webapp testing using webtechnologies testing using webdriver for webapplication";
		String s2=s1.replace("web", "");
		System.out.println("web is repeated for "+((s1.length()-s2.length())/3)+" times");

	}

}
