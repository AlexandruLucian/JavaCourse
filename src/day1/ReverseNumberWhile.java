package day1;

import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		int num= 0;
		int reverseNum = 0;
		
		System.out.println("Input your number and press enter: ");
		//this statement will capture the user input
		Scanner in = new Scanner(System.in);
		//captured input will be stored in number num
		num = in.nextInt();
		//logic to find out the reverse number
		while (num != 0) {
			reverseNum = reverseNum *10;
			reverseNum = reverseNum + num%10;
			num = num/10;
		}
		System.out.println("Reverse of the input number is : " + reverseNum);
		
		in.close();
	}
}
