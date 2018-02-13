package org.klechcorp.stringcalculator;

import static org.junit.Assert.*;

import java.util.StringJoiner;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void canAdd0Nbr() throws Exception {
		assertEquals(0, StringCalculator.add(""));
	}
	
	public void addNbr(int[] nbrs) {
		StringJoiner sj = new StringJoiner(",");
		int sum = 0;
		for(int i = 0 ; i < nbrs.length; ++i) {
			sum += nbrs[i];
			sj.add(Integer.toString(nbrs[i]));
		}
		assertEquals(sum, StringCalculator.add(sj.toString()));
	}
	
	@Test
	public void canAdd1Nbr() throws Exception {
		addNbr(new int[] {1});
	}
	
	
	@Test
	public void canAdd2Nbr() throws Exception {
		addNbr(new int[]{1,1});
	}
	
	@Test
	public void canAddMultipleNbr() throws Exception {
		addNbr(new int[]{3,2,1});
	}
	
	@Test
	public void supportCRLF() throws Exception {
		assertEquals(6, StringCalculator.add("1\n,2,3"));
	}
	
	

}
