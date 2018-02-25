package POM;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class HR_Page 
{
	@FindBy(xpath="//span[.='Recruitment']")
	private WebElement recruitment;
	
	@FindBy(xpath="//a[@title='Add New Holiday']")
	private WebElement addNew;
	
	@FindBy(id="RecruitmentRequest_backup_recruitment_0")
	private WebElement bckupRecruitment;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement nofileChoosen;
	
	@FindBy(xpath="//button[.='Select Position']")
	private WebElement selectPosition;
	
	@FindBy(xpath="//a[@data-positionname='Test']")
	private WebElement Test;
	
	@FindBy(xpath="(//option[.='[Please Select]'])[2]")
	private WebElement pleaseSelect;
	
	@FindBy(xpath="//option[.='1']")
	private WebElement select7;
	
	@FindBy(xpath="//textarea[@rows='3']")
	private WebElement textArea;
	
	@FindBy(xpath="//input[@name='RecruitmentRequest[open_date_1]']")
	private WebElement openingDate;
	
	@FindBy(xpath="//input[@name='RecruitmentRequest[cv_source_deadline_1]']")
	private WebElement cvSource_Deadline;
	
	@FindBy(xpath="//input[@name='RecruitmentRequest[cv_shortlist_deadline_1]']")
	private WebElement cvShortlist_Deadline;
	
	@FindBy(xpath="//input[@name='RecruitmentRequest[interview_deadline_1]']")
	private WebElement interview_Deadline;
	
	@FindBy(xpath="//input[@name='RecruitmentRequest[close_date_1]']")
	private WebElement offer_Letter;
	
	@FindBy(xpath="//a[.='28']")
	private WebElement selectDate;
	
	@FindBy(xpath="//button[.='Save & Add New']")
	private WebElement saveRecruitmentRequest;
	
	@FindBy(xpath="//span[.='Please select job description file']")
	private WebElement errMsg1;
	public HR_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotoRecruitment()
	{
	
		recruitment.click();
	}
	
	public void addNewHoliday() throws Exception
	{
		
		addNew.click();
		bckupRecruitment.click();
		nofileChoosen.sendKeys("F:\\Selenium\\eclipse-jee-neon-3-win32-x86_64\\wall-post\\Wall-Post-Software\\general-folder\\JobDesc_Test.txt");
		
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CANCEL);
		Thread.sleep(10000);
		selectPosition.click();
		Thread.sleep(10000);
		Test.click();
		Thread.sleep(10000);
		pleaseSelect.click();
		select7.click();
		textArea.sendKeys("//textarea[@rows='3']");
		
		openingDate.click();
		selectDate.click();
		
		cvSource_Deadline.click();		
		selectDate.click();
		
		
		cvShortlist_Deadline.click();
		selectDate.click();
		
		interview_Deadline.click();
		selectDate.click();
		
		offer_Letter.click();
		selectDate.click();
	}
	
	public void clicksaveRecruitmentRequest()
	{
		
		saveRecruitmentRequest.click();
	}
	
	public void verifyErrorMsg() throws Exception
	{
		
		String actMsg=errMsg1.getText();
		String expMsg="Please select job description file";
		Assert.assertEquals(actMsg, expMsg);
		Thread.sleep(10000);
		Reporter.log(expMsg,true);
		
	}

}
