/*
Develop a Java application with Employee class with Emp_name, Emp_id, Address, Mail_id,
Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate Professor
and Professor from employee class. Add Basic Pay (BP) as the member of all the inherited classes
with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund.
Generate pay slips for the employees with their gross and net salary.
*/
import java.util.Scanner;
class Employee{
	String Emp_name;
	int Emp_id;
	String address;
	String Mail_Id;
	String Mobile_no;
	Employee(String Emp_name, int Emp_id, String address, String Mail_Id, String Mobile_no){
		this.Emp_name = Emp_name;
		this.Emp_id = Emp_id;
		this.address = address;
		this.Mail_Id = Mail_Id;
		this.Mobile_no = Mobile_no;
	}
}

class Programmer extends Employee{
	double bp;
	double gp;
	double np;
	double hra, da, pf, ded;
	Programmer(String Emp_name, int Emp_id, String address, String Mail_Id, String Mobile_no, double bp){
		super(Emp_name, Emp_id, address, Mail_Id, Mobile_no);
		this.bp = bp;
	}	
	public void calcSal(){
		hra = 0.1 * bp;
		da = 0.97 * bp;
		pf = 0.12 * bp;
		ded = pf;
		gp = bp + hra + da;
		np = gp - ded;
	}
	public void payslip(){
		System.out.println("Name: " + Emp_name + "\nID: " + Emp_id + "\nAddress: " + address + "\nEmail ID: " + Mail_Id + "\nMobile Number: " + Mobile_no);
		System.out.println("Basic Pay: " + bp + "\nHRA: " + hra + "\nDA " + da + "\nProvident Fund: " + pf + "\nDeductions: " + ded + "\nGross Pay: " + gp + "\nNet Pay: " + np);	
	}
}

class AssociateProfessor extends Employee{
	double bp;
	double cf;
	double gp;
	double np;
	double hra, da, pf, ded;
	AssociateProfessor(String Emp_name, int Emp_id, String address, String Mail_Id, String Mobile_no, double bp){
		super(Emp_name, Emp_id, address, Mail_Id, Mobile_no);
		this.bp = bp;
	}
	public void calcSal(){
		cf = 0.001 * bp;
		hra = 0.1 * bp;
		da = 0.97 * bp;
		pf = 0.12 * bp;
		ded = pf + cf;
		gp = bp + hra + da;
		np = gp - ded;
	}
	public void payslip(){
		System.out.println("Name: " + Emp_name + "\nID: " + Emp_id + "\nAddress: " + address + "\nEmail ID: " + Mail_Id + "\nMobile Number: " + Mobile_no);
		System.out.println("Basic Pay: " + bp + "\nHRA: " + hra + "\nDA " + da + "\nProvident Fund: " + pf + "\nClub Fund: " + cf + "\nDeductions: " + ded + "\nGross Pay: " + gp + "\nNet Pay: " + np);	
	}
}

class AssistantProfessor extends Employee{
	double bp;
	double cf;
	double gp;	
	double np;
	double hra, da, pf, ded;
	AssistantProfessor(String Emp_name, int Emp_id, String address, String Mail_Id, String Mobile_no, double bp){
		super(Emp_name, Emp_id, address, Mail_Id, Mobile_no);
		this.bp = bp;
	}
	public void calcSal(){
		cf = 0.001 * bp;
		hra = 0.1 * bp;
		da = 0.97 * bp;
		pf = 0.12 * bp;
		ded = pf + cf;
		gp = bp + hra + da;
		np = gp - ded;
	}
	public void payslip(){
		System.out.println("Name: " + Emp_name + "\nID: " + Emp_id + "\nAddress: " + address + "\nEmail ID: " + Mail_Id + "\nMobile Number: " + Mobile_no);
		System.out.println("Basic Pay: " + bp + "\nHRA: " + hra + "\nDA " + da + "\nProvident Fund: " + pf + "\nClub Fund: " + cf + "\nDeductions: " + ded + "\nGross Pay: " + gp + "\nNet Pay: " + np);	
	}
}

class Professor extends Employee{
	double bp;
	double cf;
	double gp;
	double np;
	double hra, da, pf, ded;
	Professor(String Emp_name, int Emp_id, String address, String Mail_Id, String Mobile_no, double bp){
		super(Emp_name, Emp_id, address, Mail_Id, Mobile_no);
		this.bp = bp;
	}
	public void calcSal(){
		cf = 0.001 * bp;
		hra = 0.1 * bp;
		da = 0.97 * bp;
		pf = 0.12 * bp;
		ded = pf + cf;
		gp = bp + hra + da;
		np = gp - ded;
	}
	public void payslip(){
		System.out.println("Name: " + Emp_name + "\nID: " + Emp_id + "\nAddress: " + address + "\nEmail ID: " + Mail_Id + "\nMobile Number: " + Mobile_no);
		System.out.println("Basic Pay: " + bp + "\nHRA: " + hra + "\nDA " + da + "\nProvident Fund: " + pf + "\nClub Fund: " + cf + "\nDeductions: " + ded + "\nGross Pay: " + gp + "\nNet Pay: " + np);		
	}
}

public class EmployeeProg{

