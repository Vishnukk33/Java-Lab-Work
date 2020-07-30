import java.util.Scanner;
abstract class Person
{	String name,dob,add;
	int age;
	Person()
	{	System.out.print("enter name:");
		Scanner obj=new Scanner(System.in);
		name=obj.nextLine();
		System.out.print("enter dob:");
		dob=obj.nextLine();
		System.out.print("enter address:");
		add=obj.nextLine();
		System.out.print("enter age:");
		age=obj.nextInt();
	}
	abstract void performance();
}
class Student extends Person
{	String dept;
	char grade,extra;
	Student()
	{	super();	
		System.out.print("enter deapartment:");
		Scanner obj=new Scanner(System.in);
		dept=obj.nextLine();
		System.out.print("enter grade:");
		grade=obj.next().charAt(0);
		System.out.print("enter extracurricular activities grade:");
		extra=obj.next().charAt(0);
	}
	void performance()
	{	if(grade=='O'||extra=='O')
			System.out.print("Outstanding performance\n");
		else if(grade=='A'||extra=='A')
			System.out.print("Excellent performance\n");
		else if(grade=='B'||extra=='B')
			System.out.print("Good performance\n");
		else if(grade=='C'||extra=='C')
			System.out.print("Fair performance\n");
	}
}

class Prof extends Person
{	String dept;
	int pub,pro;
	Prof()
	{	super();
		Scanner obj=new Scanner(System.in);	
		System.out.print("enter deapartment:");
		dept=obj.nextLine();
		System.out.print("enter number of publications:");
		pub=obj.nextInt();
		System.out.print("enter number of funded projects:");
		pro=obj.nextInt();
	}
	void performance()
	{	if(pub>=25||pro>=25)
			System.out.print("Outstanding performance\n");
		else if(pub>=15||pro>=15)
			System.out.print("Excellent performance\n");
		else if(pub>=10||pro>=10)
			System.out.print("Good performance\n");
		else if(pub>=5||pro>=5)
			System.out.print("Fair performance\n");
	}
}

public class Performance
{	public static void main(String args[])
	{	Scanner obj=new Scanner(System.in);
		String des;
		int i,n;
		System.out.print("choose designation:Student or Professor:");
		des=obj.nextLine();
		if(des.equals("Student"))
		{	Student x[]=new Student[10];
			System.out.print("enter no of students:");
			n=obj.nextInt();
			for(i=0;i<n;i++)
			{	x[i]=new Student();
				x[i].performance();
			}
		}
		else if(des.equals("Professor"))
		{	Prof x[]=new Prof[10];
			System.out.print("enter no of students:");
			n=obj.nextInt();	
			for(i=0;i<n;i++)
			{	x[i]=new Prof();
				x[i].performance();
			}
		}
		else
			System.out.print("Exiting.......");
	}
}

		
		
		
