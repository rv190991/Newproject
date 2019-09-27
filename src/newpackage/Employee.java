package newpackage;

public class Employee 
{
	String ename, designation;
	static String dept;
	public Employee()
	{
		System.out.println("This is a constructor in Class Employee");
	}
	
	public void getdata()
	{
		System.out.println(ename+"   "+designation+"     "+dept);
	}
	public static void main(String[] args) 
	{
		Employee.dept="IT";
		Employee e1 = new Employee();
		e1.ename="Ravi";
		e1.designation="SE";
		e1.getdata();
		Employee e2= new Employee();
		e2.ename="Kiran";
		e2.designation="Tester";
		e2.getdata();

	}

}
