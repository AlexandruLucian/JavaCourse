package day2;

public class SubstringDemo {

	public static void main(String[] args) {
		String str = "This is a text";
		
		//returns the substring from index 3 to the end of the string
		String subString = str.substring(3);
		System.out.println("-substring(3) = " + subString);
		
		//returns the substring from index 3 to 7
		subString = str.substring(3, 7);
		System.out.println("-substring(3, 7) = " + subString);
	}
}