	public static void main(String args[]){
		int op;
		String emp_name;
		int emp_Id;
		String add;
		String mail_Id;
		String mobile_no;
		double bp;
		Scanner obj = new Scanner(System.in);
		System.out.println("MENU: Payslip for - \n1. Programmer\n2. Associate Professor\n3. Professor\n4. Assistant Professor\n5. Exit");
		do{
			System.out.println("Enter option: ");
			op = obj.nextInt();

			switch(op){
				case 1:	
						System.out.println("\nEnter name: ");
						emp_name = obj.nextLine();
						obj.nextLine();
						System.out.println("\nEnter ID: ");
						emp_Id = obj.nextInt();
						obj.nextLine();						
						System.out.println("\nEnter Address: ");
						add = obj.nextLine();
						System.out.println("\nEnter Mail ID: ");
						mail_Id = obj.nextLine();
						System.out.println("\nEnter Mobile Number: ");
						mobile_no = obj.nextLine();
						System.out.println("\nEnter Basic Pay: ");
						bp = obj.nextDouble();
						Programmer p = new Programmer(emp_name, emp_Id, add, mail_Id, mobile_no, bp);
						p.calcSal();
						System.out.println("Payslip: ");						
						p.payslip();			
						break;

				case 2: 
						System.out.println("\nEnter name: ");
						emp_name = obj.nextLine();
						obj.nextLine();
						System.out.println("\nEnter ID: ");
						emp_Id = obj.nextInt();
						obj.nextLine();						
						System.out.println("\nEnter Address: ");
						add = obj.nextLine();
						System.out.println("\nEnter Mail ID: ");
						mail_Id = obj.nextLine();
						System.out.println("\nEnter Mobile Number: ");
						mobile_no = obj.nextLine();
						System.out.println("\nEnter Basic Pay: ");
						bp = obj.nextDouble();
						AssistantProfessor ap = new AssistantProfessor(emp_name, emp_Id, add, mail_Id, mobile_no, bp);
						ap.calcSal();
						System.out.println("Payslip: ");					
						ap.payslip();									
						break;

				case 3: 
						System.out.println("\nEnter name: ");
						emp_name = obj.nextLine();
						obj.nextLine();						
						System.out.println("\nEnter ID: ");
						emp_Id = obj.nextInt();
						obj.nextLine();						
						System.out.println("\nEnter Address: ");
						add = obj.nextLine();
						System.out.println("\nEnter Mail ID: ");
						mail_Id = obj.nextLine();
						System.out.println("\nEnter Mobile Number: ");
						mobile_no = obj.nextLine();
						System.out.println("\nEnter Basic Pay: ");
						bp = obj.nextDouble();
						Professor p1 = new Professor(emp_name, emp_Id, add, mail_Id, mobile_no, bp);					
						p1.calcSal();
						System.out.println("Payslip: ");
						p1.payslip();			
						break;

				case 4:	
						System.out.println("\nEnter name: ");		
						emp_name = obj.nextLine();
						obj.nextLine();					
						System.out.println("\nEnter ID: ");
						emp_Id = obj.nextInt();
						obj.nextLine();						
						System.out.println("\nEnter Address: ");
						add = obj.nextLine();
						System.out.println("\nEnter Mail ID: ");
						mail_Id = obj.nextLine();
						System.out.println("\nEnter Mobile Number: ");
						mobile_no = obj.nextLine();
						System.out.println("\nEnter Basic Pay: ");
						bp = obj.nextDouble();
						AssociateProfessor ascp = new AssociateProfessor(emp_name, emp_Id, add, mail_Id, mobile_no, bp);	
						ascp.calcSal();
						System.out.println("Payslip: ");					
						ascp.payslip();			
						break;
				case 5: break;
				default: System.out.println("Invalid Input!");
			}	
		}while(op!=5);
	}
}

/* OUTPUT:
MENU: Payslip for - 
1. Programmer
2. Associate Professor
3. Professor
4. Assistant Professor
5. Exit
Enter option: 
1

Enter name: 
Sid

Enter ID: 
45

Enter Address: 
3 Park Av

Enter Mail ID: 
methw@gmail.com

Enter Mobile Number: 
4858483

Enter Basic Pay: 
40000

Payslip:
Name: 
ID: 45
Address: 3 Park Av.
Email ID: methw@gmail.com
Mobile Number: 4858483
Basic Pay: 40000.0
HRA: 4000.0
DA 38800.0
Provident Fund: 4800.0
Deductions: 4800.0
Gross Pay: 82800.0
Net Pay: 78000.0
Enter option: 
4

Enter name: 
Raj

Enter ID: 
58

Enter Address: 
5 Park St

Enter Mail ID: 
reath@gmail.com

Enter Mobile Number: 
58483848

Enter Basic Pay: 
50000

Payslip:
Name: 
ID: 58
Address: 5 Park St
Email ID: reath@gmail.com
Mobile Number: 58483848
Basic Pay: 50000.0
HRA: 5000.0
DA 48500.0
Provident Fund: 6000.0
Club Fund: 50.0
Deductions: 6050.0
Gross Pay: 103500.0
Net Pay: 97450.0
Enter option: 
5

*/
