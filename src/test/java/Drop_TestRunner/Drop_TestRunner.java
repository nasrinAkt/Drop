package Drop_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Drop_Utility.Drop_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Drop_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Drop_StepDefinition",tags = {"@tag"})

public class Drop_TestRunner extends AbstractTestNGCucumberTests{

	
	@BeforeTest
	public void drStartURL() {
		Drop_Base dr = new Drop_Base();
		dr.DrBrowser();
		
	}
	@AfterTest
	public void drCloseURL() {
	Drop_Base dr = new Drop_Base();	
	dr.driver.quit();	
		
	}
	
}
