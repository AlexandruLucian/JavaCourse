package day1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int c;
		System.out.println("Input an integer ");
		Scanner in = new Scanner(System.in);
		c = in.nextInt();
		
		if ((c/2)*c == c) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		in.close();
	}
}
