package myPack;

import java.lang.*;
import java.util.Scanner;
public class CurrConvertor
{
	  double DtoI(double no)
	{
		return no*71;
	}
	  double EtoI(double no)
	{
		return no*80;
	}
	  double YtoI(double no)
	{
		return no*0.69;
	}
	  double ItoD(double no)
	{
		return no*0.014;
	}
	  double ItoE(double no)
	{
		return no*0.013;
	}
	  double ItoY(double no)
	{
		return no*1.48;
	}
	public   void mainpart()
	{
		Scanner obj = new Scanner(System.in);
		CurrConvertor A = new CurrConvertor();
		System.out.println("Conversions:\n1.Dollar to INR\n2.EURO to INR\n3.Yen to INR\n4.INR to Dollar\n5.INR to EURO\n6.INR to Yen\nChoose an option and Enter number to be converted: ");
		int c;
		c = obj.nextInt();
		String s = obj.nextLine();
		try
		{	
			double no = Double.parseDouble(s);
			switch(c)
			{
				case 1:	System.out.print("Amount = "+A.DtoI(no)+" in INR\n");
					break;
				case 2:	System.out.print("Amount = "+A.EtoI(no)+" in INR\n");
					break;
				case 3:	System.out.print("Amount = "+A.YtoI(no)+" in INR\n");
					break;
				case 4:	System.out.print("Amount = "+A.ItoD(no)+" in Dollar\n");
					break;
				case 5:	System.out.print("Amount = "+A.ItoE(no)+" in Euro\n");
					break;
				case 6:	System.out.print("Amount = "+A.ItoY(no)+" in Yen\n");
					break;
				default:System.out.println("invalid option");
			}
		}
		catch (NumberFormatException t)
		{
            		System.out.print("Inalid input");
            	}
	}
}
