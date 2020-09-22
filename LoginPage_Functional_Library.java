package BlazeDemo.LoginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BlazeDemo.CommonPackage.BlazeDemo_CommonMethodLibrary;
import org.openqa.selenium.WebElement;


public class LoginPage_Functional_Library extends BlazeDemo_CommonMethodLibrary{
	
	LoginPage_Object_Library LoginPageObjectLibrary;

	public LoginPage_Functional_Library() throws Exception {
		super();
		
		LoginPageObjectLibrary=PageFactory.initElements(driver, LoginPage_Object_Library.class);
		commonUtil = new BlazeDemo.CommonPackage.CommonUtilities();	
		
	}
	
	public void welcomepage(String departureCityDropDown, String destinationCityDropdown,String AirlineName,String PassengerName,String EnterAddress,String EnterCity,String EnterState,String selectcardType,String CreditCardNumber,String creditCardMonth,String CreditCardYear,String NameOnCard) {
		new Select(LoginPageObjectLibrary.departureCity).selectByValue(departureCityDropDown);
		new Select(LoginPageObjectLibrary.destinationCity).selectByValue(destinationCityDropdown); 
		LoginPageObjectLibrary.FindFlightsButton.click();
		int Airline=LoginPageObjectLibrary.SelectingAirlinefromtable.size();
		for(int i=0;i<Airline;i++) {
			String selectAirline=LoginPageObjectLibrary.SelectingAirlinefromtable.get(i).getText();
			if(selectAirline.contains(AirlineName))
			{
				LoginPageObjectLibrary.choosethisflightbutton.get(i).click();
				break;
			}
		}
		LoginPageObjectLibrary.inputNameField.sendKeys(PassengerName);
		LoginPageObjectLibrary.inputAddressField.sendKeys(EnterAddress);
		LoginPageObjectLibrary.inputCityField.sendKeys(EnterCity);
		LoginPageObjectLibrary.inputStateField.sendKeys(EnterState);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,250)", "");
		for(WebElement Li : LoginPageObjectLibrary.selectCardType) {
			if(Li.getText().contains(selectcardType)) {
			Li.click();
			break;
		}}
		
		//--------------------------------------------------------------------------//
		//Below Scenarios will work when we give Acceptable credit card details //
		//Commented below line because actual credit card values are working fine//
		//---------------------------------------------------------------------------//
		/*LoginPageObjectLibrary.inputcreditCardNumber.sendKeys(CreditCardNumber);
		LoginPageObjectLibrary.inputcreditCardMonth.sendKeys(creditCardMonth);
		LoginPageObjectLibrary.inputcreditcardYear.sendKeys(CreditCardYear);
		LoginPageObjectLibrary.inputnameOnCard.sendKeys(NameOnCard);*/
		LoginPageObjectLibrary.PurchaseFlightbutton.click();
		
	//	LoginPageObjectLibrary.HomeHeaderLink.click();
		
		
	}
}
	/*public void ValidLogin(String username,String password) throws Exception {
		LoginPageObjectLibrary.login.clear();
		LoginPageObjectLibrary.login.sendKeys(username);
		LoginPageObjectLibrary.Password.clear();
		LoginPageObjectLibrary.Password.sendKeys(password);
		LoginPageObjectLibrary.submit.click();
		Thread.sleep(5000);
		
	}
	
	public void UserAccountSelection(String AccoutName) throws Exception {
		LoginPageObjectLibrary.UserAccountDD.click();
		for(WebElement Li: LoginPageObjectLibrary.AccountSearchInput) {
			if(Li.getText().contains(AccoutName)) {
				Li.click();
				break;
			}
			
		}
	}
	

		

	public void Forgottonusername(String RecoveryEmailID) {
		LoginPageObjectLibrary.ForgotUsername.click();
		LoginPageObjectLibrary.RecoveryEmail.sendKeys(RecoveryEmailID);
		LoginPageObjectLibrary.submit.click();
		LoginPageObjectLibrary.ReturnSignin.click();
	}
	public void Forgottonpassword(String RecoveryEmailID) {
		LoginPageObjectLibrary.ForgotPassword.click();
		LoginPageObjectLibrary.RecoveryEmail.sendKeys(RecoveryEmailID);
		LoginPageObjectLibrary.submit.click();
		LoginPageObjectLibrary.ReturnSignin.click();
	}
	public void UserAccountLogout() throws Exception {
		LoginPageObjectLibrary.UserAccountLink.click();
		Thread.sleep(2000);
		LoginPageObjectLibrary.UserAccoutLogout.click();
	}
    */

