package BlazeDemo.CommonPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class BlazeDemo_CommonMethodLibrary extends BlazeDemo_Constants{
	
	

	public BlazeDemo_CommonMethodLibrary() throws Exception {
			super();
		}
	public void startbrowser() throws Exception{
			System.setProperty("webdriver.chrome.driver",Chromedriverpath+"chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			System.out.println("Browser loaded");
			
			
	}
	public void launchApplication() throws Exception{
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get(startapplication);
			Thread.sleep(3000);
			System.out.println("Launched BlazeDemo Application");


	
	}
			
	       public void quitBrowser() throws Exception {
			Thread.sleep(3000);
			driver.manage().deleteAllCookies();
			driver.quit();
		}
			public void clearCookies(){
				Iterable<org.openqa.selenium.Cookie> cookies = driver.manage().getCookies();
				for(org.openqa.selenium.Cookie s : cookies){
					driver.manage().deleteCookie(s);
					driver.manage().deleteAllCookies();	
					driver.navigate().refresh();
		}
		

		
		
	}}



