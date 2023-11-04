package com.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features/zillowLogIn.feature"},
		glue = {"com.StepDefinition"}
		)

public class MyRunner extends AbstractTestNGCucumberTests{
}
