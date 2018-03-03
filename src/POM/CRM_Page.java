package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRM_Page 
{
	WebDriver driver;
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement addNew;
	
	@FindBy(partialLinkText="+   Lead")
	private WebElement lead;
	
	@FindBy(name="Lead[]")
	private WebElement leadName;
	
	@FindBy(xpath="(//select[@name='Lead[type]'])[1]")
	private WebElement leadType;
	
	@FindBy(xpath="//option[.='Company']")
	private WebElement leadTypeCompany;
	
	@FindBy(id="packageno")
	private WebElement email;
	
	@FindBy(xpath="(//select[@name='Lead[type]'])[2]")
	private WebElement leadSourceType;
	
	@FindBy(xpath="//option[.='Online']")
	private WebElement leadSourceTypeOnline;
	
	@FindBy(xpath="(//select[@name='Lead[type]'])[3]")
	private WebElement leadIndustryType;
	
	@FindBy(xpath="//option[.='Computer']")
	private WebElement leadIndustryTypeComputer;
	
	@FindBy(xpath ="//button[.='Save  ']")
	private WebElement saveBtn;
	
	/*@FindBy(name="Lead[]")
	private WebElement leadName;
	
	@FindBy(name="Lead[]")
	private WebElement leadName;
	
	@FindBy(name="Lead[]")
	private WebElement leadName;
	
	@FindBy(name="Lead[]")
	private WebElement leadName;
	
	@FindBy(name="Lead[]")
	private WebElement leadName;
	
	@FindBy(name="Lead[]")
	private WebElement leadName;
	
	@FindBy(name="Lead[]")
	private WebElement leadName;*/
	
	
	
	public CRM_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addNewLead() throws Exception
	{
		addNew.click();
		lead.click();
		leadName.sendKeys("AAA");
		leadType.click();
		leadTypeCompany.click();
		email.sendKeys("NA");
		leadSourceType.click();
		leadSourceTypeOnline.click();
		leadIndustryType.click();
		leadIndustryTypeComputer.click();
		saveBtn.click();	
	}

}
