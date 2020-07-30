/*
	Program to generate electricity bill
*/

import java.util.Scanner;
public class ElectricityBill{
	double  Consumerno;
	String  Consumername;
	String  type;
	double Previousmonth;
	double Currentmonth;
	public double total;

	public void input()
	{
		Scanner inp = new Scanner(System.in);		
		System.out.print("\nEnter Consumer name: ");
		Consumername = inp.nextLine();
		System.out.print("\nEnter Connection type: ");
		type = inp.nextLine();
		System.out.print("\nEnter Consumer number: ");
		Consumerno = inp.nextDouble();
		System.out.print("\nEnter Previous month readings: ");
		
		Previousmonth = inp.nextDouble();		
		System.out.print("\nEnter Current month readings: ");
		Currentmonth = inp.nextDouble(); 
	}s

	public void calc()	
	{
		if(type.equals("commercial"))
		{
			System.out.print("\nCommercial type calculation is used");
			if(Currentmonth>500)
				total = 2000 + 450 + ((Currentmonth-500)*7);
			else if(Currentmonth>200)
				total = 200 + 450 + ((Currentmonth-200)*6);
			else if(Currentmonth>100)
				total = 200 + ((Currentmonth-100)*4.5);
			else 
				total = 2*Currentmonth;
		}
		else 
		{
			System.out.print("\nDomestic type calculation is used");
			if(Currentmonth>500)
				total = 100 + 250 + 1200 + ((Currentmonth-500)*6);
			else if(Currentmonth>200)
				total = 100 + 250 + ((Currentmonth-200)*4);
			else if(Currentmonth>100)
				total = 100 + ((Currentmonth-100)*2.5);
			else 
				total = Currentmonth;
		}
	}
	public static void main(String args[]){

		ElectricityBill a = new ElectricityBill();
		a.input();
		a.calc();
		System.out.println("The total is calculated to be: "+a.total);

	}
}	
/*Output
cs1200@wtl17:~/Desktop/Java/Ex2$ java ElectricityBill

Enter Consumer name: Vish

Enter Connection type: Domestic

Enter Consumer number: 5

Enter Previous month readings: 350

Enter Current month readings: 300

Domestic type calculation is used

The total is calculated to be: 750.0
cs1200@wtl17:~/Desktop/Java/Ex2$ java ElectricityBill

Enter Consumer name: Vishnu

Enter Connection type: commercial

Enter Consumer number: 6

Enter Previous month readings: 900

Enter Current month readings: 450

Commercial type calculation is used

The total is calculated to be: 2150.0
*/
