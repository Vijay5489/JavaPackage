package Javapackage3;

public class beta2  implements beta{

	public void data() {
		for(int i=0; i<5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[]args) {
		beta2 ref=new beta2();
		ref.data();
	}
}
