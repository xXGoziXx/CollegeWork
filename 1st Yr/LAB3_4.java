public class LAB3_4 {
	public static void main(String args[]) {
		determineSize(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
	}
	public static void determineSize(double num1, double num2) {
		if(num1 >num2) {
			System.out.println(num2 + " is the smallest number.");
			System.out.println(num1 + " is the biggest number.");
		}
		else if(num2 > num1) {
			System.out.println(num1 + " is the smallest number.");
			System.out.println(num2 + " is the biggest number.");
			
		}
		else {
			System.out.println("These numbers are the same size.");
		}
	}
}