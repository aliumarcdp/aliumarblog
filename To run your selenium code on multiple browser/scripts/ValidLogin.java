package scripts;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class ValidLogin extends BaseTest
{
	@Test
	public void testValidLogin()
	{
		LoginPage l = new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.loginClick();
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.clikLogoutLink();
	}
}
