package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadsPage 
{
	@FindBy(xpath="//input[@name='firstname']")

	private WebElement firstName ;

	@FindBy(xpath="//input[@name='lastname']")

	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='company']")

	private WebElement company;

	@FindBy(xpath="//input[@name='designation']")

	private WebElement title;

	@FindBy(xpath="//input[@name='phone']")

	private WebElement phone;

	@FindBy(xpath="//input[@name='mobile']")

	private WebElement mobile;

	@FindBy(xpath="//input[@name='email']")

	private WebElement email;

	@FindBy(xpath="//input[@name='noofemployees']")

	private WebElement noOfEmployees;

	@FindBy(xpath="//textarea[@name='lane']")

	private WebElement street;

	@FindBy(xpath="//input[@name='pobox']")

	private WebElement poBox;

	@FindBy(xpath="//input[@name='code']")

	private WebElement postalCode;

	@FindBy(xpath="//input[@name='code']")

	private WebElement city;

	@FindBy(xpath="//input[@name='country']")

	private WebElement country;

	@FindBy(xpath="//input[@name='state']")

	private WebElement state;

	@FindBy(xpath="//input[@class='crmbutton small save']")

	private WebElement saveBtn;

	public CreateNewLeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getFirstName()
	{
		return firstName;
	}
		public WebElement getLastName() 
	{
	return lastName;
	}
	public WebElement getCompany() 
	{
		return company;
	}

	public WebElement getTitle()
	{
		return title;
	}
	public WebElement getPhone() 
	{
		return phone;
	}

	public WebElement getMobile() 
	{
		return mobile;
	}

	public WebElement getEmail() 
	{
		return email;
	}

	public WebElement getNoOfEmployees() 
	{
		return noOfEmployees;
	}

	public WebElement getStreet() 
	{
		return street;
	}

	public WebElement getPoBox() 
	{
		return poBox;
	}

	public WebElement getPostalCode()
	{
		return postalCode;
	}

	public WebElement getCity() 
	{
		return city;
	}
	
	public WebElement getCountry() 
	{
		return country;
	}

	public WebElement getState()
	{
		return state;
	}

	public WebElement getSaveBtn()
	{
		return saveBtn;
	}

	
	public void createLeads(String fName,String LName,String com)
	{
		firstName.sendKeys(fName);

		lastName.sendKeys(LName);

		company.sendKeys(com);

		saveBtn.click();
	}

	
	public void createLeads(String fName,String LName,String com,String ttl,String phn,

			String mob,String mailId,String numEmp,String strt,String pbox,String pcode,

			String cty,String cntry,String st)
	{
		firstName.sendKeys(fName);

		lastName.sendKeys(LName);

		company.sendKeys(com);

		title.sendKeys(ttl);

		phone.sendKeys(phn);

		mobile.sendKeys(mob);

		email.sendKeys(mailId);

		noOfEmployees.sendKeys(numEmp);

		street.sendKeys(strt);

		poBox.sendKeys(pbox);

		postalCode.sendKeys(pcode);

		city.sendKeys(cty);

		country.sendKeys(cntry);

		state.sendKeys(st);

		saveBtn.click();
	}
	

	public void createLeads(String fName,String LName,String com,String ttl,String phn,

			String mob,String mailId,String numEmp)
	{
	firstName.sendKeys(fName);

	lastName.sendKeys(LName);

	company.sendKeys(com);

	title.sendKeys(ttl);

	phone.sendKeys(phn);

	mobile.sendKeys(mob);

	email.sendKeys(mailId);

	noOfEmployees.sendKeys(numEmp);

	saveBtn.click();
	}

	
	public void createLeads(String fName,String LName,String com,String strt,String pbox,

			String pcode,String cty,String cntry,String st)
	{
		firstName.sendKeys(fName);

		lastName.sendKeys(LName);

		company.sendKeys(com);

		street.sendKeys(strt);

		poBox.sendKeys(pbox);

		postalCode.sendKeys(pcode);

		city.sendKeys(cty);

		country.sendKeys(cntry);

		state.sendKeys(st);

		saveBtn.click();
	}
}
