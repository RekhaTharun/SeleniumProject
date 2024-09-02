package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLibrary.BaseClass;
import genericUtilityOrLibrary.ExcelUtility;
import genericUtilityOrLibrary.JavaUtility;
import genericUtilityOrLibrary.ListenersImplementationClass;
import genericUtilityOrLibrary.RetryAnalyzerInpmlementationClass;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;
@Listeners(ListenersImplementationClass.class)
public class ORG_01 extends BaseClass
{
	
	@Test(retryAnalyzer=genericUtilityOrLibrary.RetryAnalyzerInpmlementationClass.class)
	public void org_01case() throws Exception
	{
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL=new ExcelUtility();
	String ORGNAME=EUTIL.readDataFromExcel("Organization",2,1);
	String WEBSITE=EUTIL.readDataFromExcel("Organization", 2, 2);
	String EMPLOYEE=EUTIL.readDataFromExcel("Organization",2,3);
	
	HomePage hmp=new HomePage(driver);
	hmp.clickOnOrg();
	OrgHomePage ohmp=new OrgHomePage(driver);
	ohmp.clickOnNewOrgBtn();
	CreateNewOrgPage cnop=new CreateNewOrgPage(driver);
	cnop.createOrganisation(ORGNAME+num,WEBSITE,EMPLOYEE);
	Thread.sleep(4000);
	}
}

