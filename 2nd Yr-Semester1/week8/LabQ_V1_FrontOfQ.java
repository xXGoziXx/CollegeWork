package week8;
import java.util.*;

import week8.Queue;

import java.io.*;

public class LabQ_V1_FrontOfQ {
	public static void main(String args[]) throws Exception{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week8\\LabQ_V1_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
			//String to store command
			String command = new String();
			//Creating queue
			Queue myQ = new Queue(20);
			//Creating array
			String array[] = new String[20];

			while(scan.hasNext("INSERT")|| scan.hasNext("REMOVE"))
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


			if(myQ.isEmpty()) //If empty then return "empty"
			{
				System.out.println("Your output: empty");
			}
			else
			{
				System.out.println("Your output: " + myQ.remove());
			}
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}

}
