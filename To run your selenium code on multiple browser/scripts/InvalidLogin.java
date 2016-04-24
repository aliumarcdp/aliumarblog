package scripts;

import org.testng.annotations.Test;

import pom.LoginPage;

public class InvalidLogin extends BaseTest
{
	@Test
	public void testInvalidLogin()
	{
		LoginPage l = new LoginPage(driver);
		l.setUserName("xyz");
		l.setPassword("abc");
		l.loginClick();
		l.testIsErrorMsgDisplayed();
		
		/*EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.verifyBuildNumber("zvdsfd");
		e.clikLogoutLink();*/
	}
}
