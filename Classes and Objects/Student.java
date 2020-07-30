import java.util.Scanner;
public class Student
{
	static int n;
	int regno;
	String name,dept;
	float m1,m2,m3,tot,avg;
	char grade;

	public void calcTotal()
	{
		tot=m1+m2+m3;
		avg=tot/3;
	}
	
	public void calcGrade()
	{
		if(avg>=90)
			grade='O';
		else if(avg>=80 && avg<90)
			grade='A';
		else if(avg>=70 && avg<80)
			grade='B';
		else if(avg>=60 && avg<70)
			grade='C';
		else
			grade='F';
	}
	
	public void input()
	{
		System.out.println("Enter Student Details: ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		regno=sc.nextInt();
		System.out.println("Enter Student Name: ");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Student Department: ");
		dept=sc.nextLine();
		System.out.println("Enter Student Marks (Separated by spaces): ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	
	public static void main(String args[])
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the number of students: ");		
		int n=sn.nextInt();
		Student s[]=new Student[n+1];
		for(int i=0;i<n;i++){
			s[i]=new Student();
			s[i].input();
			s[i].calcTotal();
			s[i].calcGrade();

		}
		
		while(true){
			int flag=0;
			System.out.println("\nDo you wish to search for a particular student?(Y-1,N-0)");
			int ch=sn.nextInt();
			if(ch==1){
				System.out.println("Enter 1 to search by department\nEnter 2 to search by ID");
				int opt=sn.nextInt();
				if(opt==2){			
					System.out.println("Enter Student ID: ");
					int id=sn.nextInt();
					for(int i=0;i<n;i++){
						if(id==s[i].regno){
							System.out.println("\n\nStudent name: "+s[i].name+"\nStudent Total: "+s[i].tot+"\nStudent Grade: "+s[i].grade);
							flag++;
						}
					}
					if(flag==0)
						System.out.println("Sorry, the specified student ID does not exist.");
				}
				else if(opt==1){
					System.out.println("Enter Student Department: ");
					sn.nextLine();
					String studept=sn.nextLine();
					System.out.println("Enter Student Name: ");
					String stuname=sn.nextLine();
					for(int i=0;i<n;i++){
						if(studept.equalsIgnoreCase(s[i].dept)&&stuname.equalsIgnoreCase(s[i].name)){
							System.out.println("\n\nStudent ID: "+s[i].regno+"\nStudent Total: "+s[i].tot+"\nStudent Grade: "+s[i].grade);
							flag++;
						}	
					}
					if(flag==0)
						System.out.println("Sorry, the specified student in the specified department does not exist.");
				}
				else
					System.out.println("Invalid Input! Enter 1 or 2 only!");
			}
			else if(ch==0){
				System.out.println("\n\nThank you!");
				System.exit(0);
				break;
			}
			else
				System.out.println("Invalid Input! Enter 0 or 1 only.");

		}
	}
}
	

