package Javapackage2;

import java.util.Scanner;

public class Common_String_Array {
	public static void main(String[]args) {

		String input1[]= {"ram","sham","adi","manav"};
		String input2[]= {"dipu","ram","gopu","adi"};
		
		int a,b;
		for(a=0;a<input1.length;a++) {
			for(b=0;b<input2.length;b++) {
				if(input1[a].equalsIgnoreCase(input2[b])) {
					System.out.println(input1[a]);
				}
			}
		}
		} 
}
