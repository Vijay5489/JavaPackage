package Javapackage2;

public class Multiplication {
	static void test(int n) {
		for(int i=1; i<=10; i++) {
			System.out.format("%d X %d =%d\n",i,n,(n*i));
		}
	}
	public static void main(String[]args) {
		int n;
		test(n=5);
	}

}
