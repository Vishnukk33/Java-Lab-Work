//2. Write a program to perform linear and binary search on an array for the required element.
import java.util.Scanner;
import java.util.Arrays;
class Search
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int a[] = new int[20];	
		int n = obj.nextInt();
		int i,j;
		for(i = 0;i<n;i++)
		{
			System.out.print("Enter element ");
			a[i] = obj.nextInt();
		}
		System.out.print("Enter  element to be searched via Linear search: ");
		j = obj.nextInt();
		int flag = 0;
		for(i = 0;(i < n)&&(flag==0);i++)
		{
			if(a[i] == j)
			{
				flag = 1;
				System.out.println("Element found at "+(i+1)+" position using Linear Search");
			}
		}
		if(flag ==0)
		System.out.print("Element not found ");
		System.out.print("Enter element to be searched via Binary search: ");
		j = obj.nextInt();
		Arrays.sort(a);
		int key = j; 
        	int res = Arrays.binarySearch(a, key); 
        	if (res >= 0) 
            		System.out.println(key + " found  Using binary search"); 
     		else
            		System.out.println(key + " Not found"); 	
		
	}
}
/*OUTPUT
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ javac Search.java 
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Search
Enter number of elements: 5
Enter element 5
Enter element 4
Enter element 8
Enter element 6
Enter element 10
Enter  element to be searched via Linear search: 4
Element found at 2 position using Linear Search
Enter element to be searched via Binary search: 6
6 found Using binary search
*/
