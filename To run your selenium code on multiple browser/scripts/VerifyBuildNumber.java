package scripts;

import org.testng.annotations.Test;

import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class VerifyBuildNumber extends BaseTest
{
	@Test
	public void testVerifyBuildNumber()
	{
		EnterTimeTrackPage p = new EnterTimeTrackPage(driver);
		LoginPage l = new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("manager");
		l.loginClick();
		
		p.clickHelp();
		p.aboutActiTime();
		p.verifyBuildNumber("(build 29885)");
	}
}
