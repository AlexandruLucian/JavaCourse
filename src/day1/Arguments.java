package day1;

public class Arguments {

	public static void main(String[] args) {
		for(String t : args){
			System.out.println(t);
		}
		//infinite loop
//		for(int i=0;i<10;) {
//			i = i++;
//			System.out.println("Hello world");
//		}
		
		int count = 0;
		ROW_LOOP:for(int row = 1; row<=3; row++)
			for(int col = 1; col<=2; col++) {
				if (row * col % 2 ==0) continue ROW_LOOP;
				count++;
			}
		System.out.println(count);
	}
}
