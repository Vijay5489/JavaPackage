package javapackage;

public class ReverseString {
	public static void main(String[]args) {
		
		String str="ABCD";
		
		
		/*StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());*/
		
		String rev="";
		
		int len=str.length();
		for(int i=len-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed String is "+rev);
	}

}
