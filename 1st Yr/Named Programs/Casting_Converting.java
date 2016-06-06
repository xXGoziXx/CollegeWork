public class Casting_Converting{
	public static void main(String args[]){
		double x = 12.34;
		System.out.println("Double to Int: " + doubleToInt(x));
		int y = 1234;
		System.out.println("Int to Byte: " + intToByte(y));
		String z = new String("12.34");
		System.out.println("String to Double: " + stringToDouble(z));
		char a = '1';
		System.out.println("Char to Int: " + charToInt(a));
		int b = 98;
		System.out.println("Int to Char: " + intToChar(b));
	}
	public static int doubleToInt(double num){
		int num1 = (int) Math.round(num);
		return num1;
	}
	public static byte intToByte(int num){
		byte num1 = (byte) num;
		return num1;
	}
	public static double stringToDouble(String num){
		double num1 = Double.parseDouble(num);
		return num1;
	}
	public static int charToInt(char num){
		int num1 = (int) num;
		return num1;
	}
	public static char intToChar(int num){
		char num1 = (char) num;
		return num1;
	}
}