/*
	Program to print a star pattern
*/
public class PrintStarPattern{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{				
				if((i==1)&&(j!=2))
					System.out.print("* ");
				else if((i==2)&&((j==1)||(j==2)))
					System.out.print(" *");
				else if((i==3)&&((j==1)||(j==3)))
					System.out.print("* ");
				else if((i==4)&&((j==0)||(j==3)))
					System.out.print(" *");
				else if((i==0)&&(j==2))
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
/*Output:
cs1200@wtl17:~/Desktop/Java$ javac PrintStarPattern.java 
cs1200@wtl17:~/Desktop/Java$ java PrintStarPattern 
    *     
* *   * * 
   * *    
  *   *   
 *     *  
*/
