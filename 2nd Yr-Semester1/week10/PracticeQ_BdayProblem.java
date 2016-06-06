package week10;
import java.util.*;
import java.io.*;

public class PracticeQ_BdayProblem {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week10\\PracticeQ_BdayProblem_Input.txt");
		Scanner scan = new Scanner(input);
		while(scan.hasNext()){
			System.out.println("Probability is: " + String.format("%.3f", (1 - birthday(Integer.parseInt(scan.nextLine()))))); //chance of someone SHARING the birthday with number of people
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}

	public static double birthday(int numPpl){
		if(numPpl == 0){
			return 1.0;
		}
		//This is a case when 365/365
		else if(numPpl == 1) {	
			return 1.0;
		}
		else if(numPpl == 2){
			return 364.0/365.0;
		}
		else {
			int diff = numPpl-1;
			double probability = (double)(365.0 - diff)/365.0;
			return probability*birthday(diff);
		}

	}
}
