package com.nopecommerce.JsonUtility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FetchingTheDatafromJsonFile {
	
	
	public String FetchTheDataFromJsonFile(String key) throws FileNotFoundException, IOException, ParseException {
	 JSONParser parse= new JSONParser();
	 Object obj=parse.parse(new FileReader("C:\\Users\\bhara\\selenium\\NopeCommerce\\Files\\CommonData.json"));
	  JSONObject jobj= (JSONObject)obj;
	  return (String) jobj.get(key);
	}

}
