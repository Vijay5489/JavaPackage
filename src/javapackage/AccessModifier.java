package javapackage;

public class AccessModifier {
	public static void main(String [] args) {
		
		test ref=new test();
		System.out.println(ref.x);
		//System.out.println(ref.y);
		// y is private , so private cannot execute in same package
		System.out.println(ref.z);
		System.out.println(ref.p);
	}

}
class test{
	public int x=5;
	private int y=7;
	protected int z=9;
	int p=10;
	public void data() {
		
		//all access  can execute in same class
		/*System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);*/
}
}