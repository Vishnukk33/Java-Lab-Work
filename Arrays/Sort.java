//1. Write a program to sort an array.
import java.util.Scanner;
class Sort
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int a[] = new int[20];	
		int n = obj.nextInt();
		int i;
		for(i = 0;i<n;i++)
		{
			System.out.print("Enter element ");
			a[i] = obj.nextInt();
		}
		System.out.println("After sorting");
		for(i = 0;i<n-1;i++)
		{
			for( int j = 0;j<n-i-1;j++)
			{	
				if(a[j]>a[j+1])
				{
					int c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				}
			}
		}
		for(i = 0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
/*OUTPUT
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ javac Sort.java 
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Sort 
Enter number of elements: 10
Enter element 5
Enter element 7
Enter element 4
Enter element 7
Enter element 10
Enter element 5
Enter element 9
Enter element 3
Enter element 6
Enter element 3
After sorting
3 3 4 5 5 6 7 7 9 10
*/

