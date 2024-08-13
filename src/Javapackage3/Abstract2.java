package Javapackage3;

public class Abstract2 extends Abstract1{

	    void data() {
		   String a="Vijay patil";
		   System.out.println(a);
	   }
	public static void main(String[]args) {
		int a=100;
		if(a>50) {
			System.out.println("It is true");
		}
		Abstract2 ref=new Abstract2();
		ref.data();
	}
}
