//Program to print prime numbers
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number until prime numbers are to be displayed ");
		int n;
		n = obj.nextInt();
		for( int i=2;i<=n;i++)
		{
			int flag = 0;
			for(int j = 2;j<i;j++)
			{
				if(i%j==0)
					flag = 1;
			}
			if(flag ==0)
				System.out.print(" "+i+" ");
		}
	}
} 


/*OUTPUT
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ javac Prime.java 
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Prime 
Enter number until prime numbers are to be displayed 
20
 2  3  5  7  11  13  17  19 
*/
