package day3;

import java.util.ArrayList;
import java.util.List;

public class MyApplication {
	
	private static final ArrayList<String> values = new ArrayList<>();

	public static void main(String[] args) {
		List userList = new MyList();
		
		values.add("String");
		Integer bad2 = Integer.valueOf("12345");
		
		int size = userList.size();
		System.out.println(size);
		System.out.println(values);
	}

}
