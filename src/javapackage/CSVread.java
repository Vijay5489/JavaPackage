package javapackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVread {

	public static void main(String[]args) throws Exception {
		File fs=new File(System.getProperty("user.dir")+"\\CSVdata\\index2.csv");
		Scanner sc=new Scanner(fs);
		sc.useDelimiter("");
		while(sc.hasNext()) {
			System.out.print(sc.next());         //  "/t" for tab
		}
		
	}
}
