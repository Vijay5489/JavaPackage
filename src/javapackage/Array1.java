package javapackage;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a []= {10,20,30,40,50};// int Array
       String b []= {"Ram","Sham","Ajit","Rohan","Manish"};
       
       System.out.println(a[2]);//30
       System.out.println(a[4]);//50
       System.out.println(b[3]);//Rohan
       System.out.println(b[0]);//Ram
       System.out.println(a[5]);//ArrayIndexOutofBoundaryExeption
	}

}
