package org.klechcorp.stringcalculator;

public class StringCalculator {

	public static int add(String _numbers) {
		if(_numbers.length() == 0) {
			return 0;
		} else if(_numbers.contains(",")){
			return Integer.parseInt(_numbers.substring(0, _numbers.indexOf(","))) 
					+ Integer.parseInt(_numbers.substring(_numbers.indexOf(",") + 1)); 
		} else {
			return Integer.parseInt(_numbers);
		}
	}
}
