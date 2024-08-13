package javapackage;

public class Overriding2 extends Overriding1{
	
	public void abc(int a, int b) {
		
		System.out.println(a-b);
	}
		 public static void main(String [] args){
						 
			//Overriding2 ref=new Overriding2();
			//ref.abc(10, 20);
			
			Overriding1 re=new Overriding1();
			re.abc(10, 10);
		}
	}


