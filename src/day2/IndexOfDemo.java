package day2;

public class IndexOfDemo {

	public static void main(String[] args) {
		String str = "This is text";
		
		// Find index within this string of the first occurrence 'i'.
		int idx = str.indexOf("i");
		System.out.println("-indexOf('i') = " + idx);
		
		// Find index within this string of the first occurrence 'i'
		// starting the search at index 4.
		idx = str.indexOf("i", 4);
		System.out.println("-indexOf('i', 4) = " + idx);
		
		// index within this string of the first occurrence of "te".
		idx = str.indexOf("te");
		System.out.println("-indexOf('te') = " + idx);
	}
}
