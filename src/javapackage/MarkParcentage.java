package javapackage;

import java.util.Scanner;

public class MarkParcentage {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter math marks");
		int math=sc.nextInt();
		System.out.println("Enter hindi marks");
		int hindi=sc.nextInt();
		System.out.println("Enter marathi marks");
		int marathi=sc.nextInt();
		System.out.println("Enter History marks");
		int history=sc.nextInt();
		System.out.println("Enter Geography marks");
		int  geo=sc.nextInt();
		
	    float percent=((math+hindi+marathi+history+geo)*100)/500;
	    System.out.println(percent);
	}
}