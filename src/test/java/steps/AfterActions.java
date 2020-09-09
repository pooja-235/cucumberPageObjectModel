package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import utils.SeleniumDriver;

public class AfterActions {

	
	public static void tearDown(Scenario scenario) {
		
		/*WebDriver driver=SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if(scenario.isFailed()) {
		byte[]	Screenshortbyte= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(Screenshortbyte, "image/png");
		}*/
				
		SeleniumDriver.tearDown();
	}
}

