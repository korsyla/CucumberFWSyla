package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DataTableWNoHeader extends CommonMethods {
	
	@Then("I want to validate the item in the menu")
	public void i_want_to_validate_the_item_in_the_menu(DataTable dataTable) 
	{
		//When we have DataTable with NO Header, We should look to use just List *******
		
		List<String> expectedList = dataTable.asList();
		
		List<String> actualList = new ArrayList<>();
		
		//Click on the more menu button to collect it, as it open when first loging in
		click(dashboard.moreButton); wait(1);
		
		for(WebElement el : dashboard.menuList) 
		{
			actualList.add(el.getText());
		}
		
		System.out.println("Actual list is -> " + actualList);
		
		
		Assert.assertEquals("The expected and actual menu list  do NOT match ", expectedList, actualList);
		
		
	}

}
