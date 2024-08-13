package javapackage;

public class Overriding_2 extends Overriding_1{
	 public void  eat(){
		 System.out.println(" You are eating");
	 }
	public static void main(String[]args) {
		Overriding_2 ref1=new Overriding_2();
		ref1.eat();
		Overriding_1 ref2=new Overriding_1();
	  ref2.eat();
	  
	}

}
