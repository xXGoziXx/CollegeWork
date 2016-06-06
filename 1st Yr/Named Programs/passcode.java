//a 4-digit passcode program that prints an unlock message if correct
//The passcode for this program is: 1 2 3 4
public class passcode{
	public static void main(String Args[])
	{
		int stop = 0;
		while(stop == 0){
		System.out.println("Program Running...");

		System.out.println("Please enter your passcode.");

		//enter passcode here
		int digit1 = 3, digit2 = 4, digit3 = 9, digit4 = 9;

		//passcode digits cannot be 0
		if((digit1 == 0) | (digit2 == 0) | (digit3 == 0) | (digit4 == 0)){
			System.out.println("Passcodes cannot have the digit '0'.");
		}
		else{
		System.out.println("Your input is: " + digit1 + " " + digit2 + " " + digit3 + " " + digit4);
		System.out.println(" ");

		//1st correct passcode digit controller
		int digit = 1;
			while(digit != 0){

				if (digit1 == digit){
					System.out.println("Digit 1 correct. Checking next digit...");

					//safe check start
						digit1 = 0;
					//safe check end

				}
				else{
					System.out.println("Digit 1 incorrect. Checking next digit...");
				}
				//2nd correct passcode digit controller
				digit = 2;

				if(digit2 == digit){
					System.out.println("Digit 2 correct. Checking next digit...");

					//safe check start
						digit2 = 0;
					//safe check end

				}
				else{
					System.out.println("Digit 2 incorrect. Checking next digit...");
				}
				//3rd correct passcode digit controller
				digit = 3;

				if(digit3 == digit){
					System.out.println("Digit 3 correct. Checking next digit...");
					//safe check start
						digit3 = 0;
					//safe check end

				}
				else{
					System.out.println("Digit 3 incorrect. Checking next digit...");
				}
				//4th correct passcode digit controller
				digit = 4;

				if(digit4 == digit){
					System.out.println("Digit 4 correct.");

					//safe check start
						digit4 = 0;
					//safe check end

				}
				else{
					System.out.println("Digit 4 incorrect.");
				}

				digit = 0;

			}
			if((digit1 == 0) & (digit2 == 0) & (digit3 == 0) & (digit4 == 0)){
					System.out.println(" ");
					System.out.println("The passcode is correct... \n" + "Passcode Unlocked!");
			}
			else{
					System.out.println(" ");
					System.out.println("The passcode is incorrect... \n" + "Please Try Again!");
				}
		}
				System.out.println(" ");
				System.out.println("Program Finished.");
				stop = 1;
			}
		}
}