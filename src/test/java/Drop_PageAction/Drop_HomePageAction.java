package Drop_PageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Drop_PageLocator.Drop_HomePageLocator;
import Drop_Utility.Drop_Base;
import Drop_Utility.Drop_TestData;

public class Drop_HomePageAction extends Drop_Base{

	Drop_HomePageLocator drop_HomePageLocator = new Drop_HomePageLocator();
	
	public void selectitemfromdropdown() throws Exception {
	 /*	Select sl = new Select(drop_HomePageLocator.clAllCateg);
		sl.selectByVisibleText(Drop_TestData.visibleT);
		drop_HomePageLocator.search.click(); */
		
	/*	drop_HomePageLocator.clAllCateg.sendKeys(Drop_TestData.visibleT);
		drop_HomePageLocator.search.click();*/
		
	/* (2)	drop_HomePageLocator.drClOnItm.click();
		drop_HomePageLocator.search.click();
		Thread.sleep(3000); */
		
	/*	drop_HomePageLocator.clAllCateg.click();
  List<WebElement> allOptions = driver.findElements(By.tagName("option"));
 // System.out.println(allOptions.size());
  
  for(int i = 0; i<allOptions.size(); i++) {
	System.out.println(allOptions.get(i).getText()); 
	allOptions.get(i).click(); 
	
 if(allOptions.get(i).getText().contains(Drop_TestData.visibleT)) { 
		 allOptions.get(i).click();
		 break;
		 
	 }
	 
  }
     drop_HomePageLocator.search.click();
     Thread.sleep(2000); */
		
		
		
	/*	drop_HomePageLocator.clDailyD.click();
		
		drop_HomePageLocator.clFeatured.click();
		
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//System.out.println(allLinks.size());
		
		for(int i = 0;i<allLinks.size(); i++) {
			//System.out.println(allLinks.get(i).getText());
			
		if(allLinks.get(i).getText().contains(Drop_TestData.lace)) {
			
		allLinks.get(i).click();
		
		break;
		
		}

		}
		Thread.sleep(2000); */
		
		
		
		
		Thread.sleep(3000); 
		drop_HomePageLocator.clDailyD.click();
		drop_HomePageLocator.clFeatured.click();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
    	
		for(int i = 0;i<allLinks.size(); i++) {
			
		if(allLinks.get(i).getText().contains(Drop_TestData.lace)) {
		allLinks.get(i).click();	
		
		break;
			
		}
			
		}
    	       
    	 Thread.sleep(3000); 
    	  
      
      
     
		
	}
	public void typetoysonsearchfield() {
		
		drop_HomePageLocator.seaFil.sendKeys(Drop_TestData.sendK);	
		
	}
	public void clicksearch() {
		drop_HomePageLocator.clse.click();
		
	}
}
