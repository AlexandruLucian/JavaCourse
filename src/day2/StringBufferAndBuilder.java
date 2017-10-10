package day2;

public class StringBufferAndBuilder {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Test");
		buffer.append("StringBuffer");
		System.out.println("1. Join string ussing StringBuffer = " + buffer.toString());
		
		StringBuilder builder = new StringBuilder();
		builder.append("Test");
		builder.append("StringBuilder");
		System.out.println("2. Join string ussing StringBuilder = " + builder);
		System.out.println("3. Execution time of StringBuffer and StringBuilder");
		calculateTime();
	}

	private static void calculateTime() {
		long loopLimit = 500;
		
		long startBuilderTime = System.nanoTime();
		StringBuilder builder = new StringBuilder("Test");
		for(int index=0; index<loopLimit; index++) {
			builder.append("ExecutingTime");
		}
		long builderExeTime = System.nanoTime() - startBuilderTime;
		System.out.printf(" 3.1 StringBuilder execution time = %d ns \n", builderExeTime);
		
		long stratBufferTime = System.nanoTime();
		StringBuffer buffer = new StringBuffer("Test");
		for(int index=0; index<loopLimit; index++) {
			buffer.append("ExecutingTime");
		}
		long bufferExeTime = System.nanoTime() - stratBufferTime;
		System.out.printf(" 3.2 StringBuffer execution time = %d ns \n", bufferExeTime);
		
		long timeDifference = bufferExeTime - builderExeTime;
		System.out.printf(" 3.3 Time StringBuffer - StringBuilder = %d ns \n", timeDifference);
	}

}
