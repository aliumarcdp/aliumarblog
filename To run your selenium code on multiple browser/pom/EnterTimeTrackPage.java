package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EnterTimeTrackPage 
{
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "(//div[@class='popup_menu_arrow'])[3]")
	private WebElement helpLink;
	
	@FindBy(xpath = "//a[contains(text(),'About actiTIME')]")
	private WebElement aboutActiTime;
	
	@FindBy(xpath = "//span[contains(text(),'build')]")
	private WebElement buildNumber;
	
	@FindBy(xpath = "//td[@class='close-button']")
	private WebElement close;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clikLogoutLink()
	{
		logoutLink.click();
	}
	public void clickHelp()
	{
		helpLink.click();
	}
	public void aboutActiTime()
	{
		aboutActiTime.click();
	}
	public  void verifyBuildNumber(String eBuildNumber)
	{
		String aBuildNumber = buildNumber.getText();
		Assert.assertEquals(aBuildNumber, eBuildNumber);
	}
	public void clickClose()
	{
		close.click();
	}
}