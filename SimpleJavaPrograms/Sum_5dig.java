//Program to print sum of all digits of a 5 digit number
import java.util.Scanner;
public class Sum_5dig
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        m = obj.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}

/*OUTPUT
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ javac Sum_5dig.java 
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Sum_5dig 
Enter the number: 59438
Sum of Digits: 29
*/
