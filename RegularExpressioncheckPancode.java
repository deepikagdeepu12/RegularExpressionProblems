package com.practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressioncheckPancode {
	public static boolean pancard(String pan) {
		String s = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher(pan);
		return m.matches();

	}

	public static void main(Number[] args) {
		String n = "ABCDE1238F";
		if (pancard(n)) {
			System.out.println("valid");
		} else {
			System.out.println("not vlaid");
		}
	}

}
