public class LAB5_5 {
	public static void main(String args[]) {
		double [] myNumbers = {1, 3, 6, 4, 8, 12, 2};
		scaleArray(myNumbers, 6);
	}
	public static void scaleArray(double[] array, double value) {
		for(int j = 0; j<array.length;j++) {
			array[j] = array[j] / value;
			System.out.print(array[j] + " ");
		}
	}
}