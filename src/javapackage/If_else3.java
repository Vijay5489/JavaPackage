package javapackage;

import java.util.Scanner;

public class If_else3 {
	
	public static void main(String [] arg) {
		
		int marksobtained, passingMarks;
		
		passingMarks=40;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input marks obtained by you");
		
		marksobtained = input.nextInt();
		
		if(marksobtained>= passingMarks) {
			System.out.println("You are pass");
		}
		else {
			System.out.println("You are fail");
		}
	}
	

}
