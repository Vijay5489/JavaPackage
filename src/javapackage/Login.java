package javapackage;

import java.util.Scanner;

public class Login implements Logine {

	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter password");
		String pass=sc.nextLine();
		
	}

	
	public void output() {
		System.out.println(" Login successful");
	}
	public static void main(String []args) {
		Login ref=new Login();
		ref.input();
		ref.output();
	}

}
