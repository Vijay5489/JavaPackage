package javapackage;

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 25;
		System.out.println(a); // 25
		
		char b= 'A';
		System.out.println(b); // A
		
		boolean z = true;
		System.out.println(z); // true
		
		int c= 100;
		int d = 200;
		boolean e = c>d;
		System.out.println(e);  // false
		
		boolean f= c<d;
		System.out.println(f); // true
		
		float g= 124.567812f;
		System.out.println(g); //124.56781 here also limitation so 2 not print, so double datatype is used
		
		double h= 1234567.124356473647847d;
		System.out.println(h); //1234567.124356473647847
		
		long j = 1234567890123456375l; 
		System.out.println(j);// we use l because only long has limitation up to 10 digit 
		//also in int  data type there is limit up to 10 digit 
		
		
		
	}

}
