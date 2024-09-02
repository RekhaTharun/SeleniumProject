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
public class TE_01 extends BaseClass

{
	@Test(groups= {"sanity"})
	public void le_01Case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("leads",2,1);
		String LASTNAME=EUTIL.readDataFromExcel("leads",2, 2);
		String COMPANY=EUTIL.readDataFromExcel("leads",2,3);

		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage (driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME+num, LASTNAME, COMPANY);
		System.out.println("tc_01 executed successfully!!");
		Thread.sleep(4000);
	}
}
