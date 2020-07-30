import java.util.Scanner;
class Person
{
	Scanner obj = new Scanner(System.in);

	private String name,address;
	public Person(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	public String getName()
	{
		return this.name;
	}
	public String getAddress()
	{
		return this.address;
	}
	public void setAddress(String add)
	{
		this.address = add;
	}
}
class Employee extends Person
{
	private String empid,dept;
	private int basic;
	public Employee(String name,String address,String empid,String dept,int basic)
	{
		super(name,address);	
		this.empid = empid;
		this.dept = dept;
		this.basic = basic;
	}
	public String Empid()
	{
		return empid;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public void setBasic(int basic)	
	{
		this.basic = basic;
	}
	public int getBasic()
	{
		return basic;
	}
	public double calSalary()
	{
	double basic = getBasic();
		double DA = 0.6*basic;
		double HRA = 0.1*basic;
		double Deductions,MI,PF;
		MI = 0.085*basic;
		PF = 0.08*basic;
		Deductions = PF+MI;
		double gross = basic+DA+HRA;
		double Net= gross-Deductions;
		return Net;
	}
}
class Faculty extends Employee
{
	private String designation,course;
	public Faculty(String name,String address,String empid,String dept,int basic,String desig,String course)
	{
		super(name,address,empid,dept,basic);
		this.designation = desig;
		this.course = course;
	}
	public String getDesig()
	{
		return designation;
	}
	public void setDesig(String desig)
	{
		this.designation =desig;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	public String getCourse()
	{
		return this.course;
	}
	public double calSalary()
	{	double basic = getBasic();
		double DA = 0.6*basic;
		double HRA = 0.1*basic;
		double Deductions,MI,PF;
		MI = 0.085*basic;
		PF = 0.08*basic;
		Deductions = PF+MI;
		double gross = basic+DA+HRA;
		double Net= gross-Deductions;
		return Net;
	}
}

interface Student
{
	double[] a = new double[3];
	public double[] getMarks();
	public double calcGPA();
}

class ResearchAssistant extends Employee implements Student
{
	private String project,course;
	public ResearchAssistant(String name,String address,String empid,String dept,int basic,String project,String course)
	{
		super(name,address,empid,dept,basic);
		this.project = project;
		this.course = course;
	}
	public String getProject()
	{
		return this.project;
	}
	public void setCourse(String course)
	{
		this.course = course;
	}
	public String getCourse()
	{
		return this.course;
	}
	public double[] getMarks()
	{
		System.out.print("\nEnter three marks:\n");
		a[0]=obj.nextDouble();
		a[1]=obj.nextDouble();
		a[2]=obj.nextDouble();
		return a;
	}
	public double calcGPA()
	{
		double[] a = new double[3];
		a = getMarks();
		double gpa = (a[0]+a[1]+a[2])/30.0;
		return gpa;
	}
	public double calSalary()
	{	double basic = getBasic();
		double DA = 0.6*basic;
		double HRA = 0.1*basic;
		double Deductions,MI,PF;
		MI = 0.085*basic;
		PF = 0.08*basic;
		Deductions = PF+MI;
		double gross = basic+DA+HRA;
		double Net= gross-Deductions;
		return Net;
	}
}
class testpoly
{
	public static void main(String args[])
	{
		
		Scanner obj = new Scanner(System.in);
		Faculty A = new Faculty("JIMON","St Colony","987","CSE",21000,"Asst Prof","BE");		
		System.out.println("\n\nName: " + A.getName() +"\nAddress: " + A.getAddress() + "\nID: " + A.Empid() + "\nDepartment" + A.getDept() + "\nBasic: " + A.getBasic() + "\nDesignation: "+A.getDesig()+"\nCourse: "+A.getCourse()+"\nSalary: "+A.calSalary());

		ResearchAssistant B = new ResearchAssistant("PomoN","St Kolon","57","ECE",31000,"Drones","BE");		
		System.out.println("\n\nName: " + B.getName() +"\nAddress: " + B.getAddress() + "\nID: " + B.Empid() + "\nDepartment" + B.getDept() + "\nBasic: " + B.getBasic() + "\nProject: "+B.getProject()+"\nCourse: "+B.getCourse()+"\nGPA:\n"+B.calcGPA()+"\nSalary: "+B.calSalary());

				 
	}
}
/*OUTPUT:
cs1200@u13:~/Desktop/Java/poly$ javac testpoly.java 
cs1200@u13:~/Desktop/Java/poly$ java testpoly 


Name: JIMON
Address: St Colony
ID: 987
DepartmentCSE
Basic: 21000
Designation: Asst Prof
Course: BE
Salary: 32235.0

Enter three marks:
88
78
90


Name: PomoN
Address: St Kolon
ID: 57
DepartmentECE
Basic: 31000
Project: Drones
Course: BE
GPA:
8.533333333333333
Salary: 47585.0
*/
