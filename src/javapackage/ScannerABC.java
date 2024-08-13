package javapackage;

import java.util.Scanner;

public class ScannerABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num");
		int a= sc.nextInt();
		
		System.out.println("Enter 2nd num");
		int b= sc.nextInt();
		
		
		int sum = a+b;
		System.out.println("Addition of two num are = "+sum);
	
	}

}
