package Javapackage3;

public class Overriding2 extends Overriding {

	public void data() {

		System.out.println("You are eating");
	}
	public static void main(String[]args) {
		
		Overriding2 ref=new Overriding2();
		ref.data();
		Overriding ref2=new Overriding();
		ref2.data();
	}
}
