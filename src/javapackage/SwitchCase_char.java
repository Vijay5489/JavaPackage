package javapackage;

import java.util.Scanner;

public class SwitchCase_char {
	public static void main(String[]args) {
		char var;
		System.out.println("Enter a charactor");
		Scanner sc=new Scanner(System.in);
		var=sc.next().charAt(0);
		
		switch(var) {
		case 'r':
		System.out.println("This is common charactor");
		break;
		case 's':
			System.out.println("This is alternative charactor");
			break;
		case 'p':
			System.out.println("This is special charactor");
			break;
		}
	}

}
