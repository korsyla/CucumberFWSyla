package com.neotech.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

public class ExcelUtility {
	
	//Creating the private variables
	private static Workbook book;
	private static Sheet sheet;  
	
	//We Opening the excel file / I give the filePath of the Excel sheet I want to open
	private static void openExcel(String excelFilePathh) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream(excelFilePathh);
			book = new XSSFWorkbook(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	//We loading the sheet from excel file we opened / I give the sheet name that Im going to open inside from the ExcelSheet
	private static void loadSheet(String sheeetName) 
	{
		sheet = book.getSheet(sheeetName);
	}
	
	//Here we return the number of rows of the sheet we're in
	private static int rowCount() 
	{
		return sheet.getPhysicalNumberOfRows();
	}
	
	//Here we return the column count of a certain row I give
	private static int columnCount(int rowIndex) 
	{
		return sheet.getRow(rowIndex).getLastCellNum();
	}
	
	//Here, we return a specific CellData in the excel sheet/ I give rowindex and column index of the sheet / It returns it as a STRING
	private static String cellData(int rowIndex, int columnIndex) 
	{
		return sheet.getRow(rowIndex).getCell(columnIndex).toString();
	}
	
	
	//Return excel sheet data into a 2-Dimensional - Object[][] Array
	//This is the Actual Method we will call
	public static Object[][]excelIntoArray(String excelFilePath, String sheetName) 
	{
		openExcel(excelFilePath);
		loadSheet(sheetName);
		int rowNumber = rowCount();
		int columnNumber = columnCount(0);
		Object[][] data = new Object[rowNumber-1][columnNumber];
		// Here we are inside a ROW starting with index 1/row1
		for(int row = 1; row<rowNumber; row++) 
		{
			//Here we are looping throw the columns for a certain row until they're finished
			for(int col = 0; col<columnNumber; col++) 
			{
				data[row-1][col] = cellData(row, col);
			}
		}
		
		//Return the 2D Array Object
		return data;
	}
	
	
	//This method converts our Excel Sheet into a List of Maps Object
	public static List<Map<String , String>> excelIntoListofMaps(String excelFilePath, String sheetName){
		openExcel(excelFilePath);
		loadSheet(sheetName);
		
		List<Map<String , String>> list = new ArrayList<>();
		
		for(int row = 1; row<rowCount(); row++) 
		{
			Map<String, String> rowMap = new LinkedHashMap<>();
			//Here we are looping throw the columns for a certain row until they're finished: Fill the map 
			for(int col = 0; col<columnCount(row); col++) 
			{
				String key = cellData(0, col);
				String value = cellData(row, col);
				rowMap.put(key, value);
			}
			
			//Add the Map to the List
			list.add(rowMap);
		}
		
		return list;

	}
	

}
