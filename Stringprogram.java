package com.practise;

import java.util.Scanner;

public class Stringprogram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Step 1: Input String Split using Delimiter
		System.out.print("Enter the input string: ");
		String inputString = scanner.nextLine();
		System.out.print("Enter the delimiter character: ");
		char delimiter = scanner.next().charAt(0);

		String[] splitStrings = inputString.split(String.valueOf(delimiter));

		System.out.println("Split input string using delimiter:");
		for (String split : splitStrings) {
			System.out.println(split);
		}

		// Step 2: Find Vowels in the Input String
		int vowelCount = 0;
		for (char c : inputString.toCharArray()) {
			if ("AEIOUaeiou".indexOf(c) != -1) {
				System.out.print(c);
			}
		}

//	        int count=0;
//	        for(char c:s.toChararray())
//	        {
//	        	if("AEIOUaeiou".indexOf(c)!=-1)
//	        	{
//	        		count++;
//	        	}
//	        }

//	        System.out.println("Number of vowels in the input string: " + c);

		// Step 3: Find the Number of Words
		String[] words = inputString.split("\\s+"); // Split by whitespace
		System.out.println("Number of words in the input string: " + words.length);

		// Step 4: Calculate the Length of the Input String (including whitespaces and
		// special characters)
		int inputLength = inputString.length();
		System.out.println("Length of the input string: " + inputLength);

		scanner.close();
	}
}
