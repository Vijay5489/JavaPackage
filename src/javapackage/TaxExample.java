package javapackage;

import java.util.Scanner;

public class TaxExample {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income");
		float tax=0;
		float income= sc.nextFloat();
		if(income<2.5) {
			tax=tax+0;
		}
		else if(income>2.5 && income<5) {
			tax=0.05f * (income-2.5f);
		}
		else if(income >5 && income<10) {
			tax=0.20f * (income-2.5f);
		}
		else if(income>10 ) {
			tax=0.30f * (income-2.5f);
		}
		System.out.println("Your tax is  ="+ tax);
	}
}
