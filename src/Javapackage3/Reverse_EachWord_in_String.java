package Javapackage3;

public class Reverse_EachWord_in_String {

	public static void main(String[]args) {
		
		String str="My name is vijay";
		
//    	String [] asc=str.split(" ");      // convert string into string array// split method split into multiple part where space is occur
//		
//    	String reverseString=" ";
//    	
		
		
		String result=" ";
		for(int i=str.length()-1; i>=0; i--) {
			 result+=str.charAt(i);
		}
		System.out.println(result);
	}
}
