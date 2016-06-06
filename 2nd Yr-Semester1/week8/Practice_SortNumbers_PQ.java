/*
 * Use a PRIORITY QUEUE to sort a list of numbers. Insert all the numbers into the priority queue and then remove them all.
 * Smaller numbers should have highest priority so they come out first.
 * You need to write the priority queue class yourself - but you can paste in most of the code from the lecture notes.
 * 
 * Input format:
 * A list of N unsorted integers separated by a space.
 * 
 * Output format:
 * The list of sorted integers, from smallest to biggest, each on seperate line.
 * 
 * CONSTRAINS:
 * 1 <= N <= 100
 * -1000 <= n <= 1000
 */

package week8;

import java.io.*;
import java.util.*;
public class Practice_SortNumbers_PQ {
	public static void main(String args[]) throws Exception
	{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week8\\Practice_Input.txt");
		Scanner scan = new Scanner(input);

		/*
		 * Will only work if the string is of format:
		 * q e r t y
		 * where any of the above letters are REAL NUMBERS ONLY. 
		 *******************************************************
		 */
		while(scan.hasNext()){
			PQueue myQueue = new PQueue(1000);	
			while(scan.hasNextInt())
			{
				myQueue.insert(Integer.parseInt(scan.next()));
			} 

			while(!myQueue.isEmpty())
			{
				System.out.print(myQueue.remove() + " ");
			}
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}
}



//CLASS PQueue

class PQueue {
	private int maxSize;
	private int[] queArray;
	private int front;
	private int rear;
	private int nItems;

	public PQueue(int s) { // constructor
		maxSize = s;
		queArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}

	//INSERT
	public void insert(int item) {
		if (nItems == 0) { // if no items,
			queArray[0] = item; // insert at 0
		} else { // if some items,
			int j = nItems; // start at end

			/****
			To change the priority of this queue - just change the > symbol in the queArray[j-1] > item clause
			 **/
			/** Less than means that lower numbers have priority **/
			while (j > 0 && queArray[j - 1] < item) { // while new item larger
				queArray[j] = queArray[j - 1]; // shift upward
				j--; // decrement j
			}
			queArray[j] = item; // insert it
		}
		/*****/		
		front = nItems; // NEW LINE OF CODE FOR PRIORITY QUEUE.... 
		nItems++; // increase items

	}

	public int remove() { // take item from front of queue
		int temp = queArray[front]; // get value   
		front--; // We need to move the front back.... 
		if (front == maxSize) { // deal with wraparound
			front = 0;
		}
		nItems--; // one less item
		return temp;
	}

	public int peekFront() { // peek at front of queue
		return queArray[front];
	}

	public boolean isEmpty() { // true if queue is empty
		return (nItems == 0);
	}

	public boolean isFull() { // true if queue is full
		return (nItems == maxSize);
	}

	public int size() { // number of items in queue
		return nItems;
	}
}