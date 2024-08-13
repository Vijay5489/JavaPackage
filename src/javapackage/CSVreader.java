package javapackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSVreader {
	public static void main(String[]args) throws IOException {
		String fileread=System.getProperty("user.dir")+"\\CSVdata\\data.csv";
		FileReader writer=new FileReader(fileread);
		
		BufferedReader read=new BufferedReader(writer);
		String line;
		while((line=read.readLine())!=null){
			String [] data=line.split(",");
			//for(String value:data){
				System.out.println(data+"\t");
			//}
			
		}
	}

}
