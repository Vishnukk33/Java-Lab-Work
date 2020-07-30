//Program to ask the user's name and greets the user after converting the name to uppercase
import java.util.Scanner;
class Greet
{
	public static void main(String args[])
	{
		System.out.print("Enter your name: ");
		Scanner obj = new Scanner(System.in);
		String s;
		s = obj.nextLine();
		String s1 = s.toUpperCase();
		System.out.print("Hello "+s1+" , Nice to meet you!");
	}
}
/*OUTPUT
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Greetc Greet.java
vishnu@vishnu-G7-7588:~/Desktop/JAVA$ java Greet 
Enter your name: Vishnu
Hello VISHNU , Nice to meet you!
*/
