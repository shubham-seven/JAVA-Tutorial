package Exceptionhandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Readingproperties {

	

	

	public static void main(String[] args) throws IOException {
		String path = "C://Users//shubh//eclipse-workspace//JAVA Tutorial//src//Exceptionhandling\\test.properties";
     Properties prop = new Properties();
    
		FileInputStream fs = new FileInputStream(path);
	
  
	prop.load(fs);
  
	System.out.println(prop.getProperty("fname"));
	System.out.println(prop.getProperty("lname"));
	System.out.println(prop.getProperty("age"));
	}

}
