package steps;

import java.util.List;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarSearchPageAction;
import pages.actions.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class Steps {
	CarSearchPageAction carSearchPageAction = new CarSearchPageAction();
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	
	@Given("^I am on the home page \"([^\"]*)\" of cars$")
	public void i_am_on_the_home_page_of_cars(String websiteURL) throws Throwable {
		SeleniumDriver.openPage(websiteURL);
		
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
		String menu=list.get(1);
		System.out.println("Menu selected is :" +menu);
		carsGuideHomePageActions.moveTobuysell();
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
		carsGuideHomePageActions.moveToSearchCarMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from Anymake dropdown$")
	public void select_carbrand_as_from_Anymake_dropdown(String brand) throws Throwable {
		carSearchPageAction.selectCarMake(brand);
	}

	@And("^select carmodel as \"([^\"]*)\" from select model dropdown$")
	public void select_carmodel_as_from_select_model_dropdown(String model) throws Throwable {
		carSearchPageAction.selectAnyModel(model);
	}

	@And("^select location as \"([^\"]*)\" from select location dropdown$")
	public void select_location_as_from_select_location_dropdown(String location) throws Throwable {
		carSearchPageAction.selectAnyLocation(location);
	}

	@And("^select price as \"([^\"]*)\" from price dropdown$")
	public void select_price_as_from_price_dropdown(String price) throws Throwable {
		carSearchPageAction.selectPrice(price);
	}

	@And("^click on Find my next car button$")
	public void click_on_Find_my_next_car_button() throws Throwable {
		carSearchPageAction.clickOnFindMyNextCarButton();
	}

	@Then("^I should see the list of searched cars$")
	public void i_should_see_the_list_of_searched_cars() throws Throwable {
		System.out.println("Cat list found");
	}

	@And("^page title should be \"([^\"]*)\"$")
	public void page_title_should_be(String expectedTitle) throws Throwable {
		String actualtitle=SeleniumDriver.getDriver().getTitle();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle,expectedTitle);
	}

}
