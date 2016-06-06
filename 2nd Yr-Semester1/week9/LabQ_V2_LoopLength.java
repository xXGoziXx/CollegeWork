/*
 * A loop in a linked list occurs when following the linked list chain brings you back where you started.
 * For example, LinkV2 1 points to LinkV2 2 which points to LinkV2 3 which points to LinkV2 1, to LinkV2 2, to LinkV2 3, to LinkV2 1...
 * and you go round in an infinite loop. Each test case here involves a single-ended singly-linked list with a potential loop. 
 * Output the size of the loop, or 0 if there is no loop.
 * In the above example, the loop is of size 3 (e.g. LinkV2 1, LinkV2 2, LinkV2 3...repeating forever).
 * 
 * Input format:
 * No input. Linked list is created automatically (main method is given).
 * 
 * Output Format:
 * Output an integer, either 0 if the linked list is empty or has no loop, or else >0 
 * corresponding to the length of the loop in the linked list.
 * 
 * Building your own test case:
 * You might want to build your own test case and in that case, here's how you do it.
 * The first line is the number of links n.
 * The next n lines are the Strings held in each LinkV2…
 * The next lines give the connections between the LinkV2…
 * Here is an example of a perfect linked list with 4 links:
 * 
 * 4
 * Data1
 * Data2
 * Data3
 * Data4
 * 0 1
 * 1 2
 * 2 3
 * 3 -1
 */

package week9;

import java.util.*;
import java.io.*;

public class LabQ_V2_LoopLength {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week9\\LabQ_V2_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
			int num = Integer.parseInt(scan.nextLine());
			LinkV2[] array = new LinkV2[num];
			for (int i = 0; i < num; i++) {
				array[i] = new LinkV2(scan.nextLine());
			}

			while (scan.hasNextInt()) {
				int select = Integer.parseInt(scan.next());
				int next = Integer.parseInt(scan.next());
				if (next != -1) {
					array[select].next = array[next];
				}
			}

			LinkedListV2 mylist = new LinkedListV2();
			if (num > 0) {
				mylist.first = array[0];
			}
			System.out.println("Your output: " + findLoopLength(mylist));

			if(num == 0){
				System.out.println(scan.nextLine());
				System.out.println(scan.nextLine());
			}
			else{
				System.out.print(scan.nextLine());
				System.out.println(scan.nextLine());
				System.out.println(scan.nextLine());
			}
		}
	}

	/****************** CODE STARTS HERE ********************/

	public static int findLoopLength(LinkedListV2 mylist) {
		int count = 0;
		if (mylist.isEmpty()) {
			return 0;
		} else {
			LinkV2 checkList[] = new LinkV2[100];
			LinkV2 current = mylist.first;
			while (current.next != null) {
				checkList[count] = current;

				for (int i = 0; i < count; i++) {
					if (checkList[i] == current) {
						for (int j = 0; j < i; j++) {
							if (checkList[j] == current) {
								int length = i - j;
								return length;
							}
						}
					}
				}
				count++;
				current = current.next;
			}
			return 0;

		}
	}
}

/********************** ENDS HERE *****************/

class LinkV2 {
	public String data;
	public LinkV2 next;

	public LinkV2(String input) {
		data = input;
		next = null;
	}
}

class LinkedListV2 {
	public LinkV2 first;

	public LinkedListV2() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertHead(LinkV2 insert) {
		if (isEmpty()) {
			first = insert;
		} else {
			insert.next = first;
			first = insert;
		}
	}
}
