package day5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenericsCollections {

	public static void main(String[] args) {
		List<String> myList  = new ArrayList<>();
		
		Queue<Object> queue = new LinkedList<>();
		
		Deque<String> deque = new ArrayDeque<String>();
		
		System.out.println(myList);
		System.out.println(queue);
		System.out.println(deque);
	}
	final void method() {}
}
