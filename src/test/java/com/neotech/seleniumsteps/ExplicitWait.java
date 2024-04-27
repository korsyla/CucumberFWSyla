package com.neotech.seleniumsteps;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class ExplicitWait extends CommonMethods {
	
	@When("I use Explicit Wait")
	public void i_use_explicit_way() throws InterruptedException 
	{
//		https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html
///////////////////////////////////////////////////////////////////////////////////////////////
//		//Implicit Wait -> This wait interacts with all elements we try to locate and click etccc....
//		//Implicit Wait -> is done ALWAYSS, RIGHT after Browser Opens or Driver is created
//		// Imlicit Wait is for every step of driver. (throughout your test code step) 
//		//For driver.manage() ...... driver.findElement( ....... it will wait 20 seconds for each line before throwing exception
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
///////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
///////////////////////////////////////////////////////////////////////////////////////////////
//		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		
		//Explicit Wait -> This is an expected condition more so
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		//Wa are waiting for element to be visible 1st
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()='Complete!']")));
//		
//		WebElement completeText = driver.findElement(By.xpath("//div[text()='Complete!']"));
///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		driver.findElement(By.xpath("//button[@id='downloadButton']")).click();
		
		FluentWait<WebDriver> fluenWait = new FluentWait<WebDriver>(driver);
		fluenWait.withTimeout(Duration.ofSeconds(25)); // Max wait is 1 25 seconds
		fluenWait.pollingEvery(Duration.ofSeconds(3)); // This says try every 3 seconds within the 25 seconds
		
		//I will wait for the element to be available and Clickable
		fluenWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Close']")));
		
		//Now that we know that the Close button is clickable, we can click 
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(2000);
		
		
			
	}

}
