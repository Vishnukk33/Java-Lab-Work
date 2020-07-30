/*
	Program to print a Square pattern
*/
public class PrintSquarePattern{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{				
				if((i==0)||(j==0)||(i==4)||(j==4))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
/*Output:
cs1200@wtl17:~/Desktop/Java$ javac PrintSquarePattern.java 
cs1200@wtl17:~/Desktop/Java$ java PrintSquarePattern
* * * * * 
*       * 
*       * 
*       * 
* * * * * 
*/
