package Generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
	public void openApp(@Optional("chrome")String browser) throws MalformedURLException
	{
		URL remote = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities dc	;
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			/*dc=DesiredCapabilities.chrome();
			dc.setPlatform(Platform.WINDOWS);*/
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		/*	dc = DesiredCapabilities.firefox();
			dc.setPlatform(Platform.WINDOWS);*/
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		/*driver=new RemoteWebDriver(remote,dc);*/
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