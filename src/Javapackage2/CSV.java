package Javapackage2;

import java.io.FileWriter;
import java.io.IOException;

public class CSV {
	public static void main(String[]args) throws Exception {
		
		String ref=System.getProperty("user.dir")+"\\CSVdata\\csvdata2.csv";
		FileWriter csv=new FileWriter(ref);
		csv.append("sr_no,name,address");
		csv.append("1,madan,pune");
		csv.append("2,dinesh,sangli");
		csv.append("3,mahesh,satara");
		csv.append("4,mahima,kolhapur");
		csv.close();
		System.out.println("CSV file created");
	}
	

}
