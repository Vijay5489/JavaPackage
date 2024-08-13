package Javapackage2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {

	public static void main(String[]args) throws Exception {
		File ref=new File(System.getProperty("user.dir")+"\\CSVdata\\index.csv");
		Scanner sc=new Scanner(ref);
		sc.useDelimiter(" ");
		while(sc.hasNext()) {
			System.out.print(sc.next());
		}
	}
}
