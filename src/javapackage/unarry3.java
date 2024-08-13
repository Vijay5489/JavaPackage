package javapackage;

public class unarry3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 500;
		int y= 500;
		
		System.out.println(++x); //501
		System.out.println(--y);//499
		System.out.println(x++);//501 ,  latest value 502
		System.out.println(++y);// 500,   latest value 500
		System.out.println(x++ + --y); //502 + 499 = 1001 , latest value of x=503 ,y=499
		System.out.println(++y - y--); //500 - 500 = 0 , latest value of y = 499
	    System.out.println(++y - x++);// 500 - 503 = -3 , latest value of x =504 , y=500
	    System.out.println(--y + x++ + y--); // 499+ 504 +499 =1502 , latest value of x=505, y=498
		System.out.println(++x - --x + y++ - ++y );// 506 - 505 + 498 - 500= -1
		// latest value of x= 505 , y= 500
		System.out.println(++y + --x - y++ + --y);// 501 + 504 - 501 + 501 =1005 
		 //latest value of x= 504 , y= 501
		
	}

}  
