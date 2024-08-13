package javapackage;

public class Exception_multiple {

	public static void main(String []args ) {
		int a=10, b=0, c;
		
			try {
				c=a/b;
				System.out.println(c);
				
			}
			catch(ArithmeticException e) {
				System.out.println("zero cannot devide");
				
			}
			try {
				int z[]= {1,2,3,4,5};
				System.out.println(z[5]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(" Out of Boundary");
				
			}
	}
}
