/*This program will sort a list of entered words in alphabetical order using PRIORITY QUEUE
 * 
 */

package week8;
import java.util.*;
import java.io.*;

public class PQ_AlphabeticalOrder_Example {
	public static void main(String args[]) throws Exception {
		File input = new File("C:/Users/Tomek/OneDrive/College/Year 2/Semester 1/CS210 Algorithms and Data Structures 1/CS210 Labs/src/week8/Input_AlphabeticalOrder.txt");
		Scanner scan = new Scanner(input);
		//Set size of the PQ
		PQ myPQ = new PQ(scan.nextInt());
		
		while(scan.hasNext()){
			String command = scan.nextLine();
			String commandAr[] = new String[2];
			commandAr = command.split(" ");
			
			if(commandAr[0].equalsIgnoreCase("INSERT")){
				myPQ.insert(commandAr[1]);
			}
			else{
				if(!myPQ.isEmpty()){
					myPQ.remove();
				}
			}
		}
		
		while(!myPQ.isEmpty()){
			System.out.print(myPQ.remove() + " ");
		}
	}
}
class PQ {
	private int maxSize;
	private String[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public PQ(int s)// constructor 
	{ 
		maxSize = s;
		queArray = new String[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

		//INSERT
	public void insert(String item) 
	{
		
		// if no items,
		if (nItems == 0) 
			{
				queArray[0] = item; // insert at 0
			}
		// if some items,
		else
			{ 
				int j = nItems; // start at end
	
				/* This will do the sorting.
				 * To change so that it goes in "anti-alphabetical order" then just change:
				 * queArray[j - 1].compareToIgnoreCase(item) < 0)
				 * TO
				 * queArray[j - 1].compareToIgnoreCase(item) > 0)
				 */
				while (j > 0 && queArray[j - 1].compareToIgnoreCase(item) < 0) // while new item larger
				{ 
					queArray[j] = queArray[j - 1]; // shift upward
					j--; // decrement j
				}
				queArray[j] = item; // insert it
			}
		
		front = nItems; // NEW LINE OF CODE FOR PRIORITY QUEUE.... 
		nItems++; // increase items
	}

	public String remove()  // take item from front of queue
	{
		String temp = queArray[front]; // get value   
		front--; // We need to move the front back.... 
		
		if (front == maxSize) // deal with wraparound
		{ 
			front = 0;
		}
		
		nItems--; // one less item
		return temp;
	}

	public String peekFront()  // peek at front of queue
	{
		return queArray[front];
	}

	public boolean isEmpty() // true if queue is empty
	{ 
		return (nItems == 0);
	}

	public boolean isFull() // true if queue is full
	{ 
		return (nItems == maxSize);
	}

	public int size() // number of items in queue
	{ 
		return nItems;
	}
}

