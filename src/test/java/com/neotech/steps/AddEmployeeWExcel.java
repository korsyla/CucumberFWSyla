package com.neotech.steps;

import java.util.List;
import java.util.Map;

import com.neotech.utilities.CommonMethods;
import com.neotech.utilities.ExcelUtility;

import io.cucumber.java.en.When;

public class AddEmployeeWExcel extends CommonMethods {
	
	@When("user enters employee data from {string} excel sheet then save")
	public void user_enters_employee_data_from_excel_sheet_then_save(String excelSheetName) 
	{
		//We have to locate our Excel first
	    String path = System.getProperty("user.dir") + "/src/test/resources/testdata/Excel.xlsx";
	    
	    List<Map<String, String>> excelList = ExcelUtility.excelIntoListofMaps(path, excelSheetName);
	    
	    //Finish this 
	}

}
