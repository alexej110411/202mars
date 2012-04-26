package com.sb.view;

public class CreditBalance {
	private float balance;
	
	public CreditBalance(float amount){
		this.balance = amount;
	}
	
	public float getBalance() {
		return this.balance;
	}
	
	public void setBalanace() {
		this.balance -= 3.60f;
	}
}