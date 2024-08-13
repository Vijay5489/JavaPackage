package Javapackage2;

import java.util.Scanner;

public class interface2 implements Interface1 {
	

	public  void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String name=sc.nextLine();
		System.out.println(name);
		
	}
	public void output() {
		System.out.println("Correct input");
	}
	public static void main(String[]args) {
		interface2 ref=new interface2();
		ref.input();
	}
}
