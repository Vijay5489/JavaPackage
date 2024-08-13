package javapackage;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWritten {
	public static void main(String[]args) throws Exception {
		
		//to get current location of project we use getProperty method
		String csvfile=System.getProperty("user.dir")+"\\CSVdata\\example.csv";
		//FileWriter class is used
		FileWriter writer=new FileWriter(csvfile);
		
		//add data using append method
		writer.append("Name,Age,Email\n"); 
		writer.append("ajay,20,ajay@12\n");
		writer.append("vijay,45,vijay@23\n");
		writer.append("sumit,67,sumit@2123\n");
		writer.append("manish,56,mani@345\n");
		
		//clase this file writer
		writer.close();
		
		System.out.println("CSV file created at ="+csvfile);
	}

}
