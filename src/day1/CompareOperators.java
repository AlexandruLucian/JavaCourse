package day1;

public class CompareOperators {

	public static void main(String[] args) {
		int i  =20;
		int j = 20;
		
		if (i==j) {
			System.out.println("i an j are equal");
		}
		
		String JPY = new String("JPY");
		String YEN = new String("JPY");
		
		if(JPY == YEN){
			System.out.println("JPY and YEN are same");
		}
		
		if(JPY.equals(YEN)){
			System.out.println("JPY and YEN are equal by equals()");
		}
	}

}
