package genericUtilityOrLibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility
{
	public String getDataFromProperties (String data) throws Exception
	{
	
		FileInputStream fis=new FileInputStream("C:\\Selenium\\A4CommonData.properties");
		Properties pobj= new Properties();
		pobj.load(fis);
		String value=pobj.getProperty(data);
		return value;
		
	}
}
