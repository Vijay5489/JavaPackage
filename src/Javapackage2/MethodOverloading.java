package Javapackage2;

public class MethodOverloading {
	
	static void foo() {
		System.out.println("Good Mornig Bro!");
	}
	static void foo(int a) {
		System.out.println("Goodmorning  "+a+" Bro");
	}
	public static void main(String[]args) {
		MethodOverloading ref=new MethodOverloading();
		ref.foo();
		ref.foo(1000);
		
	}

}
