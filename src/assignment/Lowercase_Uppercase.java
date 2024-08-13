package assignment;

import java.util.Scanner;

public class Lowercase_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch ;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Anter any Charactor");
	
	ch =sc.next().charAt(0);
	
	if(ch>=65 && ch<=90) {
		
		System.out.print("Upper Case");
	}
	else if  (ch>=97 && ch<=122) {
		
		System.out.println("Lower Case");
	}
	
	else if  (ch>=48 && ch<=57) {
		System.out.println("Digit");
	}
	}

}
