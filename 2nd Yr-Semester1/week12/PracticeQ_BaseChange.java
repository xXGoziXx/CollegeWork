/* Input format:
 * x = fromBase
 * y = toBase
 * N = number in base x that we want to convert to base y.
 */

package week12;

import java.util.*;
import java.io.*;

public class PracticeQ_BaseChange {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:/Users/Tomek/OneDrive/College/Year 2/Semester 1/CS210 Algorithms and Data Structures 1/CS210 Labs/src/week12/Practice_Input.txt");
		Scanner scan = new Scanner(input);

		while (scan.hasNext()) {
			int fromBase = Integer.parseInt(scan.nextLine());
			int toBase = Integer.parseInt(scan.nextLine());
			// Storing the number as String - easier when converting to base 10
			String num = scan.nextLine();
			// We will be taking out digit at each position from the above string to
			// convert it to base 10
			// We will also have to 'parse' that digit to a number
			int digit = 0;
			// We will be updating this final value which will be in base 10
			int value = 0;

			// If fromBase != 10, then convert it to base 10 first
			if (fromBase != 10) {
				// Right Most Digit has a power of 0
				int power = 0;
				// Starting at the Right Most Digit
				// Going to the Left Most Digit
				for (int i = num.length() - 1; i >= 0; i--) {
					// We're extracting the digit at position i and turning it into an int
					digit = Integer.parseInt(num.substring(i, i + 1));
					// To convert from any base to base 10 we do the following:
					// Example: 10110(base 2)
					// Take a sum of each digit multiplied by 2^(power)
					value = value + digit * (int) Math.pow(fromBase, power);
					// Increase the power as we're moving through each position
					power++;
				}
			} else { // If fromBase == 10
				value = Integer.parseInt(num); // then we dont need conversion so value = num
			}

			// CONVERTING TO DESIRED BASE ---- USING EUCLIDEAN DIVISION
			// FIRST GET REMAINDER OF (value % toBase) THEN DIVIDE (value / toBase) UNTIL QUOTIENT IS 0
			// THEN READ THE REMAINDERS FROM THE END TO THE START

			// We create a string to store the answer
			String AnsString = new String();
			// While the QUOTIENT is not 0 (if it is then we stop)
			while (value != 0) {
				// We are updating out answer in the string
				// Notice if we had:
				// AnsString = AnsString + (value % toBase) 
				// then the answer would be backwards to what we need.
				AnsString = (value % toBase) + AnsString;
				// Have to update the value
				value = value / toBase;
			}
			// Printing out the final answer
			System.out.println("Your output: " + AnsString);

			// THIS GETS THE "EXPECTED OUTPUT" LINE FROM THE TEXT FILE
			System.out.println(scan.nextLine());
			// THIS GETS THE '*****************' TO SEPERATE EACH TEST CASE
			System.out.println(scan.nextLine());

		}
	}

}
