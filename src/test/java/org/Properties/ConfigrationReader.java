package org.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigrationReader {
	public static Properties p;
	
	public ConfigrationReader() throws IOException {
		File f = new File("C:\\Users\\husse\\eclipse-workspace\\FlipkartCucumber\\src\\test\\java\\Properties\\flipkart.Properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
String browser = p.getProperty("browser");
return browser;
	}
	
	public String getUrl() {
String URL = p.getProperty("url");
return URL;
	}
	
	public String getEmail() {
String Email = p.getProperty("email");
return Email;
	}

}
