package day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println("About to open a file");
			InputStream in  = new FileInputStream("missingfile.txt");
			System.out.println("File open");
			int data = in.read();
			in.close();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		//after Java 7
		try(InputStream in  = new FileInputStream("missingfile.txt")) {
			System.out.println("About to open a file");
			System.out.println("File open");
			int data = in.read();
			System.out.println(data);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(5/0);
	}
}
