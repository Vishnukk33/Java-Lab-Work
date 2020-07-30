//4. Write a program to Find the Number of Non-Repeated Elements in an Array.
import java.util.Scanner;
class Repeat
{
	public static void main(String args[])
	{
		int arr[] = new int[20];
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = obj.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element: ");
			arr[i] = obj.nextInt();
		}
		int c[] = new int[20];
		int temp=0,flag;
		c[temp] = arr[0];
		temp++;
		for(int i=1;i<n;i++)
		{
			flag = 0;
			for(int j=0;j<temp;j++)
			{
				if(arr[i]==c[j])
					flag = 1;
			}
			if(flag == 0)
			{
				c[temp] = arr[i];
				temp++;
			}
		}
		
		System.out.println("\nNumber of unique elements is: "+temp);
	}
}
/*OUTPUT:
cs1200@wtl17:~/Desktop/Java/EX2B$ javac Repeat.java 
cs1200@wtl17:~/Desktop/Java/EX2B$ java Repeat 
Enter number of elements: 5
Enter element: 3
Enter element: 4
Enter element: 6
Enter element: 6
Enter element: 5
Number of unique elements is: 4
*/

