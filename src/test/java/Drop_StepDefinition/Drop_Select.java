package Drop_StepDefinition;

import Drop_PageAction.Drop_HomePageAction;
import Drop_PageAction.Drop_SearchPageAction;
import Drop_Utility.Drop_Base;
import Drop_Utility.Drop_Utiliti;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Drop_Select extends Drop_Base{
	Drop_HomePageAction drop_HomePageAction = new Drop_HomePageAction();
	Drop_SearchPageAction drop_SearchPageAction = new Drop_SearchPageAction();
	
	@Given("^Open <\"([^\"]*)\"> dr$")
	public void open_dr(String URL) throws Throwable {
		DrLaunchURL(URL);
	}

	@Then("^select item from dropdown click specific item$")
	public void select_item_from_dropdown_click_specific_item() throws Throwable {
		drop_HomePageAction.selectitemfromdropdown();  
		Drop_Utiliti.takeMyScreenshot(driver, "select item");
	}



	@Then("^Verify user can select particular item$")
	public void verify_user_can_select_particular_item() throws Throwable {
		//drop_SearchPageAction.Verifyusercanselectparticularitem();  
	}


	
	
	
}
