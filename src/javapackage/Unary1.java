package javapackage;

public class Unary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 10;
		int y= 10;
		System.out.println(x++); // x=10
		System.out.println(x++-y++); //11-10=1
		System.out.println(y++); //y=11
		System.out.println(++y); // 12+1= 13
		System.out.println(++x + --y);//13+12=25
		System.out.println(y++ + y--);//12+13=25
		System.out.println(++x);//=14
		System.out.println(y);//12
		System.out.println(x);//14
		
		
		

	}

}
       