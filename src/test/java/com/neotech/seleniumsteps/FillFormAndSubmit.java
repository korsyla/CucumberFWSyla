package com.neotech.seleniumsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class FillFormAndSubmit extends CommonMethods {
	
	@When("I fill the form than i click Submit")
	public void i_fill_the_form_than_i_click_submit() throws InterruptedException 
	{
		// Go to https://demoqa.com/text-box
		// Fill the form and submit
		// Use xPath or CSS Selector
		
		WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Donald");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("donald@gmail.com");
		Thread.sleep(1000);
		
		WebElement currentAddressBox = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentAddressBox.sendKeys("New York NY");
		Thread.sleep(1000);
		
		WebElement permanantAddrssBox = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanantAddrssBox.sendKeys("New York Golf Course");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
