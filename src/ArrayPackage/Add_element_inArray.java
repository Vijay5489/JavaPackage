package ArrayPackage;

public class Add_element_inArray {

	public static void main(String[]args) {
		
		int [] numbers=new int[5];  //in this we created an array
		
		numbers[0]=3;          //in this we initialies element in array
		numbers[1]=7;
		numbers[2]=6;
		numbers[4]=8;
		numbers[3]=3;
		for(int i=0;i<=numbers.length;i++) {
		System.out.println(numbers[i]);
	}
	}
}
