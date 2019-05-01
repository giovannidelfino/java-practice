package day29;

public class Student {
	public static void main(String[] args) {
		
		study();
		study();
		sayHello();
		sayHello();
		code();
		
	}
	
	public static void study() {
		System.out.println("Student is studing");	
	}
	//create a method with same sayHello, that prints, "hello friends!".
	public static void sayHello() {
		System.out.println("Hello Friends!");	
	}
	//create a method wth name code
	//"inside code method"
	//"student is coding java"
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding java");
	}
	
}
