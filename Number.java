package com.practise;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Number 
{
	
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

			// Input 1: Take the 1st input and sort in descending order
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        // Create an array to store the numbers
	        int[] numbers = new int[n];

	        // Input the numbers
	        System.out.print("Enter the numbers separated by spaces: ");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        // Sort the numbers in descending order
	        Arrays.sort(numbers);
	        for (int i = 0; i < n / 2; i++) {
	            int temp = numbers[i];
	            numbers[i] = numbers[n - i - 1];
	            numbers[n - i - 1] = temp;
	        }

	        // Print the sorted numbers
	        System.out.print("Sorted in descending order: ");
	        for (int number : numbers) {
	            System.out.print(number + " ");
	        }
	        
	        
	        

	        // Input 2: Take the 2nd input and round off to 2 digits
	        System.out.print("Enter the second input (a number): ");
	        double input2 = scanner.nextDouble();
	        double roundedInput2 = Math.round(input2 * 100.0) / 100.0;
	        System.out.println("Rounded to 2 decimal places: " + roundedInput2);

	        
	        
	        // Input 3: Take the 3rd input, convert to BigDecimal, subtract, and print the value
	        System.out.print("Enter the third input (a number): ");
	        BigDecimal input3 = new BigDecimal(scanner.next());
	        BigDecimal subtractedValue = input3.subtract(new BigDecimal("10.5"));
	        System.out.println("Subtracted from 10.5: " + subtractedValue);

	        
	        
	        // Input 4: Take the 4th input and sort in ascending order
	        System.out.print("Enter the number of elements: ");
	        int n1 = scanner.nextInt();

	        // Create an array to store the numbers
	        int[] numbers1 = new int[n];

	        // Input the numbers
	        System.out.print("Enter the numbers separated by spaces: ");
	        for (int i = 0; i < n1; i++) {
	            numbers1[i] = scanner.nextInt();
	        }

	        // Sort the numbers in ascending order
	        Arrays.sort(numbers1);

	        // Print the sorted numbers
	        System.out.print("Sorted in ascending order: ");
	        for (int number : numbers1) {
	            System.out.print(number + " ");
	        }
	        
	        
	        
	        System.out.println();

	        scanner.close();
	    }
	}



