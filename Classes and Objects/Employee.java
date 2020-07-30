import java.util.Scanner;



public class Employee{
	double id,basic,DA,HRA,LIC,PF,n;
	String designation,name;
	int dobd,dobm,doby;
	int dojd,dojm,dojy;
	double gross,net,deductions,hourlywage;

	public void input()
	{	
		Scanner inp=new Scanner(System.in);	
		System.out.print("\nEnter Employee name: ");
		name = inp.nextLine();
		System.out.print("\nEnter Employee designation: ");
		designation = inp.nextLine();
		System.out.print("\nEnter Employee ID: ");
		id = inp.nextDouble();
		System.out.print("\nEnter no of hours worked");
		n = inp.nextDouble();		
		System.out.print("\nEnter date of birth");
		dobd = inp.nextInt();
		dobm = inp.nextInt();
		doby = inp.nextInt();
		System.out.print("\nEnter date of join");
		dojd = inp.nextInt();
		dojm = inp.nextInt();
		dojy = inp.nextInt();
		System.out.print("\nHas the employee opted for LIC premium insurance?(Enter amount per month to be deducted if yes;Enter zero if no");
		LIC  = inp.nextDouble();
		System.out.print("\nEnter Basic Pay");
		basic = inp.nextDouble();
		System.out.print("\nEnter hourly wage");
		hourlywage = inp.nextDouble();
	}

	public void calc()	
	{
		if(designation.equals("Intern"))
		{
			
			DA = 2000;
			HRA = 1000;
			PF = 500;
			gross = (n*hourlywage)+DA+HRA;
			deductions = LIC + PF;
			net = gross - deductions;
		}
		else if(designation.equals("Manager"))
		{

			DA = 0.4*basic;
			HRA = 0.1*basic;
			PF = 0.08*basic;
			gross = basic+DA+HRA;
			deductions = LIC + PF;
			net = gross - deductions;

		}
		else 
		{
			DA = 0.3*basic;
			HRA = 0.1*basic;
			PF = 0.08*basic;
			gross = basic+DA+HRA;
			deductions = LIC + PF;
			net = gross - deductions;

		}
	}
	public void disp()
	{
		System.out.println("\n\nEmployee name: "+name );
		System.out.println("\nDesignation: "+designation );
		System.out.println("\nGross pay= "+gross );
		System.out.println("\nDeductions = "+deductions );
		System.out.println("\nNet Pay= "+net);
		System.out.println();
		
	}
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);	
		System.out.print("Enter no of employees to be added: ");
		int no;
		no =  inp.nextInt();
		Employee a[] = new Employee[no];
		for(int i=0;i<no;i++)
		{
			a[i] = new Employee();
			a[i].input();
			if(a[i].dojy<2015)
				a[i].designation = "Manager";
			a[i].calc();
			a[i].disp();
		}
	}
}	

/*output:
cs1200@wtl17:~/Desktop/Java/Ex2$ java Employee 
Enter no of employees to be added: 1

Enter Employee name: Vishnu

Enter Employee designation: Manager

Enter Employee ID: 20

Enter no of hours worked90

Enter date of birth 09 05 2001

Enter date of join 09 07 2018

Has the employee opted for LIC premium insurance?(Enter amount per month to be deducted if yes;Enter zero if no 0

Enter Basic Pay2000

Enter hourly wage700


Employee name: Vishnu

Designation: Manager

Gross pay= 3000.0

Deductions = 160.0

Net Pay= 2840.0
*/
