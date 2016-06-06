/*
 * Check the double-ended doubly-linked list to see if it is properly linked up.
 * The main method is already completed, you simple have to write the check() method which reports to the main method.
 * 
 * Input format:
 * There is no input. The linked list is created automatically.
 * 
 * Output format:
 * Output "TRUE" if the linked list is properly connected and "FALSE" otherwise.
 * If the linked list is empty, output "empty".
 */

package week9;

import java.io.File;
import java.util.*;

public class PracticeQ_LinkedList {
	public static void main(String args[] ) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week9\\Practice_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
			//number of links
			int num = Integer.parseInt(scan.nextLine());
			//create an array of that size
			Link2[] array = new Link2[num];
			//fill out the array with values (strings)
			for(int i=0;i<num;i++){
				array[i]=new Link2(scan.nextLine());    
			}

			//Connect the links
			while(scan.hasNextInt()){
				//POSITION that we want to work on
				int select=scan.nextInt();
				//POSITION of the previous value in the array
				int previous=scan.nextInt();
				//POSITION of the next value in the array
				int next=scan.nextInt();
				//if the previous one WASNT -1 (that means it wasn't the first one)
				if(previous!=-1){
					//then the value at previous position is the previous link
					array[select].previous=array[previous];
				}
				//if next wasnt -1 (that means it wasnt last
				if(next!=-1){
					//then the vlue at next position is the next link
					array[select].next=array[next];
				}
			}
			//Now creating linked list
			LinkedList2 mylist = new LinkedList2();
			//if number of links is 1 or more
			if(num>0){
				//then value at pos 0 is the first link
				mylist.first=array[0];
				//value at the last position is the last link
				mylist.last=array[num-1];
			}
			//Call the check method on the list
			System.out.println(check(mylist));
			System.out.print(scan.nextLine());
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}

	//INSERT CODE HERE
	public static String check(LinkedList2 mylist){

		if(mylist.isEmpty()){
			return "empty";
		}

		Link2 f = mylist.first;
		if(f.previous != null){
			return "FALSE";
		}

		while(true){
			if(f.next == null) break;
			else if(f != f.next.previous){
				return "FALSE";
			}
			f = f.next;
		}
		return "TRUE";
	}

	//STOP CODE HERE

}

class Link2{
	public String data;
	public Link2 next;
	public Link2 previous;

	public Link2(String input){
		data=input;
		next=null;
		previous=null;
	}
}

class LinkedList2 {
	public Link2 first;
	public Link2 last;

	public LinkedList2( ){
		first=null;
		last=null;
	}

	public boolean isEmpty( ){
		return (first==null);
	}

	public void insertHead(Link2 insert){
		if(isEmpty()){
			first=insert;
			last=insert;
		}else{
			first.previous=insert;
			insert.next=first;
			first=insert;
		}
	}
}


