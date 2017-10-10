package day1;

public class BitwiseOperatorsDemo {

	public BitwiseOperatorsDemo() {
		int x = 0xFAEF;
		int y = 0xF8E9;

		System.out.println("x & y :" + (x & y));
		System.out.println("x | y :" + (x | y));
		System.out.println("x ^ y :" + (x ^ y));
		System.out.println("~x :" + (~x));
		System.out.println("x << y :" + (x << y));
		System.out.println("x >> y :" + (x >> y));
		System.out.println("x >>> y :" + (x >>> y));
		
		//There is no unsigned left shift operator
	}
	
	public static void main(String[] args) {
		new BitwiseOperatorsDemo();
	}

}
