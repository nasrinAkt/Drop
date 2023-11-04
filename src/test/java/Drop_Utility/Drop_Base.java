package Drop_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

   public class Drop_Base {
   public static WebDriver driver;
   public static Properties DrPro;
   
	public Drop_Base() {
	try {
		FileInputStream drFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java//Drop_Config//Drop_Config.Properties"));
		DrPro = new Properties();
		DrPro.load(drFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public void DrBrowser() {
	String DrAllBrowser	= DrPro.getProperty("DrBrowser1");
	
	if(DrAllBrowser.equalsIgnoreCase("Chrome")) {
		
	System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+("//Drop_ChromeDriver//chromedriver.exe"));	
	ChromeOptions tt = new ChromeOptions();
	tt.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Drop_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Drop_Utiliti.implicitlyWait));
	driver.manage().window().maximize();
		}
	else if(DrAllBrowser.equalsIgnoreCase("Edge")) {
	
	System.setProperty("WebDriver.edge.driver",System.getProperty("user.dir")+("//Drop_EdgeDriver//msedgedriver.exe"));	
	EdgeOptions tt1 = new EdgeOptions();
	tt1.addArguments("--remote-allow-origins=*");
	driver = new EdgeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Drop_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Drop_Utiliti.implicitlyWait));
	driver.manage().window().maximize();	
		
		
	}
	}
	public static void DrLaunchURL(String URL) {
		
		driver.get(DrPro.getProperty("DrURL"));
		
	}
	
}
