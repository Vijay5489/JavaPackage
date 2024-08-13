package javapackage;

import java.io.FileWriter;
import java.io.IOException;

public class CSV_ {

	public static void main(String[]args) throws Exception {
		
		String csvfile=System.getProperty("user.dir")+"\\CSVdata\\csvdata.csv";
		FileWriter write=new FileWriter(csvfile);
		write.append("Sr_no,Name,Marks\n");
		write.append("1,madan,45\n");
		write.append("2,dipak,67\n");
		write.append("3,sharad,78\n");
		
		write.close();
		System.out.println("CSV ceated ");
		
	}
}
