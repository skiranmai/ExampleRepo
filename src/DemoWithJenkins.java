import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWithJenkins {
	private WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}

	@Test
	public void demo() {
         String actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, "Google");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
