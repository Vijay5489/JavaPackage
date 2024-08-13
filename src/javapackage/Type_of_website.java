package javapackage;

import java.util.Scanner;

public class Type_of_website {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a url " );
		String  url=sc.nextLine();
		if(url.endsWith(".com")) {
			System.out.println("It is commertial website");
		}
		else if(url.endsWith(".org")) {
			System.out.println("It is Organisational website");
		}
		else if(url.endsWith(".in")) {
			System.out.println("It is Indian website");
		}
	}

}
