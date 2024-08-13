package javapackage;

public class Exception_Multicatch {
	public static void main(String[]args) {
	
	try {
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
		String p="Kapuskhed";
		System.out.println(p);
		int q[]= {1,2,3,4,5};
		System.out.println(q[2]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("string is not available");
	}
	catch(ArithmeticException e) {
		System.out.println(" cannot divide with zero");
		
	}
	catch(Exception e) {
		System.out.println(" All data execute");
		
	}
	}

}

