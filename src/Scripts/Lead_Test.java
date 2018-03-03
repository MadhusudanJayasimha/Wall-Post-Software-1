package Scripts;

import org.testng.annotations.Test;

import Generic.AUL;
import Generic.BaseTest;
import POM.CRM_Page;
import POM.Login_Page;
import POM.MyPortal_Page;
import POM.SelectCompany_Page;

public class Lead_Test extends BaseTest
{
	@Test
	public void test_addLead() throws Exception
	{
		String accNo = AUL.getCellValue(EXCEL_PATH, "Sheet1", 4, 0);
		String un = AUL.getCellValue(EXCEL_PATH, "Sheet1", 4, 1);
		String pwd = AUL.getCellValue(EXCEL_PATH, "Sheet1",4, 2);
		Login_Page lp = new Login_Page(driver);
		lp.login(accNo,un,pwd);
		
		SelectCompany_Page sp = new SelectCompany_Page(driver);
		sp.selectRealEstate();
		
		MyPortal_Page mp = new MyPortal_Page(driver);
		mp.gotoModules();
		mp.gotoCRM();
		
		CRM_Page cp = new CRM_Page(driver);
		cp.addNewLead();
		
	}

}
