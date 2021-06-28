package Api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configuration {
	Properties prop ;
	public String base(String Key) throws IOException {
		
		
		File file = new File("P:\\RestapiDemo\\object.properties");
		FileInputStream ip = new FileInputStream(file);
		prop= new Properties();
		prop.load(ip);
		return prop.getProperty(Key);
		
	}
}
