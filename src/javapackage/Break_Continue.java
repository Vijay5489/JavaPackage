package javapackage;

public class Break_Continue {

	public static void main(String[]args) {
		
	   /* for(int i=0; i<10 ; i++) {
			System.out.println(i);
			System.out.println(" Java is great ");
			if(i== 3) {
				break;
			}
		}  */
		 
		for(int i=0 ; i<10; i++) {
			System.out.println(i);
			System.out.println("Java is Great");
			
			if(i==3) {
				
				continue;                  //continue means we skip line below  this
			}
			System.out.println("Paython is Great");
		}
		
	}
}
