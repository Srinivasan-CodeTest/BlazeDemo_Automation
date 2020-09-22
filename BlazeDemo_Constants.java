package BlazeDemo.CommonPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlazeDemo_Constants
{
			
		protected CommonUtilities commonUtil = new CommonUtilities();
		public static WebDriver driver;
		public static String startapplication;
		public static String Inputfilepath=System.getProperty("user.dir")+File.separator+"resources"+File.separator+"Input"+File.separator+"BlazeDemoInputTable.xls";
	    public static String Chromedriverpath=System.getProperty("user.dir")+File.separator+"resources"+File.separator+"Drivers"+File.separator;
	    public static String datasheetBlazeDemoInput;
	    public static String BasePage;
	    
	   
//Constructors of Base class	    
	    
public BlazeDemo_Constants() throws Exception {
	    Properties BlazeDemoProp = new Properties();		
	    BlazeDemoProp.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"resources"+File.separator+"properties"+File.separator+"BlazeDemo.properties")));
		startapplication = BlazeDemoProp.getProperty("ApplicationURL");
		datasheetBlazeDemoInput = BlazeDemoProp.getProperty("excel.BlazeDemo.datasheet");
		BasePage=BlazeDemoProp.getProperty("excel.BlazeDemo.BasePage");

	}
}
