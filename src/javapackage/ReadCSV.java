package javapackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {
	public static void main(String[]args) throws Exception {
		
		File ab=new File(System.getProperty("user.dir")+"\\CSVdata\\csvdata.csv");
		Scanner sc=new Scanner(ab);
		sc.useDelimiter("");
		while(sc.hasNext()) {
			System.out.print(sc.next());
		}
		
	}

}
