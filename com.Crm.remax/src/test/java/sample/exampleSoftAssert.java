package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class exampleSoftAssert
{
		@Test
		public void softAssertStrictComparison()
		{
			String expectedData="raja";
			String actualData="Raja";
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(actualData,expectedData);
			System.out.println("Strict comparison passed!!");
			sa.assertAll();
		}
		@Test
		public void containsLevelComparison()
		{
			String expectedData="raja";
			String actualData="maharaja";
			SoftAssert sa=new SoftAssert();
			sa.assertTrue(actualData.contains(expectedData));
			System.out.println("contains comparison passed!!");
			sa.assertAll();
		}
	}


