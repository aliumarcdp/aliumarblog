package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement unTextBox;
	
	@FindBy(name="pwd")
	private WebElement pwTextBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement contentTasks;
	
	@FindBy(xpath = "//a[@class='content reports']")
	private WebElement contentReports;
	
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement contentUsers;
	
	@FindBy(xpath = "//span[contains(text(),'Username or Password is invalid. Please try again.')]") //"//span[@class='errormsg']") in Chrome this Xpath is not working
	private WebElement errorMsg;
	
	@FindBy(xpath = "//a[@class='userProfileLink username']")
	private WebElement administraterSystem;
	
	@FindBy(id = "//img[@class='closeButton']")
	private WebElement popupClose;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un)
	{
		unTextBox.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTextBox.sendKeys(pw);
	}
	public void loginClick()
	{
		loginButton.click();
	}
	public void logoutClick() throws InterruptedException
	{
		Thread.sleep(1000);
		logoutLink.click();
	}
	public void contentTasksClick() 
	{
		contentTasks.click();
	}
	public void reportsClick() throws InterruptedException
	{
		Thread.sleep(1000);
		contentReports.click();
	}
	public void userClick() throws InterruptedException
	{
		Thread.sleep(1000);
		contentUsers.click();
	}
	
	public void testIsErrorMsgDisplayed()

	{
		if(errorMsg.isDisplayed() == true)
		{
			Reporter.log("Error message is displayed.", true);
		}
		else
		{
			Reporter.log("Error message is not displayed.", true);
		}
	}
	
	public void administraterSystem()
	{
		administraterSystem.click();
		Reporter.log("yes clicking on Administration", true);
	}
	public void clickPopupClose()
	{
		popupClose.click();
	}
}