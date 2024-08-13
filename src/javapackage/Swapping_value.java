package javapackage;

public class Swapping_value {
	public static void main(String []args ) {

	int a=10 ,b=20;
	
	System.out.println("Before swapping values "+a+"  "  +b);
	// logic 1 3rd variable used
	/*int t=a;
	    a=b;
	    b=t;*/
	// logic 2nd + and - used
	/*a=a+b;
	b=a-b;
	a=a-b;*/
	    
	//logic 3 * and / used
	
	a=a*b;
	b=a/b;
	a=a/b;
	
	    System.out.println("After swapping values  "+a+"   " +b);
}
}
