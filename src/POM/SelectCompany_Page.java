package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectCompany_Page 
{
/*	public WebDriver driver;*/
	
	@FindBy(xpath="//span[contains(text(),'Please Select')]")
	private WebElement selectCompany;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	private WebElement typeText;
	
	
	@FindBy(xpath="//span[.='RealEstate Free Trial-Test']")
	private WebElement realEstate;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueBtn;
	
	@FindBy(partialLinkText="Logout")
	private WebElement logOut;
	

	public SelectCompany_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void selectRealEstate() throws Exception
	{
		Thread.sleep(10000);
		selectCompany.click();
		typeText.sendKeys("RealEstate Free Trial-Test");
		typeText.sendKeys(Keys.ENTER);
		continueBtn.click();
		
		
	}
	public void logout() throws Exception
	{
		Thread.sleep(10000);
		logOut.click();
	}
}