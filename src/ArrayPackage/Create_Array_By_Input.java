package ArrayPackage;

import java.util.Scanner;

public class Create_Array_By_Input {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Array size ");
		int size=sc.nextInt();
		int [] array=new int[size];
		System.out.println("Enter input");
		for(int i=0; i<size;i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Array is =");
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}
}
