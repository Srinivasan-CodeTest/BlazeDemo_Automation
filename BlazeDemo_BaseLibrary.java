package BlazeDemo.CommonPackage;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class BlazeDemo_BaseLibrary extends BlazeDemo_Constants{
	
	
	public BlazeDemo_BaseLibrary() throws Exception {
		super();
		
		
	}
		public static WebDriver driver;
		BlazeDemo_CommonMethodLibrary commonMethodLibrary = new BlazeDemo_CommonMethodLibrary();
		CommonUtilities commonUtil = new CommonUtilities();
		
	@BeforeSuite(alwaysRun=true)
	public void launchbrowser()throws Exception {
		commonMethodLibrary.startbrowser();
		commonMethodLibrary.launchApplication();
		}

	
		
	
}
