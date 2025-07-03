package jattask4;

import java.util.Scanner;

public class Questionn10 {
    public static void main(String[] args) {
    	
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter an integer: ");
			int num = scanner.nextInt();

			String numStr = Integer.toString(num).replace("-", "");

			int count = numStr.length();

			System.out.println("The number of digits in " + num + " is: " + count);
		}
    }
}
