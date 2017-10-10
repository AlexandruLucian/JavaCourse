package day2;

public class ShortCircuitLogicaloperator {

	public static void main(String[] args) {
		int i = 5;
		int j = 10;
		int k = 15;
		
		String s1="Hello", s2="Hello";
		
		if((i<j) || (k++>j)) { //(k++>j) is not executed
			System.out.println("First if, value of k: " + k);
		}
		
		if((i<j) && (k++<j)) {
			System.out.println("Second if, value of k: "+ k);
		}
		
		if(s1==s2) { //this case is true as both values are saved in the same location
			System.out.println("I should not be here!");
		}
		
		System.out.println("Out of if, k: " + k);
	}

}
