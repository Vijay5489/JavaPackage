package Javapackage3;

import java.util.Scanner;

public class Number_of_word_in_string {

	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string ");
		String a=sc.nextLine();
		
		int count=1;
		for(int i=1; i<a.length()-1; i++) {
			if((a.charAt(i)==' ') && (a.charAt(i+1)!=' ')) {
				
				count++;
			}
		}
		System.out.println("No of word in string ="+count);
	}
}
