package Week7;
import java.io.File;
import java.util.*;

public class Lab6_V2_LargestNum_Stack {
	public static void main(String args[]) throws Exception
	{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week7\\Lab6_V2_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
		//Number of commands, N>0
		int N = Integer.parseInt(scan.nextLine());
		//String array to hold the word and number from the commands
		String sArray[] = new String[N];
		//sNum = number that will be converted from a string, result = final result
		int sNum =0, result =0;
		//String to store command
		String s1 = new String();
		//Creating our stack
		StackInt myStack = new StackInt(N);

		//Enter N commands
		while(N > 0)
		{
			//Our command stored in s1
			s1 = scan.nextLine();
			//String method to split the String into it's components. This will put each word in a seperate position in an array
			sArray = s1.split(" ");

			//At position 0 there is always the KEYWORD (PUSH or POP)
			//If PUSH
			if(sArray[0].equalsIgnoreCase("Push") == true)
			{
				//THEN we need to push the number which was added to the array sArray into position 1.
				//Need to convert the number from a String to an actual number int
				sNum = Integer.parseInt(sArray[1]);
				//Now push the int
				myStack.push(sNum);
			}
			//if POP
			else
			{
				//Then if the stack IS NOT EMPTY then pop the number
				if(myStack.isEmpty() == false)
				{
					myStack.pop();
				}
			}

			//Need to decrease N so that the loop isnt infinite
			N--;
		}

		//We have done the commands. Now let's look at the largest number in the stack.
		//First of all, if the stack is empty
		if(myStack.isEmpty() == true)
		{
			//Return empty
			System.out.println("Your output: empty");
		}
		//If not empty
		else
		{
			//result is the number at the top of the stack for now
			result = myStack.pop();
			//while Stack IS NOT empty
			while(myStack.isEmpty() == false)
			{
				//If the number seen at the top of the stack > result
				if(myStack.peek() > result)
				{
					//Result is now the new number from the top of the stack
					result = myStack.pop();

				}
				//if number at the top < result
				else
				{
					//Then just pop it out because we dont want it
					myStack.pop();
				}
			}
			//Print the biggest number
			System.out.println("Your output: " + result);
		}
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		}

	}

}


/*
 * STACK CLASS
 */

class StackInt {
	private int maxSize;
	private int stackArray[];
	private int top;

	//Constructor
	//REMEMBER!!!!!!!!!!! 
	/*
	 * HAS TO BE THE SAME NAME AS THE CLASS FILE!!!!
	 */
	public StackInt(int s)
	{
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
	}

	//Push method
	public void push(int c)
	{
		top++;
		stackArray[top] = c;
	}

	//Pop method
	public int pop()
	{
		return stackArray[top--];

	}

	//Peek and copy
	public int peek()
	{
		return stackArray[top];
	}

	//Make empty
	public void makeEmpty()
	{
		top =-1; 
	}

	//Checks if the stack is full
	public boolean isFull()
	{
		return (top == maxSize -1);
	}

	//Checks if stack is empty
	public boolean isEmpty()
	{
		return (top == -1);
	}


}
