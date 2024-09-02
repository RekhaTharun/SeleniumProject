package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert
{
	@Test
	public void hardAssertStrictComparison()
	{
		String expectedData="raja";
		String actualData="Raja";
		Assert.assertEquals(actualData,expectedData);
		System.out.println("Strict comparison passed!!");
	}
	@Test
	public void containsLevelComparison()
	{
		String expectedData="raja";
		String actualData="maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparison passed!!");
	}
}

