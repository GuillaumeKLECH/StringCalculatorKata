package org.klechcorp.stringcalculator;

public class StringCalculator {

	public static int add(String _numbers) {
		if(_numbers.length() == 0) {
			return 0;
		} else {
			return Integer.parseInt(_numbers);
		}
	}
}
