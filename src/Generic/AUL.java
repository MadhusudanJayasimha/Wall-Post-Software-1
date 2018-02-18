package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AUL 
{
	public static String getProperty(String path,String key)
	{
		String v="";
		try{
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e){
		}
		return v;

	}
	
	public static int getRowCount(String path,String sheet) 
	{
		int rc=0;
		try {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		rc=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e) {}
		return rc;
	}
	
	public static String getCellValue(String path,String sheet,int r,int c){
		String v="";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e) {}
		return v;
	}
	
	
	public static void takePhoto(String folder,String TestName,WebDriver driver){
		String dateTime = new Date().toString().replaceAll(":","_");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		String dstPath=folder+TestName+dateTime+".png";
		try {
			//FileUtils.copyFile(srcFile,new File(dstPath));
		} catch (Exception e) {
		}
	}
}
