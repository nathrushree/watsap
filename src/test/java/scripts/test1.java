package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1
{
	public WebDriver driver;
   @Test
   public void launch()
   {
	   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	   driver=new  FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("https://www.google.com");
   }
   
}
