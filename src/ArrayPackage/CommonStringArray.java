package ArrayPackage;


public class CommonStringArray {

	public static void main(String[]args) {

		String a[]= {"ram","sham","krishna","hanuman"};
		String b[]= {"Krishna","Datta","Lakshman","Mahadev"};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i].equalsIgnoreCase(b[j])) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
