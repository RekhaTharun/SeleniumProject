package genericUtilityOrLibrary;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	public String readDataFromExcel(String sheetName,int rouNum,int cellNum) throws Exception

	{

		FileInputStream fis=new FileInputStream(IconstantUtility.excelPath);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sh=book.getSheet(sheetName);

		DataFormatter format=new DataFormatter();

		String value=format.formatCellValue(sh.getRow(rouNum).getCell(cellNum));

		return value;

		

	}


}
