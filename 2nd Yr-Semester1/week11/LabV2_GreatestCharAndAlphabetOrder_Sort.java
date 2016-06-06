/*
 * The goal is to sort a long list of words by special order. The special order is as follows.
 * All the words are sorted by the 'greatest' character in that word. 
 * What this means is that all words whose greatest character is a 'a' (i.e. that feature only a's) should come first,
 * followed by all words whose greatest character is a 'b' (e.g. "baa"),
 * followed by all those words whose greatest character is an 'c' (e.g. "cab") and so forth.
 * Here 'greatest' means furthest along in the alphabet. 
 * The very last words in the list will be those whose greatest character is a 'z' (i.e. any words that have a 'z' in them).
 * 
 * For words that have the same greatest character (e.g. "salt" and "table", which both feature a 't' as 
 * their greatest character), these should be sorted alphabetically (so 'salt' would come first).
 * 
 * Hint: you can cast a character into an int like this: (int)mystring.charAt(0).
 * The values can then be compared to find the character that is the greatest.
 * 
 * Input Format:
 * The first line contains N (number of words) followed by N lines. Each line contains a String.
 * 
 * There are only five test cases, and each one involves 10 times more words than the last 
 * (e.g. 10, 100, 1,000, 10,000, 100,000).
 * 
 * Output Format:
 * Print out each of the sorted N words on a separate line.
 */

package week11;
import java.util.*;
import java.io.*;

public class LabV2_GreatestCharAndAlphabetOrder_Sort {
	public static void main(String args[]) throws Exception{
		File input = new File(
				"C:/Users/Tomek/OneDrive/College/Year 2/Semester 1/CS210 Algorithms and Data Structures 1/CS210 Labs/src/week11/LabV2_Input.txt");
		Scanner scan = new Scanner(input);

		while (scan.hasNext()) {
			int num = Integer.parseInt(scan.nextLine()); //number of words
			String[] array = new String[num]; // create array

			for (int i = 0; i < num; i++) {
				array[i] = scan.nextLine(); //fill up the array
			}

			MergeSort(array); //call the method

			for (int i = 0; i < num; i++) {
				System.out.println(array[i]); //print the array after sorting it
			}

			System.out.println(scan.nextLine()); //prints the "expected output" line
			System.out.println(scan.nextLine()); //prints the stars (****) to seperate each test case
		}
	}

	public static void MergeSort(String list[]) { //MERGESORT METHOD - SPLITS THE ARRAY INTO TWO
		if (list.length > 1) {
			String left[] = new String[list.length / 2];
			String right[] = new String[list.length - (list.length / 2)];

			for (int i = 0; i < left.length; i++) {
				left[i] = list[i];
			}
			for (int i = 0; i < right.length; i++) {
				right[i] = list[i + list.length / 2];
			}

			MergeSort(left);
			MergeSort(right);
			merge(list, left, right);
		}
	}

	//MERGE METHOD - SORTS THE ARRAY
	public static void merge(String result[], String left[], String right[]) {
		//position in the left array
		int posLeft = 0; 
		//position in the right array
		int posRight = 0; 

		for (int i = 0; i < result.length; i++) {
			//if there is no right array
			//OR there is left array AND lengthLEFT < lengthRIGHT
			if (posRight >= right.length || (posLeft < left.length && check(right[posRight],left[posLeft]))) { 
				//then put the word from left array in the main array
				result[i] = left[posLeft]; 
				//increase the position of left array
				posLeft++; 
				//ELSE if there is no right array
				//OR there is a left array AND both words are equal in length
			}
			 else { 
				//put the element from the right array into the main array
				result[i] = right[posRight]; 
				//increase position in right array
				posRight++;
			}
		}
	}

	
	public static boolean check(String one, String two){

		int bigone=0;
		int bigtwo=0;
		for(int i=0;i<one.length();i++){
			if((int)one.charAt(i)>bigone){
				bigone=(int)one.charAt(i);
			}
		}
		for(int i=0;i<two.length();i++){
			if((int)two.charAt(i)>bigtwo){
				bigtwo=(int)two.charAt(i);
			}
		}

		if(bigone>bigtwo){
			return true;
		}else if (bigone<bigtwo){
			return false;
		}
		if(one.compareTo(two)>0){
			return true;
		}else{
			return false;
		}
	} 

}
