package day2;

import java.util.Scanner;

public class CircleDemo {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the radius: ");
		
		double radius = sc.nextDouble();
		//Area = PI*radius*radius
		Double area = Math.PI *(radius * radius);
		System.out.println("The area of the circle is: " + area);
		
		//Circumference = 2*PI*radius
		double circumference = Math.PI*2*radius;
		System.out.println("The circumference of the circle is: " + circumference);
	}

}
