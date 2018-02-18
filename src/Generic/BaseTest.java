package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConst
{
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY,CHROME_PATH);
		System.setProperty(FIREFOX_KEY,FIREFOX_PATH);
		System.setProperty(IE_KEY,IE_PATH);
		
	}
	@Parameters({"browser"})
	@BeforeClass(alwaysRun=true)
	public void openApp(@Optional("chrome")String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		String url = AUL.getProperty(PROPERTIES_PATH,"URL");
		driver.get(url);
		driver.manage().window().maximize();
	
		
		String strITO = AUL.getProperty(PROPERTIES_PATH,"ITO");
		long ito = Long.parseLong(strITO);
		driver.manage().timeouts().implicitlyWait(ito,TimeUnit.SECONDS );
		
		
		
		
	}
	/*@AfterMethod
	public void close(ITestResult res)
	{
		if(res.getStatus()==2)
		{
			AUL.getPhoto(driver, testName, output);
		}
	}*/
}