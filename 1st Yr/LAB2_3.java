public class LAB2_3
{
	public static void main(String args[]) {
		int number1 = 0, whileNumber1 = 0;
		number1  = Integer.parseInt(args[0]);
		whileNumber1 = Integer.parseInt(args[2]);
		if(args[1].equals("+")) {
			System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (number1 + whileNumber1));
		}
		else if(args[1].equals("-")) {
			System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (number1 - whileNumber1));
		}
		else if(args[1].equals("*")) {
			System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (number1 * whileNumber1));
		}
		else if(args[1].equals("/")){ 
			System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + (number1 / whileNumber1));
		}
		
		
	}
}