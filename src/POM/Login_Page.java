package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{
	/*WebDriver driver;*/
	@FindBy(xpath="//input[@id='LoginForm_accountno']")
	private WebElement accNo;
	
	@FindBy(id="LoginForm_username")
	private WebElement userName;
	
	@FindBy(id="LoginForm_password")
	private WebElement passWord;
	
	@FindBy(xpath="//button[.='Sign in']")
	private WebElement siginBtn;
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void login(String accountNo,String un,String pwd)
	{
		accNo.sendKeys(accountNo);
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		siginBtn.click();
		
	}

}
