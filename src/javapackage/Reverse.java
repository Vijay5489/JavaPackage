package javapackage;

import java.util.Scanner;

public class Reverse {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");

	int num=sc.nextInt();
	
	
	/*StringBuffer sb=new StringBuffer(String.valueOf(num));
	StringBuffer rev=sb.reverse();*/
	
	/*StringBuilder sb=new StringBuilder();
	 sb.append(num);
	StringBuilder rev=sb.reverse();*/
	
	int rev=0;
	while (num != 0)
	{
		 rev=rev*10 +num% 10;
		 num = num/10;
	}
	

	System.out.println(rev);
		
	

}
}