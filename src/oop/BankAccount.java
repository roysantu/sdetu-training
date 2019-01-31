package oop;

public class BankAccount implements IRate{
	private String accountNumber;
	private static final String routingNumber = "123456";
	private String name;
	private String ssn;
	private String accountType;
	private double initDeposit;
	private double balance;
	private double amount;
	private String activity;
	
	public BankAccount() {
		this.accountNumber = "Default";
		//this.routingNumber = routingNumber;
		this.name = "Default";
		this.ssn = "Default";
		this.accountType = "Default";
		this.initDeposit = 0;
				
	}
	
	public BankAccount(String accountNumber, String name, String ssn, String accountType, double initDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.ssn = ssn;
		this.accountType = accountType;
		this.initDeposit = initDeposit;
		balance = initDeposit;
	}
	
	//setter getter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	

	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInitDeposit() {
		return initDeposit;
	}

	public void setInitDeposit(double initDeposit) {
		this.initDeposit = initDeposit;
	}
	//getter setter ends
	//interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
		
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
		
	}
	//interface methods end
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw() {
		balance = balance - amount;
		showActivity("WITHDRAWAL");
	}
	
	public double checkBalance() {
		showActivity("BALANCE CHECK");
		return balance;
	}
	
	void getStatus() {
		
	}
	
	private void showActivity(String activity) {
		System.out.println("Showing all private activity : " + activity);
		System.out.println("Current balance: " + balance);
	}
	
	@Override
	public String toString() {
		
		return "[ " + "Name : " + name + "\nAccount number : " + accountNumber + "]";

	}
}
