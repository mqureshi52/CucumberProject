package com.syntax.cumcumberproject.test.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features\\Login.feature"
		,glue="src\\test\\java\\com\\syntax\\cucumberproject\\test\\stepDefinitions\\LoginSteps.java")


public class LoginRunner {

}
