package javapackage;

public  class Abstract2 extends Abstract1 {
	
	void a() {
		System.out.println("hello abstract method");
	}
	public static void main(String[]args) {
		Abstract2 ref=new Abstract2();
		ref.eat();
		ref.a();
	}

}
