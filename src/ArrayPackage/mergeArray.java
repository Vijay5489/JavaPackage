 package ArrayPackage;

import java.util.Arrays;

public class mergeArray {
	
	public static void main(String[]args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int c[]=new int [a.length+b.length]; //[0 0 0, 0 0 0]
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];   //[1 2 3, 0 0 0]
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
