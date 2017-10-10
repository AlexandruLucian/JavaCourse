package day2;

public class ReplaceDemo {

	public static void main(String[] args) {
		String str = "This is a text";
		
		//replace the character "i" by "x"
		String s2 = str.replace("i", "x");
		System.out.println("s2 = " + s2);
		
		//replace all the string match "is" by "abc"
		String s3 = str.replaceAll("is", "abc");
		System.out.println("s3 = " + s3);
		
		//replace the first substring of this string that matches "is" by "abc"
		String s4 = str.replaceFirst("is", "abc");
		System.out.println("s4 = " + s4);
		
		// (See also document the regular expression)
		// Replace all substring matching expression:
		// "is|te": means "is" or "te" replaced by "+".
		String s5 = str.replaceAll("is|te", "+");
		System.out.println("s5 = " + s5);
	}

}
