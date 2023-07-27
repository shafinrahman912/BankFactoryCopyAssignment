package bank;

public class Account {
	private int id;
	private String name;
	private double balance;
	

	public Account(int id, String name) {

		this.id = id;
		this.name = name;
	
	}

	public Account(int id, String name, double balance) {

		this.id = id;
		this.name = name;
		this.balance = balance;

	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public void checkAccountName() {
		if (this.name == "Current") {
			this.balance = 500;
		} else

			this.balance = 100;

	}

	public void depositMoney(double money) {
//		double depositedMoney;
		System.out.println("=====Deposit=====");
		System.out.println("Previous balance:" + this.balance);
		this.balance = this.balance + money;
		System.out.println("Deposit money:" + money);
		System.out.println("Current balance:" + this.balance);
	}

	public void withdrawMoney(double money) {
//		double withdrawnMoney;
		System.out.println("\n=====Withdraw=====");
		System.out.println("Previous balance:" + this.balance);

		if (this.balance - money >= 1000) {
			this.balance = this.balance - money;
			System.out.println("Withdraw money:" + money);
			System.out.println("Current balance:" + this.balance);
			
		} else
			{
			System.out.println("Withdraw money:" + money);
			System.out.println("Not enough balance for withdraw");
			
			}

	}
}
