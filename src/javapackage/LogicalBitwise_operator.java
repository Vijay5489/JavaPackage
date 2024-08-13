package javapackage;

public class LogicalBitwise_operator {

	public static void main(String[] args) {
		
	 int a= 10;
	 int b= 5;
	 int c= 30;
	 // logical operator
	 System.out.println(a<b && a<c ); //false + true = false in local operator if 1st condition is false then second condition does not check
	 System.out.println(a<c & a<b); // true + false = false,  in bitwise both checked either 1st false
	 System.out.println(a<c & b<c); //true + true = true
	 
	 int d= 20;
	 int e= 30;
	 int f=40;
	 
	 System.out.println(d>e && d<f); // false + true = false (one condition checked and given output)
	 
	 System.out.println(e<f & d>f );// true + false( both condition checked) = false
	 
	 

	}

}
  