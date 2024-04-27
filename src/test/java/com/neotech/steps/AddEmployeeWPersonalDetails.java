package com.neotech.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.Then;

public class AddEmployeeWPersonalDetails extends CommonMethods {
	
	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void modify_details(String driverLicense, String expirationDate, String smoker, 
			String gender, String nationality) 
	{
	    waitForVisability(personalDetails.personalDetailsForm);
	    
	    sendText(personalDetails.driverLicense, driverLicense); wait(1);
	    
	    
	    if(smoker.equals("Yes")) 
	    {
	    	click(personalDetails.smokerCheckBox);
	    }
	    wait(1);
	    	    
	    
	    click(personalDetails.genderInput); wait(1);
	    List<WebElement> genderOptions = personalDetails.genderOptions;
	    
	    //This can be used as a common method -> instead of the method for loop below code 
	    clickOnDropDownElement(genderOptions, gender);
	    
//	    for(WebElement genderOption : genderOptions) 
//	    {
//	    	if(genderOption.getText().equals(gender)) 
//	    	{
//	    		click(genderOption);
//	    		break;
//	    	}
//	    }
	    
	    
	    
	    wait(2);
	    
	    click(personalDetails.nationalityInput);wait(1);
	    List<WebElement> nationalityOptions = personalDetails.nationalityOptions;
	    
	  //This can be used as a common method instead of the method for loop below code
	    //we can use this if there is a select dropdown with no Select class 
		//We can use it when We use Scenario outline and Examples keyword
	    clickOnDropDownElement(nationalityOptions, nationality);
	    
	    
//	    for(WebElement nationalityOption : nationalityOptions) 
//	    {
//	    	if(nationalityOption.getText().equals(nationality)) 
//	    	{
//	    		click(nationalityOption);
//	    		break;
//	    	}
//	    }
	    
	    wait(2);
	    
	    //This clicks on the Calendar
	    click(personalDetails.licenseExpDateCalendar); wait(1);
	    
	    
	  //Date param: 2023-08-10
	    //Select the year
	    String[] dateParts = expirationDate.split("-"); 
	    String year = dateParts[0];
	    click(personalDetails.licsExpYearInput);
	    clickOnDropDownElement(personalDetails.licsExpYearsOptions, year);
	    wait(1);
	    
	    //Select Month
	    int monnth = Integer.parseInt(dateParts[1]); //This returns as Integer
	    click(personalDetails.licsExpMonthInput);
	    click(personalDetails.licsExpMonthsOptions.get(monnth-1)); // this is month which is 5-1 we get May 
	    wait(1);
	    
	    //Select the Day 
	    int day = Integer.parseInt(dateParts[2]);
	    selectCalendarDate(personalDetails.licsExpDaysOptions, day + ""); // day becomes a string
	    wait(2);
	    
	    
	   
	}
	
	
	@Then("i click on Personal Details Save")
	public void i_click_on_personal_details_save() 
	{
	    jsClick(personalDetails.personalDetailsSaveButton);
	    wait(1);
	}

}
