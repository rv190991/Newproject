package newpackage;

public class Numextrct 
{

	public static void main(String[] args) 
	{
		/*String str="this is data 123 and 456 are 45564";
		String digits=str.replaceAll("[^0-9]", "");
		System.out.println(digits);*/
		String str1="automation";
		StringBuilder sb=new StringBuilder();
		for(char ch:str1.toCharArray())
		{
			char c = Character.toUpperCase(ch);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				sb.append(c);
			}
			else
			{
				sb.append(ch);
			}
			
		}
		System.out.println(str1);
		System.out.println(sb.toString());
	}

}
