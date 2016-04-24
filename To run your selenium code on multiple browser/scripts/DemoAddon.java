package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAddon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.profile", "default");
		new FirefoxDriver();
		//WebDriver driver=new FirefoxDriver();
	}

}
