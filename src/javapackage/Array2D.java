package javapackage;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{505,608},{10,20},{30,40},{50,60},{500,600000},{505,608},{10,20},{30,40},{50,60},{500,600000}};
		
//		System.out.print(a[0][0]);
//		System.out.print(a[0][1]);
//		System.out.print(a[1][0]);
//		System.out.println(a[1][1]);
//		System.out.print(a[   2][0]);
//		System.out.println(a[2][1]);
		
		//int [] flats;
		//flats= new int[3];
//		int [][] flats;
		//int a = 3, b = 4;
//		flats= new int[2][3];
		//flats[0]=101;
		//flats[1]=102;
		//flats[2]=103;
//		flats[0][0]=101;
//		flats[0][1]=102;
//		flats[0][2]=103;
//		flats[1][0]=104;
//		flats[1][1]=105;
//		flats[1][2]=106;

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
			System.out.print(a[i][j]);
			System.out.print(" ");
		}
			System.out.println("");
		}
	}

}
