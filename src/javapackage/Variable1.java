package javapackage;

public class Variable1 {
      
	  int a= 99; //globle variable	
	  static int c= 5; //static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b= 50; //local variable
		//  Object Creation of class variable1
		Variable1 ref= new Variable1();
		
		System.out.println(b); //calling a variable b
		System.out.println(ref.a); // calling variable using Object Reference
		System.out.println(c);
		
		
	} 

}
