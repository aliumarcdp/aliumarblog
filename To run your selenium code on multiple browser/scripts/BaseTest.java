package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

public class BaseTest 
{
	public WebDriver driver;
	@BeforeMethod
	public void preCondition(XmlTest x)
	{
		Reporter.log("============ FirefoxDriver ===========");
		driver = new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//String browser = x.getParameter("browser");
		//Reporter.log("Browser is "+ browser, true);
		
		Reporter.log("============ Chrome Driver ===========");
		System.setProperty("webdriver.chrome.driver","./exeFiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Reporter.log("============ IEDriverServer ===========");
		System.setProperty("webdriver.ie.driver","./exeFiles/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//else if(browser.equals("FF"))
		//{
			/*driver = new FirefoxDriver();
			driver.get("http://localhost:8080/login.do");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();*/
		//}
	//	else 
		//{
			/*System.setProperty("webdriver.safari.driver","./exeFiles/SafariSetup.exe");
			driver = new SafariDriver();
			driver.get("http://localhost:8080/login.do");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();*/
		//}
	}
	@AfterMethod
	public void postCondition()
	{
		Reporter.log("postCondition = BaseTest final");
		driver.close();
	}
}