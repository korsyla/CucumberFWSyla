package com.neotech.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class FileUploadd extends CommonMethods {
	
	@When("I upload a filee")
	public void i_upload_a_filee() 
	{
//		click(driver.findElement(By.linkText("File Upload"))); //Here 
		WebElement fileUploadButton = driver.findElement(By.linkText("File Upload"));
		click(fileUploadButton);
		
		//Lets locate the path of the screenshot or file we want to upload from our PC
		//System.getProperty("user.dir") -> Gets us the path up to our project, C:\Users\sylak\eclipse-workspace\SeleniumSyla
		///screenshots/Lesson13/screenshotHW201.png" -> this is our other part location of the file
		String filePath = System.getProperty("user.dir") + "/screenshots/FileUpload.png";
		
		WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
		
		//Lets send the location of my path(filePath) to WebElement element Chose File
		//We are locating the WebElement element Chose File, and sending the filePath that we want to WebElement Chose File
		sendText(chooseFileButton, filePath);
		
		wait(4);
		
		click(driver.findElement(By.id("file-submit")));
	}
	
	

}
