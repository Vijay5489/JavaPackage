package Javapackage2;

public class Return1 {

	public void test1() {
		System.out.println("Hello");           //it means nothing will return , all will print from this place
	}
	public int test2() {
		return 3;            // method datatype is int so, it will retun int value
	}
	public double test3() {
		return 3.99;           // method data type is double so , it will return double value

	}
	public boolean test4() {
		return true;             //method data type is boolean so , it will return true or false value
	}
	public char test5() {
		return 'a';          //method data type is char so , it will return alphabet value
	}
	public String test6() {
		return "Vijay";           //method  is String  type so , it will return String value
	}
	public Return1 test7() {
		return new Return1();    //in this object is made of same class so method type is class
	}
	public int[] test8() {
		return new int[7];   //in this retun type is array because method type is array
	}

}
