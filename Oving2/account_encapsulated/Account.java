package account_encapsulated;

//Forklar hvorfor metodene over kan sies å være en komplett innkapsling av tilstanden?
//SVAR: Hvis metodene fungerer optimalt kan du ikke sette objektet i en ugyldig tilstand. 
//Metodene hindrer deg i å gjøre noe ulovlig.
//Er denne klassen data-orientert eller tjeneste-orientert? Begrunn svaret!
//SVAR: Data orientert fordi den inneholder data??? LOL; SWAG; YOLO.


public class Account {
	
	
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	private double balance = 0.0;
	private double interestRate = 1.25; //i prosent
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		if (interestRate > 0) {
			this.interestRate = interestRate;
		} else {
			throw new IllegalArgumentException("Negativ interest ikke mulig");
		}
	}
	
	public void deposit(double cash) {
		if (cash > 0) {
			this.balance += cash;
		} else if (cash == 0) {
			
		} else {
			throw new IllegalArgumentException("Negativt deposit ikke mulig");
		}
	}
	
	private boolean isLegalWithdraw(double cash) {
		return (balance - cash) > 0;
		}
	
	public void withdraw(double cash) {
		if (cash > 0 && isLegalWithdraw(cash)) {
			balance -= cash;
		} else if (cash == 0) {
			
		} else {
			throw new IllegalStateException("Negativt withdraw ikke mulig");
		}
	}
	
	public void addInterest() {
		balance = balance + balance * (interestRate / 100);
	}
	
	public Account(double balance, double interestRate) {
		if ((balance > 0) && (interestRate > 0)) {
			this.balance += balance;
			this.interestRate = interestRate;
		} else {
			throw new IllegalArgumentException("Negativt deposit eller interestRate ikke mulig");
		}
	}

	
}
