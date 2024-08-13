package javapackage;

import java.util.Scanner;

public class Forloopnaturalnum {

	public static void main(String[]args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 for(int i=n; i>0 ;i--) {
			 System.out.println(i);
		 }
		
		
	}
}
