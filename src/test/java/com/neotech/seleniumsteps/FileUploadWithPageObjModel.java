package com.neotech.seleniumsteps;

import org.junit.Assert;

import com.neotech.pages.FileUploadElements;
import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class FileUploadWithPageObjModel extends CommonMethods {
	
	@When("I upload a file using page Object Model")
	public void i_upload_a_file_using_page_object_model() 
	{
//		https://neotech.vercel.app/fileUpload
		
		FileUploadElements fileUpload = new FileUploadElements();
		
		String filePath = System.getProperty("user.dir") + "/screenshotsFile/Form.png";
		
		fileUpload.filePathInput.sendKeys(filePath); // OR the sendText() common method
//		sendText(fileUpload.filePathInput, filePath);
		wait(2);
		
		fileUpload.uploadButton.click();  // OR the click() common method
//		click(fileUpload.uploadButton);
		wait(1);
		
		String expectedMessage = "File uploaded successfully!";
		
		waitForVisability(fileUpload.fileUploadSuccssfullyElement);
		
		String actualMessage = fileUpload.fileUploadSuccssfullyElement.getText();
		
		Assert.assertEquals("Expected and Actual Messages do NOT match!", expectedMessage, actualMessage);
		
		
		
	    
	}
	
	

}
