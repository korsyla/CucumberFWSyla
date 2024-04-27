package com.neotech.seleniumsteps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.testbase.BaseClass;

public class HandlingTimedAlerts extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		// https://neotech.vercel.app/alerts
		
		setUp();
		
		//Locating the ALERT  POP UP
		WebElement showAlertButton = driver.findElement(By.xpath("//button[@id='btnAlert']"));
		showAlertButton.click();
		Thread.sleep(2000);
		
		//Handling the ALERT/POP-UP now ....
		Alert alert = driver.switchTo().alert();
		alert.getText(); // Gets us the text of the POP UP Alert
		alert.accept();  //We Accept the Alert
		
		//Locating the Delayed ALERT  POP UP
		WebElement delayedAlertButton = driver.findElement(By.xpath("//button[@id='btnDelayedAlert']"));
		delayedAlertButton.click(); 
		
		
		
		//We want to wait for the Alert to be present since its a delayed Alert
		//This a wait for MAX of 30 sec, however if finds the Alert it will execute without waiting any longer
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		
		//Handling the Delayed ALERT/POP-UP now ....
		Alert delayAlert = driver.switchTo().alert();
		delayAlert.accept();
		
		
		
		Thread.sleep(2000);
		tearDown();
		
		
		
		
		
		
	}
	

}
