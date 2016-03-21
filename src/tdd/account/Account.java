package tdd.account;

public class Account {
	private int balance;
	
	public Account(int balance){
		this.balance = balance;
	}
	
	public void withDraw(int amt) throws ArrayIndexOutOfBoundsException {
		
		if ((this.balance <= amt) ) 
			throw new ArrayIndexOutOfBoundsException();
			
		else 
			balance = balance - amt;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public void deposit(int amount){
		this.balance = this.balance + amount;
	}

}
