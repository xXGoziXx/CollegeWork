public class Week_5_2 {
	public static void main (String Args[])
	{
		double x = 2.5, y = 5.0;
		char mathematicalOperator = '/';
		switch (mathematicalOperator) {
			case '*':
				System.out.println(x + " " + mathematicalOperator + " " + y + " = " + (x*y) );
				break;
			case '+':
				System.out.println(x + " " + mathematicalOperator + " " + y + " = " + (x+y) );
				break;
			case '-':
				System.out.println(x + " " + mathematicalOperator + " " + y + " = " + (x-y) );
				break;
			case '/':
				System.out.println(x + " " + mathematicalOperator + " " + y + " = " + (x/y) );
				break;
			case '%':
				System.out.println(x + " " + mathematicalOperator + " " + y + " = " + (x%y) );
				break;
			default:
				System.out.println("I'm deeply sorry but that is not a valid mathematical operator... your mathematical operation has failed");
		}
	}
}