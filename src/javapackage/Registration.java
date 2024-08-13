package javapackage;

import java.util.Scanner;

public class Registration implements Regi {

	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter city");
		String city=sc.nextLine();
		System.out.println("Enter mobile no");
		int mob=sc.nextInt();
		System.out.println("Enter capcha");
		char sp=sc.next().charAt(0);
	}

	
	public void output() {
		System.out.println(" Registration Successful");
		
	}
	public static void main(String[]args) {
		Registration rg=new Registration();
		rg.input();
		rg.output();
	}

}
