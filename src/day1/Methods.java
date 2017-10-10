package day1;

public class Methods {
	
	Methods() {
		System.out.println("Constructor method is called when"
				+ " an object of the class is created");
	}

	//Main method where program execution begins 
	public static void main(String[] args) {
		staticMethod();
		Methods object = new Methods();
		object.nonStaticMethod();
	}

	//Static method
	private static void staticMethod() {
		System.out.println("Static methods can be called whitout creating object");
	}
	
	//Non static method
	private void nonStaticMethod(){
		System.out.println("Non static method must be called by creating an object");
	}
}
