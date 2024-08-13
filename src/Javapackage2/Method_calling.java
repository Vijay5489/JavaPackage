package Javapackage2;

public class Method_calling {
	static int test(int x, int y) {
		int z;
		
		if(x<y) {

           z=(x+y);
		}
		else {

          z=(x-y)*2;
		}
		return z;
		
	}

	public static void main(String[]args) {
		int a=10, b=5;
		int c;
		c=test(a,b);
		
		int a1=3, b1=4;
		int c1;
		c1=test(a1,b1);
		System.out.println(c);
		System.out.println(c1);
	}
	
	
}
