package com.practise;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegularExpresion {

	public static boolean valide(String email) {
		String s = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher(email);
		return m.matches();

	}

	public static void main(Number[] args) {
		String email = "example@gmail.com";
        
		if (valide(email)) {
			System.out.println("valid");
		} else {
			System.out.println("Not valid");
		}
	}
}
