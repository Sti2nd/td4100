package account;


public class AccountProgram {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(100.00);
		account.addInterest();
		System.out.println(account);
		//account.input();
		//System.out.println(account);
	}

}
