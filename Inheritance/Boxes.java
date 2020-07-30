/*1. Write a java program with a class named ‘Box’ with three parameters length, width and depth.
Inherit a class named ‘BoxWeight’ from ‘Box’ with an additional member weight of the box. Inherit
‘BoxShipment’ from ‘BoxWeight’ with an additional member shipmentcost. Calculate the volume
and cost for the box on shipment.*/

import java.util.Scanner;
class Box
{
	Scanner obj = new Scanner(System.in);
	int length,width,depth;
	Box()
	{
		System.out.print("Enter legth: ");
		length = obj.nextInt();
		System.out.print("Enter width: ");
		width = obj.nextInt();
		System.out.print("Enter depth ");
		depth = obj.nextInt();
	}
}
class BoxWeight extends Box
{
	int weight,volume;
	BoxWeight()
	{	
		volume = length * width * depth;
		System.out.print("Enter Weight: ");
		weight = obj.nextInt();
	}
}
class BoxShipment extends BoxWeight
{
	int shipmentcost,costpervol;
	BoxShipment()
	{
		System.out.print("Enter Cost per Volume of shipment: ");
		costpervol = obj.nextInt();
		shipmentcost = volume * costpervol;
	}
}
class Boxes
{
	public static void main(String args[])
	{
		BoxShipment A = new BoxShipment();
		System.out.println("\nSo volume is = "+A.volume+"\n And Shipment cost = "+A.shipmentcost);
	}
}
/*OUTPUT:
cs1200@wtl17:~/Desktop/Java/EX3$ javac Boxes.java 
cs1200@wtl17:~/Desktop/Java/EX3$ java Boxes
Enter legth: 5
Enter width: 5
Enter depth 5
Enter Weight: 20
Enter Cost per Volume of shipment: 25

So volume is = 125
 And Shipment cost = 3125
*/
