package javapackage;

import java.util.Scanner;

public class Scanner_2numbers {

	public static void main(String[] args) {
		

		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("print two numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum =a+b;
		System.out.println("Addition of two numbers ="+sum);
	}

}
