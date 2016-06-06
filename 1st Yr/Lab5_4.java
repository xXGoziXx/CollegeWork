public class Lab5_4{
	public static void main (String args[])
	{
		int num = 12345678, newNum = 0;
		while (num > 10) {
   			newNum = newNum + (num % 10);
   			newNum = newNum * 10;
  			num /= 10;
		}
		newNum = newNum + num;

		while (newNum > 10) {
   			int digit = newNum % 10;
   			newNum = newNum / 10;
   			System.out.print(digit + " ");
		}
		System.out.println(newNum);
	}
}