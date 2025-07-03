package jattask4;

import java.util.Scanner;

public class Question4 {


		    public static void main(String[] args) {
		    	
		        try (Scanner scanner = new Scanner(System.in)) {
					System.out.print("Enter the first number (a): ");
					int a = scanner.nextInt();

					System.out.print("Enter the second number (b): ");
					int b = scanner.nextInt();

     
					System.out.println("Before swapping: a = " + a + ", b = " + b);

					
					int temp = a;
					a = b;
					b = temp;

     
					System.out.println("After swapping: a = " + a + ", b = " + b);
				}
		    }
		


	}


