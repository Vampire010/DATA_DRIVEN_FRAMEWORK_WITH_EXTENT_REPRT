package Data_Server;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven 
{
	String path= "/Users/girishg/eclipse-workspace/PGAE_OBJECT_MODEL_FRAMEWORK_POM/src/main/java/Data_Server/UserTestData.xlsx";
	
	public String getdata(String sname,int rno,int cno) throws IOException
	{
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook w = new XSSFWorkbook(fis);
	
		XSSFSheet s = w.getSheet(sname);
		
		String s1 = s.getRow(rno).getCell(cno).getStringCellValue();
		
		return s1;
		
	}
	
}
