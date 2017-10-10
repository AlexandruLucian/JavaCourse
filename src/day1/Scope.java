package day1;

//Demonstrate block scope
public class Scope {

	public static void main(String[] args) {
		int n1; //visible in main
		
		n1= 10;
		
		if (n1 ==10) {
			//start new scope
			int n2 = 20; //visible only to this block
			
			//num1 and num2 both visible here
			System.out.println("n1 and n2: " + n1 + "" + n2);
		}
		//n2 = 100; Error! n2 is not visible here
		
		//n1 is still visible here
		System.out.println("n1 is :" + n1);
	}
}
