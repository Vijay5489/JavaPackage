package Javapackage2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyfile {

	public static void main(String[]args) throws Exception {
		Properties pro=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\VIJAY\\eclipse-workspace\\Selenium_Training2023\\"
				+ "src\\Data\\Data1.properties");
		pro.load(fs);
		
		System.out.println(pro.getProperty("name"));
	}
}
