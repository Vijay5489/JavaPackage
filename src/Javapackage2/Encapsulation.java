package Javapackage2;

public  class Encapsulation {

    private int value;
    public void setter(int x) {
    	value=x;
    	System.out.println(value);
    }
      int getter() {
    	return  value;
    }
    public static void main(String[]args) {
    	Encapsulation ref=new Encapsulation();
    	ref.setter(100);
    
    }
}
