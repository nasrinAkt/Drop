package Drop_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Drop_Utility.Drop_Base;

public class Drop_SearchPageLocator extends Drop_Base {
	
  public Drop_SearchPageLocator() {
	
	PageFactory.initElements(driver, this);
}
  
  @FindBy(xpath ="//span[@class='b-pageheader__text']")
  public WebElement verify;
  
  
  @FindBy(xpath ="(//div[text()='Baby Toys'])[1]")
  public WebElement clbt;
  @FindBy(css ="li[id='item2446463b6f'] span[role='heading']")
  public WebElement clsitem;
  
  
  
}
