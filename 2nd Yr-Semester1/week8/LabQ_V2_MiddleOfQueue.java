/*
 * Manipulate a queue according to the given insert and remove commands and then output the string that is in the middle of the queue.
 * If there is an even number of strings in the queue, thus two middle strings, output the one which is nearest the front.
 * If a remove command is issued for an empty queue then nothing should happen.
 * 
 * Input format:
 * A series of lines involving either INSERT or REMOVE commands. The command INSERT is followed by a space and then the string to insert (e.g. INSERT hello).
 * 
 * Output format:
 * Output the string that is in the middle of the queue following the given commands.
 * If there are two middle strings, output the one nearest the front.
 * If the queue is empty, output "empty".
 */

package week8;

import java.io.*;
import java.util.*;

public class LabQ_V2_MiddleOfQueue
{
	public static void main(String args[]) throws Exception
	{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week8\\LabQ_V2_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
			//String to store command
			String command = new String();
			//Creating queue
			Queue myQ = new Queue(20);
			//Creating array
			String array[] = new String[20];

			while(scan.hasNext("INSERT") || scan.hasNext("REMOVE"))
			{
				command = scan.nextLine(); //take in the command
				array = command.split(" "); // Split all the words in it and put them into an array

				if(array[0].equalsIgnoreCase("INSERT")) //if at pos 0, the word is "insert"
				{
					myQ.insert(array[1]); //insert the word which is at pos 1
				}
				else if(array[0].equalsIgnoreCase("REMOVE")) //if at pos 0 the word is "remove"
				{
					if(!myQ.isEmpty()) //if the string is NOT empty then remove
					{
						myQ.remove();
					}
				}
				else{} //any other case wont do anything

			}

			String QArray[] = new String[myQ.size()]; //Create a string array of size of the queue
			for(int i = 0; i < QArray.length ; i++) //Fill out the array with what's in the queue
			{
				if(!myQ.isEmpty()) // But fill it out only until it is empty
				{
					QArray[i] = myQ.remove(); //Remove item
				}
			}


			if(QArray.length == 0) //If empty then return "empty"
			{
				System.out.println("Your output: empty");
			}
			else if(QArray.length%2 == 0) // If # of items is even
			{
				int pos = (QArray.length/2)-1; // print the middle closer to the front
				System.out.println("Your output: " + QArray[pos]);
			}
			else //if the # of items is odd
			{
				System.out.println("Your output: " + QArray[QArray.length/2]); //print the item in the middle
			}
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}
}


class Queue{

	private int maxSize;
	private String[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s){
		maxSize = s;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	public boolean insert(String item){
		if(isFull() == false){
			rear++;
			queArray[rear]=item;
			nItems++;
			return true;
		}else{
			return false;
		}
	}

	public String remove(){
		String temp = queArray[front];
		front++;
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}

	public boolean isEmpty(){
		return (nItems==0);
	}

	public boolean isFull(){
		return (nItems==maxSize);
	}

	public int size(){
		return nItems;
	}
}