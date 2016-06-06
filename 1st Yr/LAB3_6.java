public class LAB3_6 {
	public static void main (String args[]) {
		int [] [] array = new int [10][10];
		System.out.println("   |   1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("__________________________________________________________________________");
		for(int row = 1;row<array.length;row++) {
			System.out.print(row + "  |   ");
			for(int column = 1; column<array[row].length; column++) {
				array[row][column] = row * column;
				System.out.print(array[row][column] + "\t");
			}
			System.out.println("\n");
		}
	}
}