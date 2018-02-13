package org.klechcorp.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void canAdd0Nbr() throws Exception {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void canAdd1Nbr() throws Exception {
		assertEquals(1, StringCalculator.add("1"));
	}
	
	@Test
	public void canAdd2Nbr() throws Exception {
		assertEquals(2, StringCalculator.add("1,1"));
	}
	
	@Test
	public void canAddMultipleNbr() throws Exception {
		assertEquals(6, StringCalculator.add("3,2,1"));
	}

}
