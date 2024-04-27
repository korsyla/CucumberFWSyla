package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features = "src/test/resources/features/",

		glue = "com.neotech.steps",
		
		dryRun = false,

		tags = "@regression",
		
		monochrome = false, 
		

		plugin = {

				"html:target/cucumber-default-report.html", // This is a basic report created on the Target folder

				"json:target/cucumber.json", 		//Stores every step of the execution to a JSON file
				
				"rerun:target/failed.txt" //This rerun means, if any of the scenarios that I run fail, store them into
											// into the target  / failed.txt file
				
				
			}
		
		)
		


public class RegressionRunner {

}
