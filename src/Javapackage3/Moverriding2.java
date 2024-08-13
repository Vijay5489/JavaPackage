package Javapackage3;

public class Moverriding2 extends Moverriding {

	public void data() {
		System.out.println("You are eating");
	}
	public static void main(String[]args) {
		Moverriding2 ref=new Moverriding2();
		ref.data();
		Moverriding asc=new Moverriding();
		asc.data();
	}
}
