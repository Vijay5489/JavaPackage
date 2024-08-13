package javapackage;

public class child extends parent {
	public void home() {
		System.out.println(" home ");
	}
	public static void main(String [] args) {
		
		child ref=new child();
		ref.farm();
		ref.home();
		
	}
	

}
