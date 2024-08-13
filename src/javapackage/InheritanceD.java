package javapackage;

public class InheritanceD extends InheritanceC{
	int z;
	
	public void multiplication(int x, int y) {
		
		z= x*y;
		System.out.println("multiplication is"+z);
		
		public static void main(String []args){
			
			InheritanceD ref =new InheritanceD();
			
			ref.multiplication(10, 20);
			ref.add(10, 20);
			
			
			
		}
	}

}
