package Javapackage2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVreader {

	public static void main(String[]args) throws Exception {
		File fs=new File(System.getProperty("user.dir")+"\\CSVdata\\viju.csv");
		Scanner sc=new Scanner(fs);
		sc.useDelimiter(" ,");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
}
