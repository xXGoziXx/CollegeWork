/**
 * This is a Bank Account Object example
 *
 * @author Godstime Osarobo
 * @version 3.0 17/04/2015
 */
public class BankAccountObject
{
    public static void main(String args[]){
		BankAccount School = new BankAccount("Gozi", "Current", 12345678, 135.24, 102030);
		School.setAccCustName("Godstime Osarobo");
		School.setAccType("Saving");
		System.out.println("Your Account Customer Name is: " + School.getAccCustName());
		System.out.println("Your Bank Identification Code is: " + School.getBIC());
		System.out.println("Your account customer name is: " + School.getAccCustName());
		School.checkBalance(102031);
		School.checkBalance(102030);
		School.lodgeMoney(20.50);
		School.checkBalance(102030);
		School.withdrawMoney(20.50,102031);
		School.withdrawMoney(20.50,102030);
		School.checkBalance(102030);
		School.setAccPIN(204080,102031);
		School.setAccPIN(204080,102030);

	}
}

