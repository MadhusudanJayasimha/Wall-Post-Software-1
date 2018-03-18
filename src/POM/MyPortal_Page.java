package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPortal_Page 
{
	@FindBy(xpath="//li[@title='HR']")
	private WebElement hr;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[1]")
	private WebElement modules;
	
	@FindBy(xpath="//i[@class='fa fa-fw fa-line-chart fa-3x themecolor-font-sales ']")
	private WebElement crm;
	
	@FindBy(xpath="//i[@class='fa fa-fw fa-tasks fa-3x themecolor-font-task  ']")
	private WebElement task;
	
	public MyPortal_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotoHR()
	{
		hr.click();
	}
	
	public void gotoModules() throws Exception
	{
		Thread.sleep(10000);
		modules.click();
	}
	
	public void gotoCRM()
	{
		crm.click();
	}
	
	public void gotoTask()
	{
		task.click();
	}

}
