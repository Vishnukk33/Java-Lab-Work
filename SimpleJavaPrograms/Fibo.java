//Program to print Fibonacci series upto n
import java.util.Scanner;
 
class Fibo
{
 	public static void main(String args[])
 	{
        	int i,c=0,n;
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a number to generate fibonacci series upto nth term");
     		n=sc.nextInt();
   		int a=0;
   		int b=1;
 		System.out.println("Fibonacci series upto "+n+" is :-");
   		while(c<=n)
   		{
       			System.out.print(c+" ");
       			a=b;
       			b=c;
       			c=a+b;
	   	}
 	}
}

/*OUTPUT
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ javac Fibo.java 
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Fibo 
Enter a number to generate fibonacci series upto nth term
25
Fibonacci series upto 25 is :-
0 1 1 2 3 5 8 13 21 
*/

