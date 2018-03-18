package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskManagement_Page 
{
	@FindBy(xpath="//span[@class='caret']")
	private WebElement addNew;
	
	@FindBy(xpath="//span[@class='fa fa-star fa-lg fa-fw']")
	private WebElement publicTask;
	
	@FindBy(xpath="//input[@placeholder='Task Name']")
	private WebElement  taskName;
	
	@FindBy(xpath="(//option[.='Select a Category'])[1]")
	private WebElement selectCategory;
	
	@FindBy(xpath="(//option[.='Test-rtl category'])[2]")
	private WebElement testRtlCategory;
	
	
	@FindBy(xpath="(//option[.=' Filter By Department'])[1]")
	private WebElement filterByDepartment;
	
	@FindBy(xpath="(//option[.='test dept'])[1]")
	private WebElement testDept;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement attachFiles;
	
	@FindBy(xpath="(//option[.='Choose A Employee'])[1]")
	private WebElement chooseAEmployee;
	
	@FindBy(xpath="(//option[@value='tRAyJaxmxm7VeaG'])[2]")
	private WebElement leicesterManager; 
	
	@FindBy(xpath="//span[@class='fa fa-edit fa-lg fa-fw']")
	private WebElement saveDraft;
	
	
	
	public TaskManagement_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void addNewTask()
	{
		addNew.click();
		publicTask.click();
		taskName.sendKeys("Task 1");
		selectCategory.click();
		testRtlCategory.click();
		filterByDepartment.click();
		testDept.click();
		attachFiles.sendKeys("F:\\Selenium\\eclipse-jee-neon-3-win32-x86_64\\wall-post\\Wall-Post-Software\\general-folder\\JobDesc_Test.txt");
		chooseAEmployee.click();
		leicesterManager.click();
		saveDraft.click();
	}
	
	
	
	

}
