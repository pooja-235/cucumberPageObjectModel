package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageAction {

	CarSearchPageLocators carSearchPageLocators = null;

	public CarSearchPageAction() {

		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);

	}

	public void selectCarMake(String carBrand) {
		Select selectcarmake = new Select(carSearchPageLocators.carMakeDropdown);
		selectcarmake.selectByValue(carBrand);
	}

	public void selectAnyModel(String carModel) {
		Select selectanymodel = new Select(carSearchPageLocators.selectModelDropDown);
		selectanymodel.selectByValue(carModel);

	}
	public void selectAnyLocation(String location) {
		Select selectanylocation = new Select(carSearchPageLocators.SelectLocationDropDown);
		selectanylocation.selectByValue(location);

	}
	public void selectPrice(String carPrice) {
		Select selectprice = new Select(carSearchPageLocators.selectPriceDropDown);
		selectprice.selectByIndex(1);
	}
	
	public void clickOnFindMyNextCarButton() {
		carSearchPageLocators.FindMyNextCar.click();
	} 

}
