package com.sb.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sb.view.CreditBalance;
import com.sb.view.MyCardsPay;

public class PayScreenTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testSetBalance() {
		float expectedf = 16.4f;
		float actualf; 
		CreditBalance bal = new CreditBalance();
		actualf = bal.setBalanace();
		assertEquals("Valid!",expectedf, actualf);
		fail("Not yet implemented");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetBalance() {
		float expectedf = 16.4f;
		float actualf; 
		CreditBalance bal = new CreditBalance();
		actualf = bal.getBalance();
		assertEquals("Valid!",expectedf, actualf);
		fail("Not yet implemented");
	}
}