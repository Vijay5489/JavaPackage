package javapackage;

public class Practus {

	public static void main(String[]args) {
		String input="Kapuskhed";
		
		System.out.println(input.length());
		System.out.println(input.toLowerCase());
		System.out.println(input.toUpperCase());
		System.out.println(input.substring(5));
		System.out.println(input.substring(3, 7));
		System.out.println(input.replace("khed", "Gaov"));
		System.out.println(input.startsWith("Kapus"));
		System.out.println(input.endsWith("khed"));
		System.out.println(input.charAt(5));
		System.out.println(input.indexOf('s'));
		System.out.println(input.indexOf('k', 4));
		System.out.println(input.lastIndexOf('e'));
		System.out.println(input.equals("Kapuskhed"));
		System.out.println(input.equalsIgnoreCase("KapuSkhed"));
	}
}
