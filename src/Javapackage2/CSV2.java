package Javapackage2;

import java.io.FileWriter;
import java.io.IOException;

public class CSV2 {
	public static void main(String[]args) throws Exception {
		String abc=System.getProperty("user.dir")+"\\CSVdata\\viju.csv";
		FileWriter fs=new FileWriter(abc);
		fs.append("srno,name,marks\n");
		fs.append("1,sharad,67\n");
		fs.append("2,madan,78\n");
		fs.append("3,dipak,56\n");
		fs.append("4,dinesh,89\n");
		fs.close();
		System.out.println("CSV file created");
	}

}
