package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLibrary.BaseClass;
import genericUtilityOrLibrary.ExcelUtility;
import genericUtilityOrLibrary.JavaUtility;
import genericUtilityOrLibrary.ListenersImplementationClass;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;
@Listeners(ListenersImplementationClass.class)
public class LE_04 extends BaseClass

{
	@Test(groups= {"smoke"})
	public void le_04Case() throws Exception
	{
	JavaUtility JUTIL = new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL = new ExcelUtility();
	String FIRSTNAME=EUTIL.readDataFromExcel("Leads",11,1);
	String LASTNAME=EUTIL.readDataFromExcel("Leads",11, 2);
	String COMPANY=EUTIL.readDataFromExcel("Leads",11,3);
	String STRT=EUTIL.readDataFromExcel("Leads",11,4);
	String PBOX=EUTIL.readDataFromExcel("Leads",11,5);
	String PCODE=EUTIL.readDataFromExcel("Leads",11,6);
	String CITY=EUTIL.readDataFromExcel("Leads",11,7);
	String COUNTRY=EUTIL.readDataFromExcel("Leads",11,8);
	String STATE=EUTIL.readDataFromExcel("Leads",11,9);
	
	HomePage hp=new HomePage(driver);
	hp.clickOnLeads();
	LeadsHomePage lp=new LeadsHomePage (driver);
	lp.clickOnNewLeadBtn();
	CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
	cn.createLeads(FIRSTNAME+num, LASTNAME,COMPANY,STRT,PBOX,PCODE,CITY,COUNTRY,STATE);
	System.out.println("tc_04 executed successfully!!");
	Thread.sleep(4000);
	
	}
}
