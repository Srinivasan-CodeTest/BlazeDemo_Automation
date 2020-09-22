package BlazeDemo.Test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BlazeDemo.CommonPackage.BlazeDemo_BaseLibrary;
import BlazeDemo.CommonPackage.BlazeDemo_CommonMethodLibrary;
import BlazeDemo.LoginPage.LoginPage_Functional_Library;




public class BlazeDemo_Functionality extends BlazeDemo_BaseLibrary{
	
	

	public BlazeDemo_Functionality() throws Exception {
		super();
	}	
	
BlazeDemo.CommonPackage.CommonUtilities commonUtil;
BlazeDemo_BaseLibrary testBaseLibrary;
BlazeDemo_CommonMethodLibrary CommonMethodLibrary;
LoginPage_Functional_Library LoginPage;
public static WebDriver driver;


@BeforeClass(alwaysRun = true)
public void Setup() throws Exception {
CommonMethodLibrary = new BlazeDemo_CommonMethodLibrary();
commonUtil = new BlazeDemo.CommonPackage.CommonUtilities();
testBaseLibrary = new BlazeDemo_BaseLibrary();
LoginPage = new LoginPage_Functional_Library();
}


//---------User Account Module---------------------------------------------------------------------//
@DataProvider(name ="BasePage")
public String[][] UserAccount() throws Exception {
return commonUtil.fetchInputData(Inputfilepath,datasheetBlazeDemoInput,BasePage);
}
@Test(dataProvider = "BasePage")
public void UserAccount1(String RunMode,String departureCityDropDown, String destinationCityDropdown,String AirlineName,String PassengerName,String EnterAddress,String EnterCity,String EnterState,String selectcardType,String CreditCardNumber,String creditCardMonth,String CreditCardYear,String NameOnCard)throws Exception
{
	System.out.println("Testing");
	LoginPage.welcomepage(departureCityDropDown, destinationCityDropdown,AirlineName,PassengerName,EnterAddress,EnterCity,EnterState, selectcardType,CreditCardNumber,creditCardMonth,CreditCardYear,NameOnCard);
}


@AfterMethod
public void appendFinalHTMLReport(ITestResult result) throws Exception{
    if(result.getStatus() == ITestResult.FAILURE)
    {
    	
       Thread.sleep(3000);
    }else if(result.getStatus() == ITestResult.SUCCESS){
    	System.out.println("Module executed successfully");
    	Thread.sleep(3000);
    	
    	}/*else if(result.getStatus() == ITestResult.SKIP){
			test.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());*/
		
      }
 }
