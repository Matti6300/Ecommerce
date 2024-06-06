package com.nopecommerce.FileUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	
	public String getTheDataFromPropertyFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\bhara\\selenium\\NopeCommerce\\Files\\commonData.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}
	public void putTheDataIntoPropertFile(String key, String Value) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\bhara\\selenium\\NopeCommerce\\Files\\commonData.properties");
	    Properties pobj= new Properties();
	    pobj.load(fis);
	    pobj.put(key, Value);
	    FileOutputStream fos= new FileOutputStream("C:\\Users\\bhara\\selenium\\NopeCommerce\\Files\\commonData.properties");
         pobj.store(fos, "Added successfully");	
	
	
	}
	

}
