package ArrayPackage;


public class SecondLargestArrayNo {

	public static void main(String[]args) {

		int t;
		int a[]= {3,5,7,2,8,5,9,12};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<1+i; j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		System.out.println(a[1]);
	}
}
