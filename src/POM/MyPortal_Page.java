package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPortal_Page 
{
	@FindBy(xpath="//li[@title='HR']")
	private WebElement hr;
	
	public MyPortal_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotoHR()
	{
		hr.click();
	}

}
