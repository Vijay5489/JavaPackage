package javapackage;

import java.io.FileWriter;
import java.io.IOException;

public class PractisCSV {

	public static void main(String[]args) throws Exception {
		String file=System.getProperty("user.dir")+"\\CSVdata\\index2.csv";
		FileWriter write=new FileWriter(file);
		write.append("sr,name,address,mob\n");
		write.append("1,madan,pune,12334\n");
		write.append("2,dipak,sangli,34567\n");
		write.append("3,mahesh,satara,56787\n");
		write.append("4,vishal,kapuskhed,78567\n");
		write.append("5,ram,mumbai,43345\n");
		
		write.close();
		System.out.println(" new CSV file created");
	}
}
