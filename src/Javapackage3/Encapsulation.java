package Javapackage3;

 class Encapsulation1 {

    private int value; 
    
    public void setter(int x) {
    	value=x;
    }
    public int  getter() {
    	return value;
    }
}
 public  class Encapsulation{
	 public static void main(String[]args) {
		 Encapsulation1 ref=new Encapsulation1();
		 ref.setter(100);
		 System.out.println(ref.getter());
	 }
 }
