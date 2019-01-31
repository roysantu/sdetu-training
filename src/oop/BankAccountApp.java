package oop;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount newAcc1 = new BankAccount();
				
		BankAccount newAcc2 = new BankAccount("20002","the queen","222222222", "Checking", 1000.08 );
		/*BankAccount newAcc2 = new BankAccount("100010","checking");
		BankAccount newAcc3 = new BankAccount("checking", 2000);
		
		System.out.println("acc1: " + newAcc1.routingNumber);
		System.out.println("acc2: " + newAcc2.routingNumber);*/
		//System.out.println(newAcc1.toString());
		//System.out.println(newAcc2.toString());
		
		CDAccount newCD = new CDAccount();
		
		newCD.setName("CD name");
		//newCD.
		/*newCD.accountNumber = "CD1001";
		newCD.initDeposit = 2002.67;*/
		
		//System.out.println(newCD.toString());
		//newCD.compound();
		
		//newAcc2.checkBalance();
		//newAcc2.deposit(200.98);
		
		//System.out.println(newCD.getName());
		
	}
}
