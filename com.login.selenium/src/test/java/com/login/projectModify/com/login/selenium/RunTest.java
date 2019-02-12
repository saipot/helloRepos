package com.login.projectModify.com.login.selenium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",glue = {"StepDefinition"}) 
		
public class RunTest {
	
}

