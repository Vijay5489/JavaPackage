package javapackage;

import java.io.FileWriter;
import java.io.IOException;


public class CSV_writtten {
	public static void main(String[]args) throws Exception   {
		
		String filecsv=System.getProperty("user.dir")+"\\CSVdata\\example2.csv";
		FileWriter file=new FileWriter(filecsv);
		
		file.append("id,name,depatment\n");
		file.append("1,vijay,QA\n");
		file.append("2,sujit,Production\n");
		file.append("3,madan,QC\n");
		
		file.close();
		
		System.out.println("This csv file created at ="+filecsv);
	}

}
