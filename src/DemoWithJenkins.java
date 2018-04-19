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
		System.out.println("after browser");
		driver.get("http://www.google.com");
		System.out.println("after loading ");
		driver.manage().window().maximize();
		System.out.println("after max");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		System.out.println("wait");
	}

	@Test
	public void demo() {
         String actualTitle = driver.getTitle();
         System.out.println("title"+actualTitle);
         Assert.assertEquals(actualTitle, "Google");
         System.out.println("nnn");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
