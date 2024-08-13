package Javapackage3;

public  class Encapsulationn {

	private int value;
	
	 void setter(int x) {
		value=x;
		System.out.println(value);
	}
	 int getter(){
		return value;
		} 
	 public static void main(String[]args) {
		 Encapsulationn ref=new Encapsulationn();
		 ref.setter(100);
		 ref.getter();
	 }
}
