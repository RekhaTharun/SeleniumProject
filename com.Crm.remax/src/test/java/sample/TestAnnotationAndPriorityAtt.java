package sample;

import org.testng.annotations.Test;

public class TestAnnotationAndPriorityAtt
{
	@Test(priority=-1)
	
	public void createUser()
	{
		System.out.println("UserCreated!!");
	}
	@Test(priority=-2)
	
	public void  modifyuser()
	{
		System.out.println("UserModified!!");
	}
	@Test(priority=-3)
	
	public void deleteUser()
	{
		System.out.println("UserDeleted!!");
	}
	
}
