package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	
	CarsGuideHomePageLocators carsGuideHomePageLocators=null;
	
	public CarsGuideHomePageActions(){
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(),carsGuideHomePageLocators );
	}
	
	public void moveTobuysell() {
		
		Actions action= new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buysell).perform();
		
	}
	public void moveToSearchCarMenu() {
		//moveTobuysell should be called first
		carsGuideHomePageLocators.SearchCars.click();
		
	}
	public void moveToUsedMenu() {
		
		//moveTobuysell should be called first
		carsGuideHomePageLocators.usedCars.click();
		
	}
	public void moveToReviews() {
		Actions act= new Actions(SeleniumDriver.getDriver());
		act.moveToElement(carsGuideHomePageLocators.reviews).perform();
		
	}

}
