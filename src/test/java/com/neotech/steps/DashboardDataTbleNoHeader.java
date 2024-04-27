package com.neotech.steps;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DashboardDataTbleNoHeader extends CommonMethods {
	
	@Given("I the user is logged in with credentials")
	public void i_the_user_is_logged_in_with_credentials() 
	{
	    sendText(login.username, "Admin"); wait(1);
	    sendText(login.password, "Neotech@123"); wait(1);
	    click(login.loginButton);
	}
	
	@Then("I wan to validate the items in the menu")
	public void i_wan_to_validate_the_items_in_the_menu(DataTable dataTable) 
	{
	    //When we have DataTable with NO Header, We should look to use just List *******
		
		List<String> expextedList = dataTable.asList();
		
		List<String> actualList = new LinkedList<>();
		
		////We have to Click on the more menu button to collect it, as it open when first loging in
		click(dashboard.moreButton); wait(1);
		
//		for(WebElement el : dashboard.menuList) 
//		{
//			
//		}
		
		//OR
		
		List<WebElement> menuList = dashboard.menuList;
		
		for(WebElement element : menuList ) 
		{
			actualList.add(element.getText());
		}
		
		System.out.println("Actual list is -> " + actualList);
		
		Assert.assertEquals("The expected and actual list do NOT match ", expextedList, actualList);
		
		
		
	}

}
