package Javapackage3;

import java.util.Arrays;
import java.util.Scanner;

public class practis2   {

	public static void main(String[] args) {

    int a[]= {2,5,7};
    int b[]= {8,2,9};
    int []c=new int[a.length+b.length];
    for(int i=0; i<a.length; i++) {
    	c[i]=a[i];
    }
    for(int i=0; i<b.length; i++) {
    	c[a.length+i]=b[i];
    }
    System.out.println(Arrays.toString(c));
	}
}
