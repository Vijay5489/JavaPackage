package Javapackage2;

import java.util.Scanner;

public class p3 implements p1, p2 {

	public void data1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name");
		String a=sc.nextLine();
	}
	public void data2() {
		Scanner as=new Scanner(System.in);
		System.out.println("Enter a password");
		String b=as.nextLine();
	}
	public void data3() {
		System.out.println("Click on login button");
	}
	public static void main(String[]args) {
		p3 ref=new p3();
		ref.data1();
		ref.data2();
		ref.data3();
	}
}
