import java.util.*;

public class Methods{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int [5];
		int[] b = new int [5];
		for(int i = 0;i<a.length;i++) {
			System.out.println("Enter a number for array a: ");
			a[i] = scan.nextInt();
		}
		for(int j = 0;j<b.length;j++) {
			System.out.println("Enter a number for array b: ");
			b[j] = scan.nextInt();
		}
		Odd(a,b);

	}
	public static void Odd(int[] a, int[] b) {
		int oddA = 0, oddB = 0;
		for(int i = 0;i<a.length;i++) {
			if((a[i]%2) != 0) {
				oddA++;
			}
			else {

			}
		}
		for(int j = 0;j<b.length;j++) {
			if((b[j]%2) != 0) {
				oddB++;
			}
			else {

			}
		}
		if(oddA > oddB) {
			System.out.println("Array b has " + oddB + " odd numbers whereas Array a has " + oddA + " numbers.");
		}
		else if (oddB>oddA) {
			System.out.println("Array a has " + oddA + " odd numbers whereas Array b has " + oddB + " numbers.");
		}
		else {
			System.out.println("Array a and Array b have the same number of odd numbers, which is " + oddA + ".");
		}
	}
}