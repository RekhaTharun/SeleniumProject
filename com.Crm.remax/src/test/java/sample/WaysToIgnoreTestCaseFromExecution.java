package sample;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WaysToIgnoreTestCaseFromExecution 
{
	@Test
	public void createUser()
	{
		System.out.println("UserCreated!!");
	}
	//@Test(enabled=false)
	@Test(invocationCount=0)
	public void  modifyuser()
	{
		System.out.println("UserModified!!");
	}
	@Ignore
	@Test()
	
	public void deleteUser()
	{
		System.out.println("UserDeleted!!");
	}
}
