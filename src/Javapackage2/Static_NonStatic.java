package Javapackage2;

public class Static_NonStatic {

	int a;
	static int b;
	public static void main(String[]args) {
		data();
		Static_NonStatic ref=new Static_NonStatic();
		ref.test();
	}
	void test() {
		a=100;
		System.out.println(a);
	}
	 static void data() {
		b=200;
		System.out.println(b);
	}
}
