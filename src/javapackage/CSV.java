package javapackage;

import java.io.FileWriter;
import java.io.IOException;

public class CSV {

	public static void main(String[]args) throws Exception {
		String csvfile=System.getProperty("user.dir")+"\\CSVdata\\data.csv";
		FileWriter writer=new FileWriter(csvfile);
		writer.append("sr_no,name,Qualification\n");
		writer.append("1,Vinu sharma,MA\n");
		writer.append("2,dipak mali,MCA\n");
		writer.append("3,madan,MA\n");
		writer.append("4,vishu,MTech\n");

		writer.close();
		System.out.println("This csv file ceated at ="+csvfile);
	}
}
