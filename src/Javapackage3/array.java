package Javapackage3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array {
	public static void main(String[]args) {
   int a[]= {2,4,6};
   int b[]= {7,8,9};
   int c[]=new int[a.length+b.length];
   
   for(int i=0;i<a.length; i++) {
		   c[i]=a[i];
		   
   }
   for(int i=0; i<b.length; i++) {
	   c[a.length+i]=b[i];
   }

 System.out.println(Arrays.toString(c));
	}
}
 