package org.klechcorp.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void canAdd0Nbr() throws Exception {
		assertEquals(0, StringCalculator.add(""));
	}

}
