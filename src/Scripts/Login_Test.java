package Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.AUL;
import Generic.BaseTest;
import POM.Login_Page;
import POM.SelectCompany_Page;

public class Login_Test  extends BaseTest
{
	@Test
	public void test_Login_Test()
	{
		try{
		int rc=AUL.getRowCount(EXCEL_PATH,"Sheet1");
		System.out.println("Row No"+rc);
		for(int i =1;i<=rc;i++)
		{
			String accountNo = AUL.getCellValue(EXCEL_PATH, "Sheet1",i, 0);
			String userName = AUL.getCellValue(EXCEL_PATH, "Sheet1",i, 1);
			String passWord = AUL.getCellValue(EXCEL_PATH, "Sheet1",i, 2);
			Login_Page lp = new Login_Page(driver);
			lp.login(accountNo, userName, passWord);
			System.out.println(accountNo);
			System.out.println(userName);
			System.out.println(passWord);
			
			
		}
		SelectCompany_Page sp = new SelectCompany_Page(driver);
		sp.selectRealEstate();
		/*sp.logout();*/
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			/*Reporter.log("Results",true);*/
		}
		/*driver.quit();*/
	}

}