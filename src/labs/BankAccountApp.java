package labs;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("555667777","Jose", 1000.70); 
		System.out.println(acc1.showBalance());

	}
}

class BankAccount{
	//properties
	private static int iD = 1000;					//Internal ID
	private String accountNumber; 	//ID+random 2digid+ first2 ssn
	private static final String routingNumber = "00540054";
	private String name;
	private String ssn;
	private double balance;
	public double initDeposit;
		
	//constructor
	public BankAccount(String ssn,String name, double initDeposit) {
		System.out.println("New Account Created");
		iD++;
		this.ssn = ssn;
		balance = initDeposit;
		setAccountNumber();
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber() {
		int random = (int) (Math.random() *100);
		accountNumber = iD + "" + random + ssn.substring(0, 2);
		System.out.println(accountNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amount) {
		balance =balance - amount;
	}
	public void makeDeposit(double amount) {
		balance =balance + amount; 
	}
	public String showBalance() {
		return "[" +"Available Balance: $" + balance + "]";
	}
}