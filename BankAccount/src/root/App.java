package root;

import java.util.Scanner;

import bank.Account;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account shafin=new Account(01,"Current",5000);
//		Account shafin=new Account(01,"savings",500);
		
		shafin.checkAccountName();
		
		Scanner sc=new Scanner(System.in);
		double depositedMoney,withdrawnMoney;
		System.out.println("Deposit Money: ");
		depositedMoney=sc.nextDouble();
		System.out.println("Withdraw Money: ");
		withdrawnMoney=sc.nextDouble();
		
		shafin.depositMoney(depositedMoney);
		shafin.withdrawMoney(withdrawnMoney);
		
		
	}

}
