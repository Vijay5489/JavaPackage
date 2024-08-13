package Javapackage2;

import java.sql.Array;

public class Array_forloop {
public static void main(String[]args) {
	int a[]= {10,20,30,40,50,60,70,80,90};
//	for(int b:a) {
//		System.out.println(b);
//	}
	
//	for(int i=0; i<a.length; i++) {
//		System.out.println(a[i]);
//	}
	
//	for(int i=a.length-1; i>=0; i--) {
//		System.out.println(a[i]);
//	}
	
	float []marks= {10.3f,20.3f,40.5f,34.6f};
	float sum=0;
	for(float element :marks) {
		sum=sum+element;
	}
	System.out.println(sum);
}
}
