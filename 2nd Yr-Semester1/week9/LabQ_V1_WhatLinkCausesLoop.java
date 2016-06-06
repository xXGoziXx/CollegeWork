/*
 * A loop in a linked list occurs when following the linked list chain brings you back where you started.
 * For example, link 1 points to link 2 which points to link 3 which points to link 1, to link 2, to link 3, to link 1...
 * and you go round in an infinite loop. Each test case here involves a single-ended singly-linked list with a potential loop.
 * Output the data of the link whose pointer has caused the linked list to loop back to a previous point.
 * In the above example, it would be whatever data is stored in link 3.
 * 
 * Input Format:
 * There is no input. The linked list is created automatically.
 * 
 * Output Format:
 * Output the String stored in the link which causes the list to loop back to a previous link.
 * If there is no loop output "OK". If the linked list is empty output "empty".
 * 
 * BUILDING YOUR OWN TEST CASE:
 * You might want to build your own test case and in that case, here's how you do it.
 * The first line is the number of links n.
 * The next n lines are the Strings held in each link…
 * The next lines give the connections between the link…
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

public class LabQ_V1_WhatLinkCausesLoop {
	public static void main(String args[] ) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week9\\LabQ_V1_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
			int num = Integer.parseInt(scan.nextLine());
			LinkV1[] array = new LinkV1[num];
			for(int i=0;i<num;i++){
				array[i]=new LinkV1(scan.nextLine());    
			}
			while(scan.hasNextInt()){
				int select=scan.nextInt();
				int next=scan.nextInt();
				if(next!=-1){
					array[select].next=array[next];
				}
			}
			LinkedListV1 mylist = new LinkedListV1();
			if(num>0){
				mylist.first=array[0];
			}
			System.out.println("Your output: " + findloop(mylist));

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

	//START CODE HERE //

	public static String findloop(LinkedListV1 mylist){
		if(mylist.isEmpty()){
			return("empty");
		}
		LinkV1[] checklist = new LinkV1[100];
		int counter=0;
		LinkV1 forwards = mylist.first;
		while(forwards.next!=null){
			checklist[counter]=forwards;
			LinkV1 temp=forwards;
			forwards=forwards.next;
			for(int i=0;i<counter;i++){
				if(forwards==checklist[i]){
					return(temp.data);
				}
			}
			counter++;
		}
		return("OK");
	}

	//FINISH CODE HERE //
}



class LinkV1{
	public String data;
	public LinkV1 next;

	public LinkV1(String input){
		data=input;
		next=null;
	}
}

class LinkedListV1 {
	public LinkV1 first;

	public LinkedListV1( ){
		first=null;
	}

	public boolean isEmpty( ){
		return (first==null);
	}

	public void insertHead(LinkV1 insert){
		if(isEmpty()){
			first=insert;
		}else{
			insert.next=first;
			first=insert;
		}
	}
}
