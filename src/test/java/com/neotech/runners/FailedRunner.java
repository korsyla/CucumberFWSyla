package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		// We can run the Failed Scenarios in this FailedRunner class / OR 
		//OR We can run it in the pom.xml and edit it to FailedRunner.java 
		
			features = "@target/failed.txt", //Here we are saying, I want to run the Failed Scenarios that are in the 
											// in the target folder / failed.txt
			
			glue = "com.neotech.steps",//The glued steps as well!
			
			
			
		plugin = {
//					
				//****WE DO NOT HAVE TO HAVE THIS PLUGIN HERE*****
//				//This part in FailedRunner can be used when we run the the failed scenarios again, we can 
//				//compare in another failed2.txt filed how many have passed
//							
							"rerun:target/failed2.txt" //This rerun means, if any of the scenarios that I run fail, store them into
//														// into the target  / failed2.txt file
							
							
						}
		)

public class FailedRunner {

}
