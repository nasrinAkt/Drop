package Drop_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drop_Utility.Drop_Base;

public class Drop_HomePageLocator extends Drop_Base{

	public Drop_HomePageLocator() {
	PageFactory.initElements(driver, this);	
		
	}
	@FindBy(id="gh-cat")
	public WebElement clAllCateg;
	
	@FindBy(id ="gh-btn")
	public WebElement search;
	
	@FindBy(xpath ="//select[@class='gh-sb ']//option[30]")
	public WebElement drClOnItm;
	
	@FindBy(linkText="Daily Deals")
	public WebElement clDailyD;
	
	@FindBy(xpath ="//span[text()='Featured']")
	public WebElement clFeatured;
	
	
	@FindBy(id="gh-ac")
	public WebElement seaFil;
	
	@FindBy(id="gh-btn")
	public WebElement clse;
	
}
