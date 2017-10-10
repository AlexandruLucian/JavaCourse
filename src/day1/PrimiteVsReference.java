/**
 * 
 */
package day1;

/**
 * Program to demonstrate the difference between primitive and reference type variable in java 
 * @author Alex
 *
 */
public class PrimiteVsReference {

	private static class Counter {
		private int count;
		
		public void advance (int number){
			count += number;
		}
		
		public int getCount() {
			return count;
		}
	}
	
	public static void main(String[] args) {
		int i = 30;
		System.out.println("Value of i before passing to method : " + i);
		print(30);
		
		System.out.println("Value of i after passing to method : " + i);
		Counter myCounter = new Counter();
		
		System.out.println("counter before passing to method : " + myCounter.getCount());
		print(myCounter);
		System.out.println("counter after passing to method : " + myCounter.getCount());
	}
	
	public static void print(Counter ctr) {
		ctr.advance(2);
	}
	
	public static void print(int value){
		value++;
	}

}
