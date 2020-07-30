import java.util.*;

interface stack
{
	public void push(int a) throws Overflow;
	public int pop() throws Underflow;
}

class Underflow extends Exception{
	public String toString(){
		return "Stack Underflow";
	}
}

class Overflow extends Exception{
	public String toString(){
		return "\nStack Overflow";
	}
}

class Empty extends Exception{
	public String toString(){
		return "\nStack is empty";
	}
}
	

class Stacker implements stack
{
	public int top;
	private int arr[];
	
	Stacker(int size)
	{
		top = -1;
		arr = new int[size]; 
	}
	
	public void push(int a) throws Overflow
	{
		if(top==arr.length-1)
			throw new Overflow();
		else 
		{
			top+=1;
			arr[top] = a;
		}
	}
	
	public int pop() throws Underflow
	{
		if(top==-1)
			throw new Underflow();
		else 
		{
			top-=1;
			return arr[top+1];
		}
	}
	
	public void display() throws Empty
	{
		if(top ==-1)
			throw new Empty();
		else
		{
			for(int i=top;i>=0;i--)
				System.out.println("\nOutput: "+arr[i]);
		}
	}
}
class Stack
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		Stacker S = new Stacker(6);
		int p,k;
		do
		{
			System.out.print("\n\nMENU\n1.PUSH\n2.POP\n3.Disp\n4.Exit\nChoose an option: ");
			p = obj.nextInt();
			switch(p)
			{
				case 1: 
					try
					{
						System.out.print("\nEnter input to be added: ");
						k = obj.nextInt();
						S.push(k);
						
					}
					catch(Overflow x)
					{
						System.out.println(x);
					}
						break;
				case 2:	try
					{
						k = S.pop();
						System.out.print("\nElement popped:"+k);
					}
					catch(Underflow x)
					{
						System.out.println(x);
					}
					break;
				case 3:	try
					{
						S.display();
					}
					catch(Empty x)
					{
						System.out.println(x);
					}
					break;
				case 4: System.exit(0);
				default:System.out.println("Invalid input");
			}
		}while(true);
	}
}
	
/*
OUTPUT:
cs1200@u20:~/Desktop/Java/EX6$ javac Stack.java 
cs1200@u20:~/Desktop/Java/EX6$ java Stack


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 1

Enter input to be added: 5


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 1

Enter input to be added: 2


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 1

Enter input to be added: 4


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 1

Enter input to be added: 3


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 1

Enter input to be added: 6


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 1

Enter input to be added: 7


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 1

Enter input to be added: 8

Stack Overflow


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 3

Output: 7

Output: 6

Output: 3

Output: 4

Output: 2

Output: 5


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 2

Element popped:7

MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 2

Element popped:6

MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 2

Element popped:3

MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 2

Element popped:4

MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 2

Element popped:2

MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 2

Element popped:5

MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 2
Stack Underflow


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 3

Stack is empty


MENU
1.PUSH
2.POP
3.Disp
4.Exit
Choose an option: 4
*/	
