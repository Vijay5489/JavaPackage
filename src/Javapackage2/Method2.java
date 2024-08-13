package Javapackage2;

public class Method2 {
	static int test(int x, int y) {
		int z=0;
		if(x>y) {
		z=(x+y);
		}
		else {
			z=(x-y)*2;
		}
		return z;
	}
public static void main(String[]args) {
	int a=20, b=10;
	int c=test(a,b);
	int a1=10,b1=20;
	int c1=test(a1,b1);
	System.out.println(c);
	System.out.println(c1);
}
}
