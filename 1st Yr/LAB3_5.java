public class LAB3_5 {
	public static void main(String args[]) {
		
		char [] [] array = new char [7] [0];
		for(int i = 0; i<4; i++) {
			array[i] = new char[i + 1];
		}
		array[4] = new char[3];
		array[5] = new char[2];
		array[6] = new char[1];
		
		for(int row = 0; row<array.length; row++) {
			for(int column = 0; column<array[row].length; column++) {
				array[row][column] = '+';
				System.out.print(array[row][column] + " ");
			}
			System.out.println("\n");
		}
	}
}