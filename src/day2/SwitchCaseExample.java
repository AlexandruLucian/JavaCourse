package day2;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		grading('A');
		grading('C');
		grading('E');
		grading('G');
		
		final char a='A', d= 'D';
		char grade = 'B';
		
		switch(grade) {
		case a:
		case 'B' : System.out.println("great");
		case 'C' : System.out.println("good");break;
		case d:
		case 'F' : System.out.println("not good");
		}
	}
	
	public static void grading (char grade) {
		
		int success;
		switch(grade) {
		case 'A' :
			System.out.println("Excellent grade");
			success = 1;
			break;
		case 'B' :
			System.out.println("Very good grade");
			success = 1;
			break;
		case 'C' :
			System.out.println("Good grade");
			success = 1;
			break;
		case 'D' :
		case 'E' :
		case 'F' :
			System.out.println("Low grade");
			success = 0;
			break;
		default : 
			System.out.println("invalid grade");
			success = -1;
			break;
		}
		passTheCourse(success);
	}

	private static void passTheCourse(int success) {
		switch (success) {
		case -1:
			System.out.println("No result");
			break;
		case 0:
			System.out.println("Final result: Fail");
			break;
		case 1:
			System.out.println("Final result: Success");
			break;
		default:
			System.out.println("Unknown result");
			break;
		}
	}

}
