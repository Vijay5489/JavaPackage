package javapackage;

public class variable4_object {
	
	 int a= 100; // global variable
	 
	 static int b = 200; // static variable
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d= 500; // local variable
		
		variable4_object ref= new variable4_object(); // object creation for global variable
		
		System.out.println(ref.a);
		
		System.out.println(b);
		
		System.out.println(d);
		

	}

}
