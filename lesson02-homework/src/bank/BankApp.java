package bank;

public class BankApp {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount(21567491, 5999.99);
		
		b1.number = 16318497;
		b1.balance = 19999.99;
		
		System.out.println("Bank Account Details: Bank id-" + b1.number + ", Balance-" + b1.balance + ".");
		System.out.println("Bank Account Details: Bank id-" + b2.number + ", Balance-" + b2.balance + ".");

	}

}
