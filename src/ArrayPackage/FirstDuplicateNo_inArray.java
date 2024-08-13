package ArrayPackage;

public class FirstDuplicateNo_inArray {
 public static void main(String[] args) {

		int [] x= {1,3,4,5,7,3,8};
		
		for(int i=0; i<x.length; i++) {
			for(int j=1+i; j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println(x[i]);
				}
			}
			
		}
	}
}
