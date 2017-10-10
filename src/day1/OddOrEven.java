package day1;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter an integer to check if is odd or even ");
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("You entered an even number");
		} else {
			System.out.println("you entered an odd number");
		}
		
		in.close();
	}

}
