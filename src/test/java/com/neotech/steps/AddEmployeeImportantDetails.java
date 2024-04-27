package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeImportantDetails extends CommonMethods {
	
	@When("I select Blood Group {string}")
	public void i_select_blood_group(String bloodGroup) 
	{
	    waitForVisability(personalDetails.BloodGroupSelectButton); 
	    click(personalDetails.BloodGroupSelectButton);
	    
	   List<WebElement> bloodGroupOptions = personalDetails.BloodGroupSelectOptions;
	   
	   for(WebElement bloodGroupOption : bloodGroupOptions ) 
	   {
		   if(bloodGroupOption.getText().equals(bloodGroup)) 
		   {
			   click(bloodGroupOption);
			   break;
		   }
	   }
	}
	
	@When("I select Shirt Size {string}")
	public void i_select_shirt_size(String shirtSize) 
	{
	    wait(1);
	    click(personalDetails.shirtSizeSelectButton); wait(1);
	    
	   List<WebElement> shirtSizeOptions = personalDetails.shirtSizeSelectOptions;
	   
	   for(WebElement shirtSizeOption : shirtSizeOptions) 
	   {
		   if(shirtSizeOption.getText().equals(shirtSize)) 
		   {
			   click(shirtSizeOption);
			   break;
		   }
	   }
	    
	}
	
	@When("I enter Hobbies {string}")
	public void i_enter_hobbies(String hobbies) 
	{
	    sendText(personalDetails.hobbiesTextbox, hobbies);
	}
	
	@Then("I click Save and validate infirmation is saved successfully")
	public void i_click_save_and_validate_infirmation_is_saved_successfully() 
	{
	    click(personalDetails.importantSaveButton);
	    waitForVisability(personalDetails.successfullyUpdatedMessage);
	    
	    String expectedMessage = "Successfully Updated";
	    String actualMessage = personalDetails.successfullyUpdatedMessage.getText();
	    
	    Assert.assertEquals("Expected and Actual messages do NOT match!", expectedMessage, actualMessage);
	}
	
	
	// ------- @AddEmployeePreferences -> Here are the steps for @AddEmployeePreferences ---------
	
	
	@When("I select my Preferences details and clicks on save and validates it is added")
	public void i_select_my_preferences_details (DataTable dataTable) 
	{
//		This is better using asMaps() ->  {Food=Veg, AestheticActivites=Music, Sports=Squash},
//		asMaps() -> returns a List of Maps for every data row reading as Key-Value (NOT Including the Header)
		System.out.println(dataTable.asMaps());
		
	//When we have DataTable with Header, We should look to use List OF Map since it reads key-value format *******
		List<Map<String, String>> preferencesOptionsList = dataTable.asMaps();
		
		for(Map<String, String> preferencesOptions : preferencesOptionsList) 
		{
			System.out.println(preferencesOptions);
			
			String food = preferencesOptions.get("Food");
			String aestheticSport = preferencesOptions.get("AestheticActivites");
			String sport = preferencesOptions.get("Sports");
			
			List<WebElement> foodOptions = personalDetails.foodOptios;
			
			for(WebElement foodOption : foodOptions) 
			{
				if(foodOption.getText().equals(food)) 
				{
					click(foodOption);
					break;
				}
			}
			wait(1);
			
			
			List<WebElement> aestheticActivitesOptions = personalDetails.aestheticActivitesOptions;
			
			for(WebElement aestheticActivitesOption : aestheticActivitesOptions) 
			{
				if(aestheticActivitesOption.getText().equals(aestheticSport)) 
				{
					click(aestheticActivitesOption);
					break;
				}
			}
			wait(1);
			
			List<WebElement> sportsOptions = personalDetails.sportsOptions;
			
			for(WebElement sportsOption : sportsOptions) 
			{
				if(sportsOption.getText().equals(sport)) 
				{
					click(sportsOption);
					break;
				}
			}
			wait(1);
			
			jsClick(personalDetails.preferencesSaveButton);
		    waitForVisability(personalDetails.successfullyUpdatedMessage); 
		    
		    String expectedMessage = "Successfully Updated";
		    String actualMessage = personalDetails.successfullyUpdatedMessage.getText();
		    
		    Assert.assertEquals("Expected and Actual Messages do NOT match!!!", expectedMessage, actualMessage);
			
		}
		
		
		
		
	}
	

	
	
	
	

}
