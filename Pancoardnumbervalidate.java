package com.practise;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Pancoardnumbervalidate {
	

	
	    public static boolean validatePAN(String pan) {
	        String regex = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(pan);
	        return matcher.matches();
	    }

	    public static void main(Number[] args) {
	        String pan = "ABCDE1234F";
	        if (validatePAN(pan)) {
	            System.out.println("Valid PAN Number");
	        } else {
	            System.out.println("Invalid PAN Number");
	        }
	    }
	


}
