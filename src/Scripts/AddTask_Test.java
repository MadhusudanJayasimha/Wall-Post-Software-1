package Scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.AUL;
import Generic.BaseTest;
import POM.Login_Page;
import POM.SelectCompany_Page;

public class AddTask_Test extends BaseTest
{
	@Test(dataProvider="login")
	public void test_AddTask_Test(String accno,String un,String pwd) throws Exception
	{
		Login_Page lp = new Login_Page(driver);
		lp.login(accno, un, pwd);
		
		/*SelectCompany_Page sp = new SelectCompany_Page(driver);
		sp.logout();*/
	}
	
	@DataProvider(name="login")
	public Object[][] getData() throws Exception
	{
		
		
		
		int rc=	AUL.getRowCount(EXCEL_PATH, "Sheet1");
		System.out.println(rc);
		
		Object[][] data = new Object[rc][3];
		for(int i=1;i<rc;i++)
		{
		
			data[i][0] = AUL.getCellValue(EXCEL_PATH, "Sheet1", i, 0);
			data[i][1] = AUL.getCellValue(EXCEL_PATH, "Sheet1", i, 1);
			data[i][2] = AUL.getCellValue(EXCEL_PATH, "Sheet1", i, 2);
			
		}
		
		 
		return data;
	}

}
