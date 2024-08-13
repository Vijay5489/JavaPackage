package javapackage;

import java.util.Scanner;

public class Practis2 {

	public static void main(String[]args) {

		 Scanner sc=new Scanner(System.in);
		 char input=sc.next().charAt(0);
		 System.out.println("Enter a alphabet");
		 if((input>='a' & input<='z') ||(input>='A' & input<='Z')) {
			 System.out.println("It is alphabet");
		 }
		 else {
			 System.out.println("It is not alphabet");

		 }
		
	}
}
