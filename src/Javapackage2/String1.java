package Javapackage2;

public class String1 {

	public static void main(String[]args) {
		
		String a = ("Ram lakshman bharat");
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replace("Ram", "Krishna"));
		System.out.println(a.replace(" ", "_"));
		System.out.println(a.startsWith("R"));
		System.out.println(a.endsWith("rat"));
		System.out.println(a.indexOf('l'));
		System.out.println(a.indexOf('a', 11));
		System.out.println(a.indexOf(" "));
		System.out.println(a.lastIndexOf('r'));
		System.out.println(a.substring(8));
		System.out.println(a.subSequence(5, 14));
		System.out.println(a.equals("Ram Sham"));
		System.out.println(a.equalsIgnoreCase("Ram lakshman bharat"));
		System.out.println(a.charAt(8));
		
	}
}
