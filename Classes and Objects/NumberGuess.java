/* 
	Program to implement the number guess game
*/ 

import java.lang.Math; 
import java.util.Scanner;

public class NumberGuess
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);		

		double key = Math.floor(Math.random()*100);
		int count = 0; 
		do 
		{
			System.out.print("Enter your guess: ");
			int number = input.nextInt();	
			if(number==key)
			{
				System.out.println("\nCongratulations you guessed the number in "+count+" tries");
				break;
			}
			else if(number<key)
			{
				System.out.println("\nYou guessed too low!");
				count++;
			}
			else if(number>key)
			{
				System.out.println("\nYou guessed too high!");
				count++;
			}
		}while(true);
	}
}

/*Output:
cs1200@wtl17:~/Desktop/Java/Ex2$ javac NumberGuess.java 
cs1200@wtl17:~/Desktop/Java/Ex2$ java NumberGuess 
Enter your guess: 50

You guessed too high!
Enter your guess: 35

You guessed too high!
Enter your guess: 25

You guessed too high!
Enter your guess: 15

You guessed too low!
Enter your guess: 20

You guessed too high!
Enter your guess: 19

You guessed too high!
Enter your guess: 18

Congratulations you guessed the number in 6 tries
*/
