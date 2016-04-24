package scripts;

import org.testng.annotations.Test;

import pom.LoginPage;

public class AdministrationSystemPopup extends BaseTest
{
	@Test
	public void testAdministrationSystemPopup()
	{
		LoginPage l = new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.loginClick();
		l.administraterSystem();
		l.clickPopupClose();
	}
}
