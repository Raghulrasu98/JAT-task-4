package jattask4;

import java.util.Scanner;

public class Question5 {

	
 public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

	     	if (num <= 1) {
			    System.out.println(num + " is not a prime number.");
			    return;
			}
			for (int i = 2; i < num; i++) {
			    if (num % i == 0) {
			        System.out.println(num + " is not a prime number.");
			        return;
			    }
			}

			System.out.println(num + " is a prime number.");
		}
    }
}

