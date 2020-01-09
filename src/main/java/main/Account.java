package main;

import java.util.Date;

public class Account {
	private Integer totalAmount;
	
	public Account(Amount amount){
		this.totalAmount = 0;
	}
	
	public Boolean deposit (Amount amount, Date date) {
		try {
			
		}
		catch(Error error) {
			System.err.println("Le programme a rencontré");
		}
		this.totalAmount += amount;
	}
	
	public Boolean withdrawal (Amount amount, Date date) {
		if (this.totalAmount >= amount)
			this.totalAmount -= amount;
		
	}
	
}
