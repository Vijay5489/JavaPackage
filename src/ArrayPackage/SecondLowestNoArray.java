package ArrayPackage;


public class SecondLowestNoArray {

	public static void main(String[]args) {
		int t;
		int a[]= {2,5,6,4,7,8,9,1};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<a.length; j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println(a[1]);
	}
}
