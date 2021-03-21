class Account {
	int accountNumber;
	String name;
	float amount;
	
	void insert(int a, String n, float amt) {
		accountNumber = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt) {
		amount += amt;
		
		System.out.println(amt + " deposited");	
	}
	
	void widthdraw(float amt) {
		if(amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount -= amt;
			System.out.println(amt + " withdrawn");
		}
	}
	
	void checkBalance() {
		System.out.println("Balance is " + amount);
	}
	
	void displayAccountInfo() {
		System.out.println(accountNumber + " " + name + " " + amount );
	}
}
public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.insert(111, "Aakash", 1000);
		a1.displayAccountInfo();
		a1.deposit(40000);
		a1.checkBalance();
		a1.widthdraw(42000);
		a1.checkBalance();

	}

}
