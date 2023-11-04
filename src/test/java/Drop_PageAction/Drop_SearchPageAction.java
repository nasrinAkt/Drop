package Drop_PageAction;

import org.testng.Assert;

import Drop_PageLocator.Drop_SearchPageLocator;
import Drop_Utility.Drop_Base;

public class Drop_SearchPageAction extends Drop_Base {

	Drop_SearchPageLocator drop_SearchPageLocator = new Drop_SearchPageLocator();
	
	public void Verifyusercanselectparticularitem() throws Exception {
	/*Thread.sleep(3000);	
	boolean veri = drop_SearchPageLocator.verify.isDisplayed();
		Assert.assertTrue(veri);*/
	}
	public void clickonspecificitem() {
		drop_SearchPageLocator.clbt.click();
		drop_SearchPageLocator.clsitem.click();
		
	}
	
	
}
