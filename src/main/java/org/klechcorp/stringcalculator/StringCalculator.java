package org.klechcorp.stringcalculator;

import java.util.StringTokenizer;

public class StringCalculator {

	private static final String CUS_DELIM_ENDER = "\n";
	private static final String CUS_DELIM_HEADER = "//";
	private static final String SEPARATOR = ",\n";

	public static int add(String _numbers) {
		if (_numbers.length() == 0) {
			return 0;
		} else if (_numbers.contains(CUS_DELIM_HEADER)) {
			int indOfCustomDelim = _numbers.indexOf(CUS_DELIM_HEADER) + CUS_DELIM_HEADER.length();
			Character customDelim = _numbers.charAt(indOfCustomDelim);
			int indOfNbrs = _numbers.indexOf(CUS_DELIM_ENDER) + CUS_DELIM_ENDER.length();
			String realNumbers = _numbers.substring(indOfNbrs);
			
			return addNbrsTok(customDelim.toString(), realNumbers);
			
		} else {
			return addNbrsTok(SEPARATOR, _numbers);
		}
	}

	protected static int addNbrsTok(String customDelim, String realNumbers) {
		StringTokenizer tok = new StringTokenizer(realNumbers, customDelim);
		int sum = 0;
		while (tok.hasMoreTokens()) {
			sum += Integer.parseInt(tok.nextToken());
		}
		return sum;
	}
}
