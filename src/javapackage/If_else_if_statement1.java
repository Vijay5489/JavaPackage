package javapackage;

public class If_else_if_statement1 {
	
	public static void main(String [] args) {
		
		int a=100;
		int b= 200;
		
		if (a>b) {
			System.out.print("Result not ok");
		}
		else if (a == b) {
			System.out.println(" Result ok");
			
		}
		else if (a >= b ) {
			System.out.println(" Result a  less than b");}
		
		else if (b>a) {
			System.out.println(" b Greater than a");
		}
		
		else {
			System.out.println(" Out of the block");
			
		}
	}

}
