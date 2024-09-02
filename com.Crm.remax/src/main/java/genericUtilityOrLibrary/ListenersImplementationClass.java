package genericUtilityOrLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class ListenersImplementationClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodname=result.getMethod().getMethodName();
		Reporter.log("from this"+methodname+"execution time");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodname=result.getMethod().getMethodName();
		Reporter.log(methodname+" execution successfull!!");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		String methodname=result.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
		
		Reporter.log("from this"+methodname+"execution time");
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\ScreenShotFol\\"+methodname+".png");
		try
		 {
			Files.copy(src, dest);
		}
		catch(IOException e){	
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		Reporter.log(methodname+" execution skips!!");
	}
}
