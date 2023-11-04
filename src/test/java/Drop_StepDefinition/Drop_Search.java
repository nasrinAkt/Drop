package Drop_StepDefinition;


import Drop_PageAction.Drop_HomePageAction;
import Drop_PageAction.Drop_SearchPageAction;
import Drop_Utility.Drop_Base;
import cucumber.api.java.en.Then;

public class Drop_Search extends Drop_Base{
	Drop_HomePageAction drop_HomePageAction = new Drop_HomePageAction();
	Drop_SearchPageAction drop_SearchPageAction = new Drop_SearchPageAction();
	
	
	@Then("^type toys on search field$")
	public void type_toys_on_search_field() throws Throwable {
		drop_HomePageAction.typetoysonsearchfield(); 
	}

	@Then("^click search$")
	public void click_search() throws Throwable {
		drop_HomePageAction.clicksearch();  
	}

	@Then("^click on specific item$")
	public void click_on_specific_item() throws Throwable {
		drop_SearchPageAction.clickonspecificitem(); 
	}

	


	
	
	
}
