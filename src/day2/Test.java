package day2;

public class Test {

	public static void main(String[] args) {
		int i = 0;
		boolean test1 = true;
		boolean test2 = false;
		while(i<=5) {
			System.out.println(i);
			i++; 
			System.out.println(test1^test2);
		}
	}

}
