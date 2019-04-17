package First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo {
	
	String path;
	WebDriver driver;
	
	@Test
	public void url()
	{
	 path=System.getProperty("user.dir")+"//Driver//geckodriver.exe";
	 System.setProperty("webdriver.gecko.driver",path);
	 driver=new FirefoxDriver();
	 driver.get("http://demo.guru99.com/V1/html/Managerhomepage.php");
	 }
	
	
	
	
	
}