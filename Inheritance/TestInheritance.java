/*EXERCISE : 3A
1. The hierarchy Person -> Student or Person -> Faculty is a Single-level inheritance
type.
2. The type of above entire class hierarchy is the Hierarchical Inheritance.
3. Note the use of constructors at all levels of class hierarchy.

1. Draw the class diagram of the above class hierarchy.
2. Write a test driver called TestInheritance to test all the public methods that
display the student and faculty details.
Use the following to calculate Net Salary:
Gross salary = Basicpay + DA as 60% of basic + HRA as 10% of basic
Deductions = Medical Insurance as 8.5% of basic + PF as 8% of basic
Net salary = Gross salary – Deductions
*/
import java.util.Scanner;
class Person{
	Scanner obj = new Scanner(System.in);
	private int aadhaar;
	private String name,address;
	private char gender;
	public Person(int aadhaar,String name,String address,char gender)
	{
		this.aadhaar = aadhaar;
		this.name = name;	
		this.address = address;
		this.gender = gender;
	}
	String getName()
	{
		return this.name;
	}
	String getAddress()
	{
		return this.address;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	char getGender()
	{
		return gender;
	}
}

class Student extends Person{
	private String program;
	private int year;
	private double totalmark;
	public Student(int aadhaar,String name,String address,char gender,String program,int year,double totalmark)
	{	
		super(aadhaar,name,address,gender);
		this.year = year;
		this.program = program;
		this.totalmark = totalmark;
	}
	public String getProgram()
	{
		return program;
	}
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public double getTotal()
	{
		return totalmark;
	}
	public void setTotal(double tot)
	{
		this.totalmark = tot;
	}
	public double calGPA()
	{
		return totalmark/10;
	}
}

class Faculty extends Person{
	private String designation,department;
	private double basicpay;
	public Faculty(int aadhaar,String name,String address,char gender,String designation,String department,double pay)
	{
		super(aadhaar,name,address,gender);
		this.designation = designation;
		this.department = department;
		this.basicpay = pay;
	}
	public String getDesig()
	{
		return designation;
	}
	public void setDesig(String desig)
	{
		this.designation =desig;
	}
	public double getBasic()
	{
		return basicpay;
	}
	public double calSalary()
	{
		double DA = 0.6*basicpay;
		double HRA = 0.1*basicpay;
		double Deductions,MI,PF;
		MI = 0.085*basicpay;
		PF = 0.08*basicpay;
		Deductions = PF+MI;
		double gross = basicpay+DA+HRA;
		double Net= gross-Deductions;
		return Net;
	}
}
class TestInheritance{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("\tSTUDENT\n\n");
		Student A = new Student(555,"JIMON","St Colony",'F',"BE CSE",2,89);		
		System.out.println("Name: " + A.getName() + "\nGender: " + A.getGender() +"\nAddress: " + A.getAddress() + "\nProgram: " + A.getProgram() + "\nYear: " + A.getYear() + "\nTotal: " + A.getTotal() + "\nGPA: " + A.calGPA());
				 
		System.out.print("\n\nEnter New address: ");
		String Add;
		int yr;
		double tot;
		Add = obj.nextLine();
		A.setAddress(Add);
		System.out.print("\nEnter new Year: ");
		yr = obj.nextInt();
		A.setYear(yr);
		System.out.print("\nEnter new Total: ");			
		tot = obj.nextDouble();
		A.setTotal(tot);
		

		System.out.println("\n\n\nName: " + A.getName() + "\nGender: " + A.getGender() +"\nAddress: " + A.getAddress() + "\nProgram: " + A.getProgram() + "\nYear: " + A.getYear() + "\nTotal: " + A.getTotal() + "\nGPA: " + A.calGPA());


		System.out.println("\n\n\tFaculty\n\n");
		Faculty B = new Faculty(444,"Trey","Sholinganallur",'M',"Asst. Professor","MECH",80000);

		System.out.println("Name: " + B.getName() + "\nGender: " + B.getGender() +"\nAddress: " + B.getAddress() + "\nDesignation: " +B.getDesig() + "\nBasic: " + B.getBasic() + "\nSalary: " +B.calSalary());


		obj.nextLine();
		System.out.print("\n\nEnter New address: ");
		Add = obj.nextLine();
		B.setAddress(Add);
		System.out.print("Enter new designation: ");
		Add = obj.nextLine();
		B.setDesig(Add);
		

		System.out.println("\n\n\nName: " + B.getName() + "\nGender: " + B.getGender() +"\nAddress: " + B.getAddress() + "\nDesignation: " +B.getDesig() + "\nBasic: " + B.getBasic() + "\nSalary: " +B.calSalary());


	}
}

/*OUTPUT:
cs1200@u13:~/Desktop/Java/Inh2$ javac TestInheritance.java 
cs1200@u13:~/Desktop/Java/Inh2$ java TestInheritance 
	STUDENT


Name: JIMON
Gender: F
Address: St Colony
Program: BE CSE
Year: 2
Total: 89.0
GPA: 8.9


Enter New address: Marina

Enter new Year: 3

Enter new Total: 97



Name: JIMON
Gender: F
Address: Marina
Program: BE CSE
Year: 3
Total: 97.0
GPA: 9.7


	Faculty


Name: Trey
Gender: M
Address: Sholinganallur
Designation: Asst. Professor
Basic: 80000.0
Salary: 122800.0


Enter New address: Mylapore
Enter new designation: Professor



Name: Trey
Gender: M
Address: Mylapore
Designation: Professor
Basic: 80000.0
Salary: 122800.0
*/	





