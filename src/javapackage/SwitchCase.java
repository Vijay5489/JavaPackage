package javapackage;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		int age ;
		System.out.println("Enter age ");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		switch(age) {
		case 18 :
			System.out.println("You are Eligible for interview");  //if we not break then after match case all statement will print
			break;
		case 23:
			System.out.println("You are Eligible for work");
			break;
		case 35:
			System.out.println("You are semi Exprienced Person");
			break;
		case 45:
			System.out.println("You are Exprienced Person");
			break;
			
		}
		System.out.println("Enjoy your \n life");
		
	}

}
