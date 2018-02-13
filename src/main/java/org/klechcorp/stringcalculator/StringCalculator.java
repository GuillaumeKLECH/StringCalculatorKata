package org.klechcorp.stringcalculator;

import java.util.StringTokenizer;

public class StringCalculator {

	private static final String SEPARATOR = ",";

	public static int add(String _numbers) {
		if(_numbers.length() == 0) {
			return 0;
		} else if(_numbers.contains(SEPARATOR)){
			StringTokenizer tok = new StringTokenizer(_numbers, SEPARATOR);
			int sum = 0;
			while(tok.hasMoreTokens()) {
				sum += Integer.parseInt(tok.nextToken());
			}
			return sum;
		} else {
			return Integer.parseInt(_numbers);
		}
	}
}
