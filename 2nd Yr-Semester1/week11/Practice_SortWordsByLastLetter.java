/* 
 * The goal is to sort a long list of words by special order, namely the usual [a-z] alphabetical order,
 * but considering the words in an inverted fashion.
 * The last letter in the word has the greatest significance, the second last letter has the second greatest significance,
 * the third last letter has the third greatest significance and so forth...
 * 
 * Input format:
 * The first line contains N (number of words) followed by N lines. Each line contains a String.
 * There are only five test cases, and each one involves 10 times more words than the last
 * (e.g. 10, 100, 1000, 10000, 100000)
 * 
 * Output Format:
 * Print out each of the sorted N words on a seperate line.
 */

package week11;
import java.util.*;
import java.io.*;

public class Practice_SortWordsByLastLetter {
	public static void main(String args[]) throws Exception {
		File input = new File("C:/Users/Tomek/OneDrive/College/Year 2/Semester 1/CS210 Algorithms and Data Structures 1/CS210 Labs/src/week11/Practice_Input.txt");
		Scanner scan = new Scanner(input);
		
		while(scan.hasNext()){
		int num = Integer.parseInt(scan.nextLine());
		StringBuffer array[] = new StringBuffer[num];

		//Fill up the array with words
		for(int i = 0; i < num; i++){
			array[i] = new StringBuffer(scan.nextLine());
			array[i] = array[i].reverse();
		}

		mergeSort(array);

		for(int i = 0; i < num; i++){
			System.out.println(array[i].reverse());
		}
		
		System.out.println(scan.nextLine());
		}
	}



	public static void mergeSort(StringBuffer list[])
	{
		if(list.length > 1)
		{
			StringBuffer[] left = new StringBuffer[list.length/2];
			StringBuffer[] right = new StringBuffer[list.length-list.length/2];

			for(int i = 0; i < left.length; i++)
			{
				left[i] = list[i];
			}
			for(int i = 0; i < right.length; i++)
			{
				right[i] = list[i + list.length/2];
			}
			mergeSort(left);
			mergeSort(right);

			merge(list, left, right);

		}

	}


	public static void merge(StringBuffer result[], StringBuffer left[], StringBuffer right[])
	{
		int posLeft = 0;
		int posRight = 0;
		for(int i = 0; i<result.length; i++)
		{
			if(posRight >= right.length || (posLeft < left.length && (left[posLeft].toString().compareTo(right[posRight].toString()) <= 0 )))
			{

				result[i] = left[posLeft];
				posLeft++;

			}
			else
			{
				result[i] = right[posRight];
				posRight++;
			}

		}
	}

}