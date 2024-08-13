package Javapackage2;

public class CommonArray {
 
	public static void main(String[]args) {
		int input1[]= {10,20,40,60,70};
		int input2[]= {30,50,10,40,90};
		int i, j;
		for( i=0; i<input1.length; i++) {
			for(j=0; j<input2.length; j++) {
				if(input1[i] == input2[j]) {
					System.out.println(input1[i]);
					break;
				}
			}
			
		}
	}
}
