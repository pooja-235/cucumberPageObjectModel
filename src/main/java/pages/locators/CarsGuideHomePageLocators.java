package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	@FindBy(how=How.LINK_TEXT,using="buy + sell")
	public WebElement buysell;

	@FindBy(how=How.LINK_TEXT,using="reviews")
	public WebElement reviews;
	
	@FindBy(how=How.LINK_TEXT,using="news")
	public WebElement news;
	
	@FindBy(how=How.LINK_TEXT,using="advice")
	public WebElement advice;
	
	@FindBy(how=How.LINK_TEXT,using="pricing+specs")
	public WebElement pricingspecs;
	
	@FindBy(how=How.LINK_TEXT,using="Search Cars")
	public WebElement SearchCars;

	@FindBy(how=How.LINK_TEXT,using="Used")
	public WebElement usedCars;
}
