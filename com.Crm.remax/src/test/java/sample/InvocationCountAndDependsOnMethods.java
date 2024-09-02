package sample;

import org.testng.annotations.Test;

public class InvocationCountAndDependsOnMethods
{	
	@Test(priority=1,invocationCount=5)
	public void createUser()
	{
		System.out.println("UserCreated!!");
	}
	
	@Test(priority=2,dependsOnMethods= {"createUser"})
	public void  modifyUser()
	{
		System.out.println("UserModified!!");
	}
	
	@Test(priority=3)
	public void deleteUser()
	{
		System.out.println("UserDeleted!!");
	}
}
