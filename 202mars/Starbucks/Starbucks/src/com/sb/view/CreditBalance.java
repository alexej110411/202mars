package com.sb.view;

public class CreditBalance {
	private static float balance = 20.0f;
	
	public CreditBalance(){		
	}
	
	public float getBalance() {
		return balance;
	}
	
	public float setBalanace() {
		return balance -= 3.60;
	}
}