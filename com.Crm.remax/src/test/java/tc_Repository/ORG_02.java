package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLibrary.BaseClass;
import genericUtilityOrLibrary.ExcelUtility;
import genericUtilityOrLibrary.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_02 extends BaseClass
{
	@Test
	public void org_02case() throws Exception
	{
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL=new ExcelUtility();
	String ORGNAME=EUTIL.readDataFromExcel("Organization",5,1);
	String WEBSITE=EUTIL.readDataFromExcel("Organization", 5, 2);
	String EMPLOYEE=EUTIL.readDataFromExcel("Organization",5,3);
	String PHONE=EUTIL.readDataFromExcel("Organization", 5, 4);
	String OTHERPHONE=EUTIL.readDataFromExcel("Organization",5,5);
	String EMAIL=EUTIL.readDataFromExcel("Organization", 5, 6);
	
	
	HomePage hmp=new HomePage(driver);
	hmp.clickOnOrg();
	OrgHomePage ohmp=new OrgHomePage(driver);
	ohmp.clickOnNewOrgBtn();
	CreateNewOrgPage cnop=new CreateNewOrgPage(driver);
	cnop.createOrganisation(ORGNAME+num,WEBSITE,EMPLOYEE,PHONE,OTHERPHONE,EMAIL);
	Thread.sleep(4000);
	}
}