package com.neotech.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	//This is the INSTANCE variable / Properties is the type and prop is the instance variable of it
	private static Properties prop;
	
	//*************  2nd STEP  *****************
	
	//Reading the Properties FILE
	//THIS IS THE SETTER METHOD
	
	/**
	 * This method will read the configuation.properties file
	 * @param filePath
	 */
	public static void readProperties(String filePath)
	{
		// FileInputStream To read the file
		FileInputStream fis;
		
		try 
		{
			fis = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fis);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	
	}

	
	/**
	 * This Method will return the value for a Specific KEY
	 * @parameters are a String key
	 * @returns a String VALUE
	 */
	
	public static String getProperty(String key) 
	{
		return prop.getProperty(key);
	}
	
}
