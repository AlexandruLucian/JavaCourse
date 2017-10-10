package day2;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		int counter, num, item, array[];
		
		//to capture the user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		num = input.nextInt();
		
		//creating array to store all the elements
		array = new int[num];
		System.out.println("Enter " + num + " integers");
		
		//loop to store each number in array
		for(counter = 0 ; counter < num; counter++) {
			array[counter] = input.nextInt();
		}
		
		System.out.println("Enter the search value: ");
		item = input.nextInt();
		
		for(counter = 0; counter < num; counter++){
			if(array[counter] == item) {
				System.out.println(item + " is present at location " + (counter + 1));
				break;
			}
		}
		if (counter == num) {
			System.out.println(item + " doesn't exist in array. ");
		}
		
		input.close();
	}

}
