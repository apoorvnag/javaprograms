package assignments;

public class AccountsDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Saving_Bank_Account account = new Saving_Bank_Account(10001);
		account.deposit(10000);
		account.deposit(15000);
		account.deposit(10000);
		account.deposit(15000);
		
			account.withdraw(250000);
			account.withdraw(15000);
		
		
		System.out.println(account);
	}

}

class Account{
	
	private int accountId;
	private int balance;
	
	public Account(int accountId) {
		// TODO Auto-generated constructor stub
		System.out.println("Opening Account");
		this.accountId = accountId;
		this.balance = 0;
	}

	public int getAccountId() {
		return accountId;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

class Saving_Bank_Account extends Account{
	
	
	public Saving_Bank_Account(int accountId) {
		// TODO Auto-generated constructor stub
		super(accountId);
	}
	
	public void deposit(int amount) {
		System.out.println("Depositing: "+amount);
		int balance = super.getBalance();
		super.setBalance(balance + amount);
	}
	
	public void withdraw(int amount) {
		
		int balance = super.getBalance();
		if (amount > balance) {
			try {
				throw new Exception("Cannot withdraw "+amount+" which is more than available balance!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				return;
			}
		}
		System.out.println("Withdrawing: "+amount);
		super.setBalance(balance - amount);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("\n\n	Account ID = "+this.getAccountId());
		System.out.println("Balance = "+this.getBalance());
		return "";
	}
	
}

