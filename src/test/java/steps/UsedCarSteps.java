package steps;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.UsedCarSearchPageAction;

public class UsedCarSteps {
	
	UsedCarSearchPageAction usedCarSearchPageAction=new UsedCarSearchPageAction();
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();

	@And("^click on \"([^\"]*)\" link on Used search car page$")
	public void click_on_link_on_Used_search_car_page(String arg1) throws Throwable {
		carsGuideHomePageActions.moveToUsedMenu();
	}

	@And("^select carbrand as \"([^\"]*)\" from Anymake dropdown on Used search car page$")
	public void select_carbrand_as_from_Anymake_dropdown_on_Used_search_car_page(String carBrand) throws Throwable {
		usedCarSearchPageAction.selectCarMake(carBrand);
	}

	@And("^select carmodel as on Used search car page$")
	public void select_carmodel_as_on_Used_search_car_page(List<String> list) throws Throwable {
		String model=list.get(1);
		System.out.println("Menu selected is :" +model);
		usedCarSearchPageAction.selectAnyModel(model);
	    
	}

	@And("^select location as \"([^\"]*)\" from select location dropdown on Used search car page$")
	public void select_location_as_from_select_location_dropdown_on_Used_search_car_page(String location) throws Throwable {
		usedCarSearchPageAction.selectAnyLocation(location);
	    
	}

	@And("^select price as \"([^\"]*)\" from price dropdown on Used search car page$")
	public void select_price_as_from_price_dropdown_on_Used_search_car_page(String price) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		usedCarSearchPageAction.selectPrice(price);
	   
	}

	@And("^click on Find my next car button on Used search car page$")
	public void click_on_Find_my_next_car_button_on_Used_search_car_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		usedCarSearchPageAction.clickOnFindMyNextCarButton();
	}

	@Then("^I should see the list of searched cars on Used search car page$")
	public void i_should_see_the_list_of_searched_cars_on_Used_search_car_page() throws Throwable {
	
	}


}
