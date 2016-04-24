package pom;

import org.testng.Reporter;
import org.testng.annotations.Test;

import scripts.BaseTest;

public class Demo extends BaseTest
{
	@Test
	public void testDemo() throws InterruptedException
	{
		LoginPage l=new  LoginPage(driver);
		
		l.setUserName("admin");
		l.setPassword("manager");
		l.loginClick();
		
		l.logoutClick();
		Reporter.log("1",true);
	}
	@Test
	public void testLinkTabDemo() throws InterruptedException
	{
		LoginPage l1 = new LoginPage(driver);
		l1.contentTasksClick();
		l1.reportsClick();
		l1.userClick();
		
		Reporter.log("2",true);
	}
}
