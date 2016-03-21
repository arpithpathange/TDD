package tdd;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.TestCase;
import tdd.account.*;

public class AccountTests extends TestCase{
	
	private Account account;
	private int  amount;
	private int  oldBalance;
	
	public void setUp(){
		account = new Account(500);
		amount = 250;
		oldBalance = account.getBalance();
	}
	public void testWithdrawWithSufficientFunds(){
		
		account.withDraw(amount);
		
		assertTrue(account.getBalance() == oldBalance - amount);
	}
	
	public void testDepositAmtGreaterThanZero(){
		
		int oldBalance = account.getBalance();
		
		account.deposit(amount);
		assertTrue(account.getBalance() == oldBalance + amount);
	}
	
	//@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testDepositAmtEqualToZero(){
		try{
			account.withDraw(500);
		}catch (ArrayIndexOutOfBoundsException e){
			
		}
		
			
	}

}
