package com.eshipper.coding.challage.problem1;

import org.junit.Test;

import junit.framework.TestCase;

public class DigitCounterTest extends TestCase {
	
	DigitCounter dc = new DigitCounter();
	
	@Test
	public void testDigitCounterNegative() {
		assertEquals(3, dc.getDigitCount(-255));
	}
	
	@Test
	public void testDigitCounterPositive() {
		assertEquals(3, dc.getDigitCount(255));
	}
	
	@Test
	public void testDigitCounterZero() {
		assertEquals(1, dc.getDigitCount(0));
	}

}
