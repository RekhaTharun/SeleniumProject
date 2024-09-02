package genericUtilityOrLibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExampleIndividualData 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream("C:\\Selenium\\Book1.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet2");
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(8).getCell(4));
		System.out.println(value);
	}
}


