package com.practise;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MobileNumber {

	public static boolean validateMobileNumber(String mobile) {
		String regex = "^[6-9]\\d{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile);
		return matcher.matches();
	}

	public static void main(Number[] args) {
		String mobile = "9846543210";
		if (validateMobileNumber(mobile)) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}
	}
}
