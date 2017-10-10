package day2;

public class StringSwitchCase {

	public static void main(String[] args) {
		visitInsland("Santorini");
		visitInsland("Crete");
		visitInsland("Paros");
	}
	
	public static void visitInsland(String island) {
		switch(island) {
		case "Corfu":
			System.out.println("User wants to visit Corfu");
			break;
		case "Crete":
			System.out.println("User wants to visit Crete");
			break;
		case "Santorini":
			System.out.println("User wants to visit Santorini");
			break;
		case "Mykonos":
			System.err.println("User wants to visit Mykonos");
			break;
		default:
			System.out.println("Unknown island");
			break;
		}
	}

}
