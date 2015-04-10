package account;

//import java.util.Scanner;

public class Account {
	
	
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	/*
	double input() {
		Scanner input = new Scanner(System.in);
		double cash = input.nextDouble();
		input.close();
		return cash;
	}
	*/
	
	/* private */ double balance = 0.0;
	public double interestRate = 1.25; //i prosent
	
	public void deposit(double cash) {
		if (cash > 0) {
			balance = balance + cash;
			//return balance;
		} else {
			System.out.println("Du kan ikke sette inn et negativt beløp");
			//return balance;
		}
	}
	
	public void addInterest() {
		balance = balance + balance * (interestRate / 100);
		//return balance;
	}
	
	public Account() {
		
	}

	
}
