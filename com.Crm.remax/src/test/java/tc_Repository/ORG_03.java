package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLibrary.BaseClass;
import genericUtilityOrLibrary.ExcelUtility;
import genericUtilityOrLibrary.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_03 extends BaseClass
{
	@Test
	public void org_03case() throws Exception
	{
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL=new ExcelUtility();
	String ORGNAME=EUTIL.readDataFromExcel("Organization",8,1);
	String WEBSITE=EUTIL.readDataFromExcel("Organization", 8, 2);
	String BILLINGADDRESS=EUTIL.readDataFromExcel("Organization",8,3);
	String BILLINGCITY=EUTIL.readDataFromExcel("Organization", 8, 4);
	String BILLINGSTATE=EUTIL.readDataFromExcel("Organization",8,5);
	
	HomePage hmp=new HomePage(driver);
	hmp.clickOnOrg();
	OrgHomePage ohmp=new OrgHomePage(driver);
	ohmp.clickOnNewOrgBtn();
	CreateNewOrgPage cnop=new CreateNewOrgPage(driver);
	cnop.createOrganisation(ORGNAME+num, WEBSITE,
			BILLINGADDRESS,BILLINGCITY,BILLINGSTATE);
	Thread.sleep(4000);
	}
}
