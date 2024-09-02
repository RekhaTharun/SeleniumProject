package tc_Repository;

import org.testng.annotations.Test;

import genericUtilityOrLibrary.BaseClass;
import genericUtilityOrLibrary.ExcelUtility;
import genericUtilityOrLibrary.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class ORG_04 extends BaseClass
{
	@Test
	public void org_04case() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Organization",11,1);
		String WEBSITE=EUTIL.readDataFromExcel("Organization", 11, 2);
		String EMPLOYEE=EUTIL.readDataFromExcel("Organization",11,3);
		String PHONE=EUTIL.readDataFromExcel("Organization", 11, 4);
		String OTHERPHONE=EUTIL.readDataFromExcel("Organization",11,5);
		String EMAIL=EUTIL.readDataFromExcel("Organization", 11, 6);
		String BILLINGADDRESS=EUTIL.readDataFromExcel("Organization",11,7);
		String BILLINGCITY=EUTIL.readDataFromExcel("Organization", 11, 8);
		String BILLINGSTATE=EUTIL.readDataFromExcel("Organization",11,9);
		
		HomePage hmp=new HomePage(driver);
		hmp.clickOnOrg();
		OrgHomePage ohmp=new OrgHomePage(driver);
		ohmp.clickOnNewOrgBtn();
		CreateNewOrgPage cnop=new CreateNewOrgPage(driver);
		cnop.createOrganisation(ORGNAME+num, WEBSITE,EMPLOYEE,PHONE,OTHERPHONE,EMAIL,
				BILLINGADDRESS,BILLINGCITY,BILLINGSTATE);
		Thread.sleep(4000);
	}
}
