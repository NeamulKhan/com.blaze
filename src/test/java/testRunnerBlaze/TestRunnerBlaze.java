package testRunnerBlaze;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.Base_Blaze;

//Cucumber options

	@CucumberOptions(features = {"src/test/resources/blazeFeatureFolder"},
			plugin = {"json:target/cucumber.json"},
			glue ="stepDefination", tags= {"@OrderConf"}//@BlazeLogin,@BlazeAboutUs,@BlazeCart,@OrderConf
		)

public class TestRunnerBlaze extends AbstractTestNGCucumberTests {
		
		@BeforeTest
		
		public void blazesetup() throws Exception {
			
			Base_Blaze test = new Base_Blaze();
			
			test.blazebrowserinit();
		}
		
		@AfterTest
		
		public void blazeClosureURL() {
		
			Base_Blaze test = new Base_Blaze();
			
			//test.driver.quit();
		}

}
