package Javapackage2;

public class Method_calling2 {

	 int test(int x, int y) {
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
		
		Method_calling2 ref=new Method_calling2();
		int p=ref.test(a,b);
		System.out.println(p);
	}
}
