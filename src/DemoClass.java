import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DemoClass {
	private static WebDriver driver;
	public static void main(String[] args) {
      driver = new FirefoxDriver();
      driver.get("http://www.google.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
      if(driver.getTitle().equals("Google")){
    	  System.out.println("Page loaded successfully...");
      }
      else{
    	  System.out.println("Error in loading page....");
      }
      driver.close();
	}
}
