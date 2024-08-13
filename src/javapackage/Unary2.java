package javapackage;

public class Unary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		int a=100;
		int b=50;
		System.out.println(a++); //100 ,latest 101
		System.out.println(++b); //51 , latest 51
		System.out.println(++a + ++b );	// 102 + 52 =154, latest 102 ,52
	    System.out.println(a++ + b++);// 102 + 52 =154  , latest 103, 53
	    System.out.println(--a +--b); // 102 + 52 = 154 , latest 102,52
	    System.out.println(--a - --b); //101 -51 = 50 ,  latest 101,51
	    System.out.println(a++ + ++b); // 101 + 52 =153,  latest 102 , 52
	    System.out.println(++a - --b); // 103 - 51 = 52 , latest 103, 51
	    System.out.println(++a - b--); // 104 - 51 = 53 ,  latest 104,50
	}
}
