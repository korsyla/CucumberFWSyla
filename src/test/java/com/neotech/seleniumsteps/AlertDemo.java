package com.neotech.seleniumsteps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class AlertDemo extends CommonMethods {
	
	@When("I handle a Alert Pop Up")
	public void i_handle_a_alert_pop_up() throws InterruptedException 
	{
		//https://vinothqaacademy.com/alertandpopup/
		
		WebDriver driver = new ChromeDriver();
		String url = "https://vinothqaacademy.com/alertandpopup/";
		driver.get(url);
		Thread.sleep(1000);
		
		//When Alert is open, We cannot interact with the main page, So we have to handle the ALERT 1st
		WebElement confirmAlertButton = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		confirmAlertButton.click();
		Thread.sleep(1000);
		
		//Now that ALERT/Pop-UP is OPEN, lets handle the ALERT/Pop-UP
		 Alert alert = driver.switchTo().alert();
		 System.out.println("Alert text is -> " + alert.getText()); // get Text of the ALERT/PopUp
		 
//		 alert.dismiss(); // dissmisin the alert
		 alert.accept();  //Accepting the alert / clicking OK
		 
		 Thread.sleep(2000);
		 
		 //Now, Another Alert/POP-UP is open, so we need to switch to it again
		 WebElement promptAlertButton = driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		 promptAlertButton.click();
		 Thread.sleep(1000);
		 
		 //So now we switching to the other 2nd ALERT
		 Alert promptAlert = driver.switchTo().alert();
		 Thread.sleep(2000);
		 
		 promptAlert.sendKeys("Yes");
		 promptAlert.accept();
		 
		 Thread.sleep(3000);
		 
		 
		 
		 
		 driver.quit();
		 
		
		
	}

}
