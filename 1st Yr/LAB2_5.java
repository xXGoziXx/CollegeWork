public class LAB2_5
{
	public static void main (String args[]) {
		int array [][] = new int  [4][5];
		for(int x = 0; x<4; x++) {
			for(int y = 0; y<5; y++) {
				array[x][y] = 42;
			}
		}
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<5; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}