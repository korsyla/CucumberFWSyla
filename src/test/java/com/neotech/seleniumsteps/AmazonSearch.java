package com.neotech.seleniumsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.neotech.utilities.CommonMethods;

import io.cucumber.java.en.When;

public class AmazonSearch extends CommonMethods {
	
	@When("I search in the amazon website")
	public void i_search_in_the_amazon_website() throws InterruptedException 
	{
	    WebDriver driver = new ChromeDriver();
	    
	    String url = "https://www.amazon.com/";
	    driver.get(url);
	    
	   WebElement amazonSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	   amazonSearchBox.sendKeys("Messi Jersey");
	   Thread.sleep(1000);
	   
	  WebElement searchBox = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	  searchBox.click();
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
	}

}
