package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	private static SeleniumDriver seleniumDriver;
	
	public static WebDriver driver;
	public WebDriverWait waitDriver;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIME=30;
	
	private SeleniumDriver() {
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
		 * "src\\test\\resources\\exectubles\\chromedriver.exe"); driver = new
		 * ChromeDriver();
		 */
		
		 WebDriverManager.chromedriver().setup(); 
		  driver = new ChromeDriver();
		 
		//WebDriverManager.firefoxdriver().setup(); 
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIME,TimeUnit.SECONDS);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void openPage(String url) {
		driver.get(url);
		
	}
	
	public static void setUpDriver() {
		if (seleniumDriver==null)
			seleniumDriver =new SeleniumDriver();
	}
	
	public static void tearDown() {
		if(driver!=null)
			driver.close();
		seleniumDriver=null;
	}

	
}
