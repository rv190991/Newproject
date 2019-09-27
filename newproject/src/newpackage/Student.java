package newpackage;

public class Student 
{
	String sname, course;
	static String college;
	public void list()
	{
		System.out.println(sname+"   "+course+"    "+college);
	}
	public static void main(String[] args) 
	{
		Student.college="KITS";
		Student s1=new Student();
		s1.sname="RAVI";
		s1.course="IT";
		Student s2=new Student();
		s2.sname="KIRAN";
		s2.course="CIVIL";
		s1.list();
		s2.list();

	}

}
