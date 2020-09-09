package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSearchPageLocator;
import utils.SeleniumDriver;

public class UsedCarSearchPageAction {
	UsedCarSearchPageLocator usedCarSearchPageLocator =null;
	
	public UsedCarSearchPageAction() {
		this.usedCarSearchPageLocator = new UsedCarSearchPageLocator();
		PageFactory.initElements(SeleniumDriver.getDriver(),usedCarSearchPageLocator );
		
	}
	
	public void selectCarMake(String carBrand) {
		Select selectcarmake = new Select(usedCarSearchPageLocator.carMakeDropdown);
		selectcarmake.selectByValue(carBrand);
	}

	public void selectAnyModel(String carModel) {
		Select selectanymodel = new Select(usedCarSearchPageLocator.selectModelDropDown);
		selectanymodel.selectByValue(carModel);

	}
	public void selectAnyLocation(String location) {
		Select selectanylocation = new Select(usedCarSearchPageLocator.SelectLocationDropDown);
		selectanylocation.selectByValue(location);

	}
	public void selectPrice(String carPrice) {
		Select selectprice = new Select(usedCarSearchPageLocator.selectPriceDropDown);
		selectprice.selectByIndex(1);
	}
	
	public void clickOnFindMyNextCarButton() {
		usedCarSearchPageLocator.FindMyNextCar.click();
	} 
}
