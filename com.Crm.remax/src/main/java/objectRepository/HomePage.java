package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilityOrLibrary.SeleniumUtility;

public class HomePage
{
	@FindBy(xpath="(//a[text()='Leads'])[1]")

	private WebElement leads;

	@FindBy(xpath="(//a[text()='Organizations'])[1]")

	private WebElement org;

	@FindBy(xpath="(//td[@class='small'])[2]")

	private WebElement preferences;

	@FindBy(xpath="//a[text()='Sign Out']")

	private WebElement signoutOperation;

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getLeads()
	{
		return leads;
	}

	public WebElement getOrg() 
	{
		return org;
	}

	public WebElement getPreferences() 
	{
		return preferences;
	}

	public WebElement getSignoutOperation() 
	{
		return signoutOperation;
	}

	/**
	 * this is business library to click on leads
	 */
	public void clickOnLeads()
	{
		leads.click();
	}
	/**
	 * this is business library to click on organizations
	 */
	public void clickOnOrg()
	{
		org.click();
	}
	/**
	 * this is business library to logout
	 * @throws Exception
	 */
	public void logoutOperation(WebDriver driver) throws Exception
	{
		SeleniumUtility SUTIL=new SeleniumUtility();
		SUTIL.moveCursorToAnElement(driver, preferences);
		Thread.sleep(3000);
		SUTIL.moveCursorToAnElement(driver, signoutOperation);
		Thread.sleep(3000);
		SUTIL.clickOnAnElement(driver, signoutOperation);
	}
}
