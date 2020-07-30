//Matrix Addition,Multiplication and Subtraction
import java.util.Scanner;
class matrix
{
	public static void input(int a[][],int m,int n)
	{
		Scanner s = new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			for(int j = 0;j<n;j++)
			{
				System.out.print("Enter element: ");
				a[i][j] = s.nextInt();
			}
		}
	}
	static void ADD(int a[][],int b[][],int m,int n)
	{
		int c[][] = new int[5][5];
		for(int i=0;i<m;i++)
		{
			for(int j = 0;j<n;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("\nAfter Addition:");
		disp(c,m,n);
	}

	static void SUB(int a[][],int b[][],int m,int n)
	{
		int c[][] = new int[5][5];
		for(int i=0;i<m;i++)
		{
			for(int j = 0;j<n;j++)
			{
				c[i][j] = a[i][j]-b[i][j];
			}
		}
		System.out.println("\nAfter Subtraction:");
		disp(c,m,n);
	}

	static void MULT(int a[][],int b[][],int row1,int col1,int col2)
	{
		int c[][] = new int[5][5];
		for(int i=0;i<row1;i++)
		{
			for(int j = 0;j<col2;j++)
			{
				c[i][j] = 0;
				for(int k = 0;k<col1;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		}
		System.out.println("\nAfter Multiplication:");
		disp(c,row1,col2);
	}

	static void disp(int a[][], int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	
	

	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int row1,col1,row2,col2,c;
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		System.out.print("Enter number of rows of matix1: ");
		row1 = obj.nextInt();
		System.out.print("Enter number of columns of matrix1: ");
		col1 = obj.nextInt();
	
		System.out.print("Enter number of rows of matrix2: ");
		row2 = obj.nextInt();
		System.out.print("Enter number of columns of matrix2: ");
		col2 = obj.nextInt();
		do
		{
			System.out.print("\n\tMenu\n1.ADD\n2.SUBTRACT\n3.MULTIPLY\n4.EXIT\nEnter your choice: ");
			c = obj.nextInt();
			switch(c)
			{
				case 1:if((row1==row2)&&(col1==col2))
					{
				 		System.out.println("Enter elements of 1st matrix");
						input(a,row1,col1);
						System.out.println("Enter elements of 2nd matrix");
						input(b,row2,col2);
						ADD(a,b,row1,col1);
					}
					else
						System.out.println("Addition cannot be done with these matrices");
					break;	
				case 2:if((row1==row2)&&(col1==col2))
					{
				 		System.out.println("Enter elements of 1st matrix");
						input(a,row1,col1);
						System.out.println("Enter elements of 2nd matrix");
						input(b,row2,col2);
						SUB(a,b,row1,col1);
					}
					else
						System.out.println("Subtraction cannot be done with these matrices");
					break;		
				case 3:if(col1 == row2)
					{
				 		System.out.println("Enter elements of 1st matrix");
						input(a,row1,col1);
						System.out.println("Enter elements of 2nd matrix");
						input(b,row2,col2);
						MULT(a,b,row1,col1,col2);
					}
					else
						System.out.println("Multiplication cannot be done with these matrices");
					break;	
				case 4: System.exit(0);
				default: System.out.println("Invalid input!:");
			}
		}while(true);
	}
}
/*OUTPUT
cs1200@wtl17:~/Desktop/Java/EX2B$ javac matrix.java 
cs1200@wtl17:~/Desktop/Java/EX2B$ java matrix 
Enter number of rows of matix1: 2
Enter number of columns of matrix1: 2
Enter number of rows of matrix2: 2
Enter number of columns of matrix2: 2

	Menu
1.ADD
2.SUBTRACT
3.MULTIPLY
4.EXIT
Enter your choice: 1
Enter elements of 1st matrix
Enter element: 4
Enter element: 5
Enter element: 6
Enter element: 7
Enter elements of 2nd matrix
Enter element: 4
Enter element: 5
Enter element: 6
Enter element: 7

After Addition:
8 10 
12 14 

	Menu
1.ADD
2.SUBTRACT
3.MULTIPLY
4.EXIT
Enter your choice: 2
Enter elements of 1st matrix
Enter element: 4
Enter element: 6
Enter element: 7
Enter element: 8
Enter elements of 2nd matrix
Enter element: 1
Enter element: 2
Enter element: 3
Enter element: 4

After Subtraction:
3 4 
4 4 

	Menu
1.ADD
2.SUBTRACT
3.MULTIPLY
4.EXIT
Enter your choice: 3
Enter elements of 1st matrix
Enter element: 1
Enter element: 2
Enter element: 1
Enter element: 4
Enter elements of 2nd matrix
Enter element: 0
Enter element: 0
Enter element: 0
Enter element: 1

After Multiplication:
0 2 
0 4 

	Menu
1.ADD
2.SUBTRACT
3.MULTIPLY
4.EXIT
Enter your choice: 4
*/
