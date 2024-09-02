package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsHomePage 
{
	@FindBy(xpath="//img[@alt='Create Lead...\']")
	private WebElement createNewLeadButton;
	
	public LeadsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getCreateNewLeadButton()
	{
		return createNewLeadButton;
	}
	/**
	 * this is the business library to click on new button
	 */
	public void createnewLeadButton()
	{
		return;
	}
	public void clickOnNewLeadBtn()
	{
		createNewLeadButton.click();
		
	}
}
