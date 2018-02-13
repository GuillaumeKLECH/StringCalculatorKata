package org.klechcorp.stringcalculator;

import java.util.StringTokenizer;

public class StringCalculator {

	private static final String SEPARATOR = ",\n";

	public static int add(String _numbers) {
		if (_numbers.length() == 0) {
			return 0;
		} else if (_numbers.contains("//")) {
			Character customDelim = _numbers.charAt(_numbers.indexOf("//") + "//".length());
			StringTokenizer tok = new StringTokenizer(_numbers.substring(_numbers.indexOf("\n") +1 ), customDelim.toString());
			int sum = 0;
			while (tok.hasMoreTokens()) {
				sum += Integer.parseInt(tok.nextToken());
			}
			return sum;
			
		} else {
			StringTokenizer tok = new StringTokenizer(_numbers, SEPARATOR);
			int sum = 0;
			while (tok.hasMoreTokens()) {
				sum += Integer.parseInt(tok.nextToken());
			}
			return sum;
		}
	}
}
