package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage 
{
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement webSite;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement employee;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phn ;
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement  otherphn;
	@FindBy(xpath="//input[@name='email1']")
	private WebElement email ;
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement billingstreet;
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billingCity;
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billingstate;
	@FindBy(xpath="(//input[@class='crmbutton small save'])[2]")
	private WebElement saveBtn;
	
	public CreateNewOrgPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmployee() {
		return employee;
	}

	public WebElement getPhn() 
	{
		return phn;
	}

	public WebElement getOtherphn()
	{
		return otherphn;
	}

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getBillingstreet() 
	{
		return billingstreet;
	}

	public WebElement getBillingCity()
	{
		return billingCity;
	}

	public WebElement getBillingstate()
	{
		return billingstate;
	}

	public WebElement getSaveBtn() 
	{
		return saveBtn;
	}
	
	public void createOrganisation(String organisationName,String web,String emp)
	{
		orgName.sendKeys(organisationName); 
		webSite.sendKeys(web);
		employee.sendKeys(emp);
		saveBtn.click();
	}
	
	/**
	 * this
	 * 
	 */
	public void createOrganisation(String organisationName,String web,String emp,String phoneNumber,
			String otherPhone,String mailId)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employee.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherphn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		saveBtn.click();
	}
	
	
	public void createOrganisation(String organisationName,String web,String billStreet, 
			String billCity,String billState)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		billingstreet.sendKeys(billStreet);
		billingCity.sendKeys(billCity);
		billingstate.sendKeys(billState);
		saveBtn.click();
	}
			
	public void createOrganisation(String organisationName,String web,String emp,String phoneNumber,
			String otherPhone,String mailId,String billStreet, String billCity,String billState)
	{
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employee.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherphn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		billingstreet.sendKeys(billStreet);
		billingCity.sendKeys(billCity);
		billingstate.sendKeys(billState);
		saveBtn.click();
	}
	
} 

