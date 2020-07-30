import java.util.*;
import java.io.*;

public class Stack<T>
{
	ArrayList<T> st = new ArrayList<T> ();
     	int top = 0;
   
     	public int size() 
     	{
     		return top; 
     	}
   
	public void push (T item)
	{
        	st.add(top, item);
        	top+=1;
     	}
  
     	public T pop () 
     	{
        	return st.remove(--top);
     	}
     	public void disp()
     	{
     		int i = top;
     		while(i>=0)
     		{
     			System.out.println("Element : "+ st.get(i));
     			i--;
     		}
     	}
     	public static void main(String args[])
     	{
     		Scanner obj = new Scanner(System.in);
     		
     		System.out.println("TYPE of Stack:\n1.String\n2.Integer\n3.Double\n4.float\nEnter choice: ");
     		int p = obj.nextInt();
     		switch(p)
     		{
     			case 1: {
     				Stack<String> S = new Stack<String>();
     				do
     				{
	     				System.out.println("STACK MENU\n1.Push element\n2.Pop element\n3.Display Stack\n4.Size\n5.Exit\nEnter your choice");
	     				int t = obj.nextInt();
	     				switch(t)
	     				{
	     					case 1:	System.out.println("\nEnter element to be pushed: ");
	     						String l = obj.nextLine();
	     						S.push(l);
	     						break;
	     					case 2: System.out.print("\nElement popped is :"+S.pop());
	     						break;
	     					case 3: System.out.print("\nStack:\n");
	     						S.disp();
	     						break;
	     					case 4: System.out.println("Size of stack is: "+S.size());
	     						break;
	     					case 5: System.exit();
	     						break;
	     					default:System.out.println("Invalid input");
	     				}
	     			}while(true);
	     			break;
	     			}
	     		case 2:	{Stack<Integer> S = new Stack<Integer>();
     				do
     				{
	     				System.out.println("STACK MENU\n1.Push element\n2.Pop element\n3.Display Stack\n4.Size\n5.Exit\nEnter your choice");
	     				int t = obj.nextInt();
	     				switch(t)
	     				{
	     					case 1:	System.out.println("\nEnter element to be pushed: ");
	     						int l = obj.nextInt();
	     						S.push(l);
	     						break;
	     					case 2: System.out.print("\nElement popped is :"+S.pop());
	     						break;
	     					case 3: System.out.print("\nStack:\n");
	     						S.disp();
	     						break;
	     					case 4: System.out.println("Size of stack is: "+S.size());
	     						break;
	     					case 5: System.exit();
	     						break;
	     					default:System.out.println("Invalid input");
	     				}
	     			}while(true);
	     			break;}
     			case 3:{ Stack<Double> S = new Stack<Double>();
     				do
     				{
	     				System.out.println("STACK MENU\n1.Push element\n2.Pop element\n3.Display Stack\n4.Size\n5.Exit\nEnter your choice");
	     				int t = obj.nextInt();
	     				switch(t)
	     				{
	     					case 1:	System.out.println("\nEnter element to be pushed: ");
	     						Double l = obj.nextDouble();
	     						S.push(l);
	     						break;
	     					case 2: System.out.print("\nElement popped is :"+S.pop());
	     						break;
	     					case 3: System.out.print("\nStack:\n");
	     						S.disp();
	     						break;
	     					case 4: System.out.println("Size of stack is: "+S.size());
	     						break;
	     					case 5: System.exit();
	     						break;
	     					default:System.out.println("Invalid input");
	     				}
	     			}while(true);
	     			break;}
     			case 4: {Stack<Float> S = new Stack<Float>();
     				do
     				{
	     				System.out.println("STACK MENU\n1.Push element\n2.Pop element\n3.Display Stack\n4.Size\n5.Exit\nEnter your choice");
	     				int t = obj.nextInt();
	     				switch(t)
	     				{
	     					case 1:	System.out.println("\nEnter element to be pushed: ");
	     						Float l = obj.nextFloat();
	     						S.push(l);
	     						break;
	     					case 2: System.out.print("\nElement popped is :"+S.pop());
	     						break;
	     					case 3: System.out.print("\nStack:\n");
	     						S.disp();
	     						break;
	     					case 4: System.out.println("Size of stack is: "+S.size());
	     						break;
	     					case 5: System.exit();
	     						break;
	     					default:System.out.println("Invalid input");
	     				}
	     			}while(true);
	     			break;}
	     		case 5: exit(0);
	     			break;
	     	}
     	}
}
