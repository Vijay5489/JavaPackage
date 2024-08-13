package Javapackage2;

class data1{
	private int value;
	public void setter(int x) {
		value=x;
	}
	public int getter() {
		return value;
	}
}
public class AcsesMo2 {

	public static void main(String[]args) {
		data1 ref=new data1();
		ref.setter(1000);
		System.out.println(ref.getter());
	}
}
