package main;

import java.util.Date;

public class Account {
	private Amount totalAmount;
	private InOrder transactions;
	
	public Account(Amount amount){
		this.totalAmount.value = 0.0;
	}
	
	public void deposit (Amount amount, Date date) {
		this.totalAmount.value += amount.value;
		this.transactions.transaction.put(date, amount);
		
	}
	
	public Boolean withdrawal (Amount amount, Date date) {
		if (this.totalAmount.value >= amount.value) {
			this.totalAmount.value -= amount.value;
			this.transactions.transaction.put(date, amount);
			return true;
		}
		return false;
	}
		

	@Override
	public String toString() {
		return "Account [totalAmount=" + totalAmount + "]";
	}
	
	

	
}
