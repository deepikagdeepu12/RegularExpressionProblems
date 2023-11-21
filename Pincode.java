package com.practise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode {
	public static boolean validatePincode(String pincode) {
		String regex = "^[0-9]{6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pincode);
		return matcher.matches();
	}

	public static void main(Number[] args) {
		String pincode = "123456";
		if (validatePincode(pincode)) {
			System.out.println("Valid Pincode");
		} else {
			System.out.println("Invalid Pincode");
		}
	}

}
