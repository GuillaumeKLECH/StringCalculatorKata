package org.klechcorp.stringcalculator;

public class StringCalculator {

	private static final String SEPARATOR = ",";

	public static int add(String _numbers) {
		if(_numbers.length() == 0) {
			return 0;
		} else if(_numbers.contains(SEPARATOR)){
			int indOfSep = _numbers.indexOf(SEPARATOR);
			return Integer.parseInt(_numbers.substring(0, indOfSep)) 
					+ Integer.parseInt(_numbers.substring(indOfSep + 1)); 
		} else {
			return Integer.parseInt(_numbers);
		}
	}
}
