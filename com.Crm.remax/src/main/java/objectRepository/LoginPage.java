package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	/**

	 * this is a pom class for login page

	 */


		//private variables for declaration

		@FindBy(xpath="//input[@name='user_name']")

		private WebElement username;

		

		@FindBy(xpath="//input[@name='user_password']")

		private WebElement password;

		

		@FindBy(xpath="//input[@id='submitButton']")

		private WebElement loginBtn;



		//constructor for initialization

		public LoginPage(WebDriver driver)

		{

			PageFactory.initElements(driver,this);

		}

		

		//using getters for accessing

		public WebElement getUsername()

		{

			return username;

		}

		public WebElement getPassword()

		{

			return password;

		}

		public WebElement getLoginBtn()

		{

			return loginBtn;

		}

		

		/**

		 * this is the business library to do the login operation

		 * @param uname

		 * @param pass

		 */

		public void loginOperation(String uname,String pass)

		{

			username.sendKeys(uname);

			password.sendKeys(pass);

			loginBtn.click();

		}
	}


