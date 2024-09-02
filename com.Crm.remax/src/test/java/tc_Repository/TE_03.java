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
public class TE_03 extends BaseClass
{
	@Test(groups= {"regression","sanity"})
	public void le_03Case() throws Exception
	{
		JavaUtility JUTIL = new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL = new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("leads",8,1);
		String LASTNAME=EUTIL.readDataFromExcel("leads",8, 2);
		String COMPANY=EUTIL.readDataFromExcel("leads",8,3);
		String TITLE=EUTIL.readDataFromExcel("leads",8,4);
		String PHONE=EUTIL.readDataFromExcel("leads",8,5);
		String MOBILE=EUTIL.readDataFromExcel("leads",8,6);
		String EMAIL=EUTIL.readDataFromExcel("leads",8,7);
		String NOE=EUTIL.readDataFromExcel("leads",8,8);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage (driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME+num, LASTNAME, COMPANY,TITLE,PHONE,MOBILE,EMAIL,NOE);
		Thread.sleep(4000);
		System.out.println("tc_03 executed successfully!!");
	}
}
