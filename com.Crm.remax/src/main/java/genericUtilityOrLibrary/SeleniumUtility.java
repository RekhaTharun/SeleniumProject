package genericUtilityOrLibrary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumUtility 
{
	
	Actions act=null;
	Select s=null;
	
	/**
	 * this is generic method d=for implicit wait
	 * @param particularSeconds
	 */
	
	public void implicitWait(WebDriver driver, int particularSeconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(particularSeconds));
	}
	
	/*------------------------Actions class generic functions------------------*/
	/**
	 * this is a generic method to maximize window
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * this is a generic method to right click on element 
	 */
	public void rightClickOnAnElement(WebDriver driver,WebElement element)
	{
	act=new Actions(driver);
	act.contextClick(element).perform();
	}
	
	/**
	 * this is generic method to click on an element
	 */
	public void clickOnAnElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.click(element).perform();
	}
	
	/**
	 * this is a generic method to drag and drop an element
	 * @param src
	 * @param target
	 */
	public void DragAndDropAnElement(WebDriver driver,WebElement src,WebElement target)
	{
		act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	
	/**
	 * this is a generic method to drag and drop
	 * @param src
	 * @param xOffset
	 * @param yOffset
	 */
	public void dragAPointer(WebDriver driver,WebElement src,int xOffset,int yOffset)
	{
		act=new Actions(driver);
		act.dragAndDropBy(src, xOffset, yOffset).perform();
	}
	
	/**
	 * this is a generic method to scroll to a particular element
	 * @param element
	 */
	
	public void  scrollToAParticularElement(WebDriver driver,WebElement element)
	{
		act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	/**
	 * this is a generic method to move cursor to a particular element
	 * @param element
	 */
	 public void moveCursorToAnElement(WebDriver driver,WebElement element)
	 {
		 act=new Actions(driver);
			act.moveToElement(element).perform();
	 }
	
	 /**
	  * this is a generic method to hold an element
	  * @param element
	  */
	 public void holdAnElement(WebDriver driver,WebElement element)
	 {
		 act=new Actions(driver);
			act.clickAndHold(element).perform();
	 }
	 /**
	  * this is a generic method to release an element
	  * @param element
	  */
	 public void releaseAnElement(WebDriver driver,WebElement element)
	 {
		 act=new Actions(driver);
			act.release(element).perform();
	 }
	
	 /*----------------------------Select class generic functions-------"/
	 /**
	  * this is a generic method to select an option based on index number
	  * @param element
	  * @param indexNum
	  */
	 public void selectElementByIndex(WebElement element,int indexNum)
	 {
		 s=new Select(element);
			s.selectByIndex(indexNum);
	 }
	
	 /**
	  * this is a generic method to select  an option based visible Text
	  * @param element
	  * @param text
	  */
	 public void selectElementByVisibleText(WebElement element,String text)
	 {
		 s=new Select(element);
			s.selectByVisibleText(text);
	 }
	
	 /**
	  * this is a generic method to select an option based on value
	  * @param element
	  * @param value
	  */
	 public void selectElementByvalue(WebElement element,String value)
	 {
		 s=new Select(element);
			s.selectByValue(value);
	 }
	
	 /**
	  * this is a generic method to deselect an option based on index
	  * @param element
	  * @param indexNum
	  */
	 public void deSelectByIndex(WebElement element,int indexNum)
	 {
		 s=new Select(element);
			s.deselectByIndex(indexNum);
	 }
	
	 /**
	  * this is a generic method to deselect an option based on visible text
	  * @param element
	  * @param text
	  */
	 public void deSelectElementByVisibleText(WebElement element,String text)
	 {
		 s=new Select(element);
		s.deselectByVisibleText(text);
	 }
	
	 /**
	  * this is a generic method to deselect an option based on value
	  * @param element
	  * @param indexNum
	  */
	 public void deSelectElementByValue(WebElement element,String value)
	 {
		 s=new Select(element);
			s.deselectByValue(value);
	 }
	
	 /**
	  * this is a generic method to deselect an option based on all the options
	  * @param element
	  * @param text
	  */
	 public void deSelectAllOptions(WebElement element)
	 {
		 s=new Select(element);
		s.deselectAll();
	 }
	
	 /**
	  * this is a generic method to fetch all the selected options
	  * @param element
	  * @return
	  */
	 public List<WebElement> fetchAllSelectedOptions(WebElement element)
	 {
		 s=new Select (element);
		 List<WebElement> all=s.getAllSelectedOptions();
		return all;
	 }
	
	 /**
	  * this is a generic method to read all the options
	  * @param element
	  * @return
	  */
	 public List<WebElement> fetchAlloptions(WebElement element)
	 {
		 s=new Select (element);
		 List<WebElement> all=s.getOptions();
		 return all;
	 }
	
	 /**
	  * this is a generic method to accept the alert
	  */
	 public void acceptAlert(WebDriver driver)
	 {
		driver.switchTo().alert().accept(); 
	 }
	
	 /**
	  * this is a generic method to dismiss the alert
	  */
	 public void dismissAlert(WebDriver driver)
	 {
		 driver.switchTo().alert().dismiss();
	 }
	 
	 /*-----------------------Frame--------------------*/
	 /**
	  * this is a generic method to switch frame based on child index
	  */
	 public void switchToChildFrame(WebDriver driver, int childFrameindex)
	 {
		driver.switchTo().frame(childFrameindex); 
	 }
}


