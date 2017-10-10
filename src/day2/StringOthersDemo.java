package day2;

public class StringOthersDemo {

	public static void main(String[] args) {
		String str = "This is a text";
		
		System.out.println("str = " + str);
		
		//return lower case of a string
		String s2 = str.toLowerCase();
		System.out.println("s2 = " + s2);
		
		//return upper case of a string
		String s3 = str.toUpperCase();
		System.out.println("s3 = " + s3);
		
		//check string starts with "This" or not
		boolean sWith = str.startsWith("This");
		System.out.println("sWith = " + sWith);
		
		String str2 = " \t Java is hot!  \t \n";
		
		//returns a copy of a string with leading and trailing whitespace omitted
		String s4 = str2.trim();
		System.out.println("s4 = " + s4);
	}

}
