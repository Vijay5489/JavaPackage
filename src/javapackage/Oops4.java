package javapackage;

public class Oops4 extends Oops3 {
	
	public void multiplication(int c , int d) {
		
		x=c*d;
		
		System.out.println("Multilication is "+x);
	}
	
	public static void main(String [] args) {
		
		Oops4 ref=new Oops4();
		
		ref.sum(10, 20);
		ref.multiplication(10, 10);
		
		
	}

}
