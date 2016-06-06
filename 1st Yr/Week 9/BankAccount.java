/**
 * This is a Bank Account Object class
 *
 * @author Godstime Osarobo
 * @version 2.0 17/04/2015
 */
public class BankAccount {
    // instance variables

    private String AccCustName;
    private String AccType;
    private int BIC;
    private int AccNum;
    private double Balance;
    private int AccPIN;
	private static int lastAccNum = 1000;
    /**
     * Default Constructor for objects of class BankAccount
     */
    public BankAccount()
    {
        // attribute variables
        this.AccCustName = "Name";
		this.AccType = "Current";
		this.BIC = 10000000;
		this.Balance = 00.00;
		this.AccPIN = 000000;
		this.lastAccNum++;
		this.AccNum = lastAccNum;
    }

    /**
	 * General Constructor for class Bank Account
	 *
	 * Creates a new car with the details provided and assigns it a unique registration number
	 * @param AccCustName Customer name
	 * @param AccType Current, Deposit, Savings
	 * @param BIC Bank Identification Code
	 * @param Balance amount of money in the account
	 * @param AccPIN Account Personal Identification Number(PIN)
	 */
    public BankAccount(String AccCustName, String AccType, int BIC, double Balance, int AccPIN)
    {
        // attributes variables
        this.AccCustName = AccCustName;
        this.AccType = AccType;
        this.BIC = BIC;
        this.Balance = Balance;
        this.AccPIN = AccPIN;
		this.lastAccNum++;
		this.AccNum = lastAccNum;
    }

	/**
     * The Account Customer Name
     *
     * @param String
     * @return void
     */
	public void setAccCustName(String AccCustName){
		this.AccCustName = AccCustName;
	}

	/**
     * The Account Type
     *
     * @param String
     * @return void
     */
	public void setAccType(String AccType) {
		this.AccType = AccType;
	}

	/**
     * The Account Customer Name
     *
     * @param void
     * @return String
     */
	public String getAccCustName(){
		return this.AccCustName;
	}

	/**
     * The Account Type
     *
     * @param void
     * @return String
     */
	public String getAccType(){
		return this.AccType;
	}

	/**
     * The Bank Identification Code
     *
     * @param void
     * @return int
     */
	public int getBIC(){
		return BIC;
	}

	/**
     * Checks Account Balance(if Account PIN is correct)
     *
     * @param int
     * @return void
     */
	public void checkBalance(int AccPIN){
		if(AccPIN == this.AccPIN){
			System.out.println("Account PIN correct!\nYour Balance is $" + Balance);
		}
		else{
			System.out.println("Account PIN incorrect!\nPlease try again.");
		}
	}

	/**
     * Lodges money into Bank Account
     *
     * @param double
     * @return void
     */
	public void lodgeMoney(double money) {
		this.Balance += money;
		System.out.println("You now have $" + this.Balance);
	}

	/**
     * Withdraws money from Bank Account(if Account PIN is correct)
     *
     * @param double
     * @return void
     */
	 public void withdrawMoney(double money, int AccPIN){
	 	if(AccPIN == this.AccPIN){
			this.Balance -= money;
			System.out.println("Account PIN correct!\nYou now have $" + this.Balance);
		}
		else{
			System.out.println("Account PIN incorrect!/nPlease try again.");
		}
	 }

	/**
     * The Account PIN
     *
     * @param int
     * @return void
     */
	public void setAccPIN(int newAccPIN, int AccPIN){
		if(AccPIN == this.AccPIN){
			this.AccPIN = newAccPIN;
			System.out.println("Account PIN correct!\nYour new Account PIN is " + this.AccPIN + ".");
		}
		else{
			System.out.println("Account PIN incorrect!\nPlease try again.");
		}
	}
}
