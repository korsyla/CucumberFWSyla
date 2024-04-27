package com.neotech.seleniumsteps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class WebTableExample extends CommonMethods {
	
	@When("I locate the elements in the WebTable")
	public void i_locate_the_elements_in_the_web_table() 
	{
//		https://neotech.vercel.app/tables
		
		//Finding the number of rows in the Table
	 	List<WebElement> rowsOfTable = driver.findElements(By.xpath("//table/tbody/tr"));
	 	rowsOfTable.size(); // 7
	 	
	 	//Finding the number of Columns in the 1st Row
	 	List<WebElement> columnsOfFirstRow = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	 	columnsOfFirstRow.size(); // 5
	 	
	 	//Finding all the cells in the table
	 	List<WebElement> allCellsOfTable = driver.findElements(By.xpath("//table/tbody/tr/td"));
	 	allCellsOfTable.size(); // 35 
		
	 	//If i want to print the header of the table
	 	
	 	//1st Way, Static way getting data from 1st ROW
	 	List<WebElement> firstRowList = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
	 	for(WebElement element : firstRowList) 
	 	{
	 		System.out.print(element.getText() + " | ");
	 	}
	 	System.out.println();
	 	System.err.println("---------------");
	 	
	 	
	 	//2nd Way Dynamic Way, getting data from 1st ROW
	 	
	 	for(int i = 1; i <= 5; i++)  // or i < col.size();
	 	{
	 		String path = "//table/tbody/tr[1]/td["+ i +"]";
	 		
	 		WebElement cell = driver.findElement(By.xpath(path));
	 		System.out.print(cell.getText() + " | ");
	 	}
	 	
	 	
	 	//All Dynamic Way for Rows and Columns
	 	for(int row = 1; row <= rowsOfTable.size(); row++)  // In this line WE Iterating the Rows 
	 	{
	 		for(int column = 1; column <= 5; column++) // In this line we are Iterating the Columns
	 		{
//	 			String path = "//table/tbody/tr["+ row +"]/td["+ column +"]";
//	 			System.out.println(path);
	 			
	 			WebElement cellElement = driver.findElement(By.xpath("//table/tbody/tr["+ row +"]/td["+ column +"]"));
	 			System.out.println(cellElement.getText());
	 			
	 		}
	 		System.out.println();
	 	}
	 	
	 	
	 	
		
	}
	
	


}
