/*
 * Use a stack to check if a sentence is a palindrome or not.
 * A palindromic sentence is one that reads the same forwards as backwards when you ignore all the spaces.
 * Only lower case letters and spaces will be used.
 * If the sentence is palindromic output TRUE, otherwise output FALSE.
 * 
 * Input format:
 * An input word.
 * 
 * Output format:
 * Either TRUE if it is a palindrome or FALSE otherwise.
 */

package Week7;
import java.io.File;
import java.util.*;

public class Practice_CheckPalindromeStack {
	//Main Method
	public static void main(String args[]) throws Exception
	{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week7\\Practice_Input.txt");
		Scanner scan = new Scanner(input);
		
		while(scan.hasNext()){
		String sent = scan.nextLine();
		sent = sent.replace(" ", "");
		String reverse = new String();
	
		
		Stack myStack = new Stack(sent.length());
		
		for(int i = 0; i < sent.length(); i++)
		{
			myStack.push(sent.charAt(i));
		}
		
		for(int i = sent.length(); i>0; i--)
		{
			reverse = reverse + myStack.pop();
		}
		
		if(sent.equalsIgnoreCase(reverse) == true)
		{
			System.out.println("Your output: TRUE");
		}
		else
		{
			System.out.println("Your output: FALSE");
		}
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
	}
	}

}

class Stack {
	private int maxSize;
	private char stackArray[];
	private int top;
	
	//Constructor
		//REMEMBER!!!!!!!!!!! 
		/*
		 * HAS TO BE THE SAME NAME AS THE CLASS FILE!!!!
		 */
		protected Stack(int s)
		{
			maxSize = s;
			stackArray = new char[maxSize];
			top = -1;
		}
		
		//Push method
		protected void push(char c)
		{
			top++;
			stackArray[top] = c;
		}
		
		//Pop method
		protected char pop()
		{
			return stackArray[top--];
			
		}
		
		//Peek and copy
		protected char peek()
		{
			return stackArray[top];
		}
		

}
