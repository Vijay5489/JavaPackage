package javapackage;

public class Equal_EqualIgnors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String a= (" HELLO");
		
		String b= (" hello");
		
		if (a.equals(b) ){
			
			System.out.println(" a and b are equal "); // it is case sensitive
		}
			
			else {
				System.out.println(" a and b are not equal");
				
			}
		if ( a.equalsIgnoreCase(b)) {
			System.out.println( " a and b are equal by spelling "); 
			// it is non case sensitive
			
		}
			
		}
	}


