package ArrayPackage;


public class DescendingArray {

	public static void main(String[]args) {

		int t  ;
		int a[]= {3,6,2,6,7,8,5,10};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i+1;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
//		for(int i=0;i<a.length; i++) {
//		System.out.println(a[i]);
//		}
		for(int b:a) {
			System.out.println(b);
		}
	}
}
