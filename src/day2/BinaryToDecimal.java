package day2;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		String binary = input.nextLine();
		
		System.out.println("Output: " + Integer.parseInt(binary, 2));
		input.close();
	}

}
