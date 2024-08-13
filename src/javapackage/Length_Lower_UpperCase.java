package javapackage;

public class Length_Lower_UpperCase {

	public static void main(String[] args) {
		
		String name="Vijay Patil";
		 int length=name.length();
		System.out.println(length);
		
		String lcase=name.toLowerCase();
		System.out.println(lcase);
		
		String Ucase=name.toUpperCase();
		System.out.println(Ucase);
		
		String subStrg=name.substring(7);  //it return string start with  index no 7 , index no  start with 0
		System.out.println(subStrg);

		String subStrg2=name.substring(1);  //it return string start with  index 1
		System.out.println(subStrg2);
		
		String substrg=name.substring(1, 8); // return value start with 1 end upto 7 , 8 not takes
		System.out.println(substrg);
		
		String replace=name.replace('V', 'A'); //in this it replace old  V to new A
		System.out.println(replace);
		
		String replace2=name.replace('a', 'P'); // in this we select target and replace it
		System.out.println(replace2);
		
		System.out.println(name.replace(" ", "_"));
		
		boolean boolenreturn=name.startsWith("Vija");
		System.out.println(boolenreturn);         // it return boolean value   true
		
		System.out.println(name.startsWith("Patil"));  //it return boolean value false
		
		System.out.println(name.endsWith("Patil"));   //it return boolean value Opposite to startsWith 
		
		System.out.println(name.charAt(1)); //it return 1 no's  charactor
		
		
		System.out.println(name.indexOf('j')); //it return no of char
		
		System.err.println(name.indexOf('a', 4)); //it start to find char a from index 5
		
		System.out.println(name.lastIndexOf('a')); //it check condition from last 
		
		System.out.println(name.equals("Vijay"));
		
		System.out.println(name.equalsIgnoreCase("vijay patil"));
		
		System.out.println(name.indexOf(" "));// it return where single space/double space/... is presrent otherwise return -1
	}

}
