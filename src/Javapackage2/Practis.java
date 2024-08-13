package Javapackage2;

public class Practis {

	public static void main(String[]args) {
	int a=10, b=2, c;
	
	try {
		c=a/b;
		System.out.println(c);
		
		String z=null;
		System.out.println(z.toUpperCase());
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	catch(NullPointerException n) {
		System.out.println(" It is null pointer Exception ");
	}
	System.out.println("program is complete");
	}
}
