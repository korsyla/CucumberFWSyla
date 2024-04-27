package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utilities.CommonMethods;

public class FileUploadElements extends CommonMethods {
	
	//Without using Page Factory way ....
//	public WebElement filepathInput = driver.findElement(By.id("image_file"));
	
	
	// Using Page Factory
	
	@FindBy(id = "image_file")
	public WebElement filePathInput;
	
	@FindBy(id = "btnUpload")
	public WebElement uploadButton;
	
	@FindBy(xpath = "//span[@id='upload_response']")
	public WebElement fileUploadSuccssfullyElement;
	
	
	
	public FileUploadElements() 
	{
		PageFactory.initElements(driver, this);
	}
	

}
