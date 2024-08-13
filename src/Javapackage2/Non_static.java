package Javapackage2;

public class Non_static {
	
	int test(int x, int y) {
		int z;
		z=(x+y);
		return z;
	}
	public static void main(String[]args) {
		Non_static ref=new Non_static();
		int asc=ref.test(10, 20);
		
		
		System.out.println(asc);
	}

}
