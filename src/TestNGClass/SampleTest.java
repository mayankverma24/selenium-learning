package TestNGClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//System.setProperty("webdriver.chrome.driver","C:\\Users\\mayan\\Downloads\\chromedriver_win32 (1)\chromedriver.exe");
public class SampleTest {
	WebDriver driver;
	@BeforeMethod
	public void createdriver() {
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void VerifyTitle() {
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, "Facebook – log in or sign up");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hello");
		//driver.quit();
	}
//  @BeforeMethod
//  public void beforeMethod() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }

}
