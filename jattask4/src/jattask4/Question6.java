package jattask4;

import java.util.Scanner;

	public class Question6 {
	    public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
		System.out.print("Enter a number: ");
				int num = scanner.nextInt();
				
				long factorial = 1;
      
		if (num < 0) {
		System.out.println("Factorial is not defined for negative numbers.");
				} 
		else{
				    
				    for (int i = 1; i <= num; i++) {
				        factorial *= i;
				    }

				  
				    System.out.println(num + "! = " + factorial);
				}
			}
	    }
	}

