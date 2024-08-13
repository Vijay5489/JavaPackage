package javapackage;

import java.util.Scanner;

public class PassORFail {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of math");
		byte m1=sc.nextByte();
		System.out.println("Enter marks of Hindi");
		byte m2=sc.nextByte();
		System.out.println("Enter marks of Chemistry");
		byte m3=sc.nextByte();
		
		float avg=(m1+m2+m3)/3.0f;
		System.out.println(" Your marks avg = "+avg);
		if(avg>40 && m1>33 && m2>33 && m3>33) {
			System.out.println("Congratulation you are Passed");
		}
		else {
			System.out.println("Sorry you are fail");
		}
	}
	
}
