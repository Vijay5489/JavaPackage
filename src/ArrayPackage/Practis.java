package ArrayPackage;

public class Practis {

	public static void main(String[]args) {
		int a[]= {'2','4','7','8'};
		int b[]= {'3','4','8'};
		for(int i=0; i<a.length; i++) {
			for(int j=1; j<b.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}