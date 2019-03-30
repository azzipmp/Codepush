package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/cucumberTest/Login_Test.feature","src/cucumberTest/Login_Test2.feature"}
				,monochrome = true
				,format = {"pretty"})
public class testRunnetr {

}

//Mar 5th,2016
// Run multiple feature files and also multiple steps.java

//can't have and run multiple Given when then in one feature file, thats why split to 2 feature files and also 2 test sttes files