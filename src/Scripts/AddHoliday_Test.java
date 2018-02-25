package Scripts;

import org.testng.annotations.Test;

import Generic.AUL;
import Generic.BaseTest;
import POM.HR_Page;
import POM.Login_Page;
import POM.MyPortal_Page;
import POM.SelectCompany_Page;

public class AddHoliday_Test extends BaseTest
{
	@Test
	public void test_AddHoliday_Test()
	{
		try {
			int rc=AUL.getRowCount(EXCEL_PATH,"Sheet1");
			System.out.println("Row No"+rc);
			for(int i =1;i<=rc;i++)
			{
			String accountNo = AUL.getCellValue(EXCEL_PATH, "Sheet1",i, 0);
			String userName = AUL.getCellValue(EXCEL_PATH, "Sheet1",i, 1);
			String passWord = AUL.getCellValue(EXCEL_PATH, "Sheet1",i, 2);
			Login_Page lp = new Login_Page(driver);
			lp.login(accountNo, userName, passWord);
			}
			
			try {
				SelectCompany_Page sp = new SelectCompany_Page(driver);
				sp.selectRealEstate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			MyPortal_Page mp = new MyPortal_Page(driver);
			mp.gotoHR();
			
			HR_Page hp = new HR_Page(driver);
			hp.gotoRecruitment();
			hp.addNewHoliday();
			hp.clicksaveRecruitmentRequest();
		/*	hp.verifyErrorMsg();*/
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
