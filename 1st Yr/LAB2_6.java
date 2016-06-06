public class LAB2_6
{
	public static void main (String args[]) {
		int rows = 0;
		int columns = 0;
		rows = Integer.parseInt(args[0]);
		columns = Integer.parseInt(args[1]);;
		
		String array [][] = new String[rows][columns];
		for(int x = 0; x<rows; x++) {
			for(int y = 0; y<columns; y++) {
				array[x][y] = "*";
			}
		}
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<columns; j++) {
				System.out.print(array[i][j] + "   ");
			}
			System.out.println();
		}
	}
}