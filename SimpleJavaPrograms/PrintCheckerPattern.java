/*
	Program to print Checker pattern
*/
public class PrintCheckerPattern{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<5;i++)
		{
			if(i%2==0)
			{
				for(j=0;j<5;j++)
				{
					System.out.print("* ");
				}
			}
			else 
			{
				for(j=0;j<5;j++)
				{
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
/*Output:
cs1200@wtl17:~/Desktop/Java$ javac PrintCheckerPattern.java 
cs1200@wtl17:~/Desktop/Java$ java PrintCheckerPattern 
* * * * * 
 * * * * *
* * * * * 
 * * * * *
* * * * * 
*/

