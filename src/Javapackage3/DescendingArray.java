package Javapackage3;

import java.util.Scanner;

public class DescendingArray {

	public static void main(String[]args) {
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int input=sc.nextInt();
		int a[]=new int[input];
		for(int i=0; i<input; i++) {
			 a[i]=sc.nextInt();
			
		}
		sc.close();
		for(int i=0; i<input; i++) {
			System.out.println(a[i]);
		}
		
		
	}
}