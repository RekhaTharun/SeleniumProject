package samplePackage;

import java.io.FileInputStream;
import java.util.Properties;

public class SampleEProPp 
{
	public static void main(String[] args) throws Exception
	{
	
		FileInputStream fis=new FileInputStream("C:\\Selenium\\A4CommonData.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("url");
		String USERNAME=pobj.getProperty("username");
		String PASS=pobj.getProperty("passwrd");
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASS);
	}
}
