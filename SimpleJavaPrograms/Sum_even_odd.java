//Program to separately print sum of all even and odd digits of a six digit number
import java.util.Scanner;
public class Sum_even_odd
{
    	public static void main(String args[])
    	{
        	int m, n, sum_even = 0, sum_odd = 0;
        	Scanner obj = new Scanner(System.in);
        	System.out.print("Enter the number: ");
       	 	m = obj.nextInt();
        	while(m > 0)
        	{
            		n = m % 10;
			if(n%2==0)
				sum_even+=n;
			else 
				sum_odd+=n;
            		m = m / 10;
        	}
        	System.out.println("Sum of Even Digits: "+sum_even);
		System.out.println("Sum of Odd Digits: "+sum_odd);
    }
}

/*OUTPUT
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ javac Sum_even_odd.java 
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Sum_even_odd 
Enter the number: 940336
Sum of Even Digits: 10
Sum of Odd Digits: 15
*/
