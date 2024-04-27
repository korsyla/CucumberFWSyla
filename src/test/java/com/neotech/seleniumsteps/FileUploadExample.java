package com.neotech.seleniumsteps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class FileUploadExample extends CommonMethods{
	
	@When("I upload a file")
	public void i_upload_a_file() 
	{
//		https://neotech.vercel.app/fileUpload
		
		// System.getProperty("user.dir") -> This gives us path up to our project, C:\Users\sylak\eclipse-workspace\CucumberFWSyla
		// /screenshotsFile/Form.png -> Gives us path to the screenshot inside our (CucumberFWSyla) project
		String screenshotFilePath = System.getProperty("user.dir") + "/screenshotsFile/Form.png";
		
		 WebElement chooseFileLocation = driver.findElement(By.id("image_file"));
		 chooseFileLocation.sendKeys(screenshotFilePath);
		 wait(2);
		
		WebElement uploadButton = driver.findElement(By.id("btnUpload"));
		uploadButton.click();
		wait(1);
		
		//Lets FIRST, wait for the visibility of the File uploaded successfully! MESSAGE

		waitForVisability(driver.findElement(By.xpath("//span[@id='upload_response']")));
		
		String expectedMessage = "File uploaded successfully!";
		
		WebElement fileUploadSuccssfullyElement = driver.findElement(By.xpath("//span[@id='upload_response']"));
		String actualMessage = fileUploadSuccssfullyElement.getText();
		System.out.println("Actual Message is -> " + actualMessage);
		
		
		Assert.assertEquals("Expected and Actual messages did NOT match!", expectedMessage, actualMessage);
		
		
		
		
		
		
	}

}
