/*
 * What's on top of the stack?
 * 
 * Manipulate a stack according to the given push and pop commands and then output the number
 * that is at the top of the stack.
 * If a pop command is issued for an empty stack then nothing should happen.
 * 
 * Input format:
 * The first line is a number N, which indicates the number of commands to follow.
 * This is followed by N lines, each of which consists of the word PUSH or POP.
 * The word PUSH will be followed by an integer n.
 * 
 * Output format:
 * Output the integer that is at the top of the stack following the given commands.
 * If the stack is empty output "empty".
 */

package Week7;

import java.io.*;
import java.util.*;

public class Lab6_V1_TopOfStack {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week7\\Lab6_V1_Input.txt");
		Scanner in = new Scanner(input);

		while(in.hasNext()){
			//Number of commands, N>0
			int N = in.nextInt();
			//String array to hold the word and number from the commands
			String sArray[] = new String[N];
			//sNum = number that will be converted from a string, result = final result
			int sNum =0, result =0;
			//String to store command
			String s1 = new String();
			//Creating our stack
			StackTop myStack = new StackTop(N);

			//Enter N commands
			while(N > -1)
			{
				//Our command stored in s1
				s1 = in.nextLine();
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

			if(myStack.isEmpty()){
				System.out.println("Your output: " + "empty");
			}
			else {
				System.out.println("Your output: " + myStack.peek());
			}

			System.out.println(in.nextLine());
			System.out.println(in.nextLine());
		}
	}
}




class StackTop {
	private int maxSize;
	private int stackArray[];
	private int top;

	/* Constructor
	 * REMEMBER!!!!!!!!!!! 
	 * HAS TO BE THE SAME NAME AS THE CLASS FILE!!!!
	 */
	public StackTop(int size)
	{
		maxSize = size;
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
		int tempTop = top;
		top--;
		return stackArray[tempTop];

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
