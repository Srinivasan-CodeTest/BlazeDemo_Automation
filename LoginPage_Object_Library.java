package BlazeDemo.LoginPage;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_Object_Library {
	
    @FindBy(xpath=".//*[@name='fromPort']")
    public WebElement departureCity;
    
    @FindBy(xpath=".//*[@name='toPort']")
    public WebElement destinationCity;

	@FindBy(xpath=".//*[@value='Find Flights']")
	public WebElement FindFlightsButton;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr[*]/td/input[@value='Choose This Flight']")
	public List<WebElement> choosethisflightbutton;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr[*]")
	public List<WebElement> SelectingAirlinefromtable;
	
	@FindBy(xpath="//input[@id='inputName']")
	public WebElement inputNameField;
	
	@FindBy(xpath="//input[@id='address']")
	public WebElement inputAddressField;
	
	@FindBy(xpath="//input[@id='city']")
	public WebElement inputCityField;
	
	@FindBy(xpath="//input[@id='state']")
	public WebElement inputStateField;
	
	@FindBy(xpath="//input[@id='zipCode']")
	public WebElement inputzipCodeField;
	
	@FindBy(xpath="//select[@id='cardType']")
	public List<WebElement> selectCardType;
	
	@FindBy(xpath="//input[@id='creditCardNumber']")
	public WebElement inputcreditCardNumber;
	
	@FindBy(xpath="//input[@id='creditCardMonth']")
	public WebElement inputcreditCardMonth;
	
	@FindBy(xpath="//input[@id='creditCardYear']")
	public WebElement inputcreditcardYear;
	
	@FindBy(xpath="//input[@id='nameOnCard']")
	public WebElement inputnameOnCard;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public WebElement PurchaseFlightbutton;

	@FindBy(xpath="//a[contains(text(),'home')]")
	public WebElement HomeHeaderLink;
		
	}
	
	
	

