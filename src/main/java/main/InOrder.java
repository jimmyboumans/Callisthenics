package main;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InOrder {

	public Map<Date, Amount> transaction;
	
	public InOrder( ) {
		this.transaction = new HashMap<>();
	}
}
