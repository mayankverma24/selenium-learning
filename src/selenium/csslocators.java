package selenium;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class csslocators {

	public static void main(String[] args) {
		// System.out.println("Hello mn");

		String username = System.getenv("USERNAME");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\" + username
				+ "\\eclipse-workspace\\selenium-learning\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");

		// -Creating custom xpath: //tagname[@attribute='value']
		// driver.findElement(By.xpath("//input[@etitle='From']")).sendKeys("BOM");

		/*-Creating custom css
		tagname[attribute='value']
		tagname#id
		tagname.classname*/
		// driver.findElement(By.cssSelector("input[etitle='To']")).sendKeys("CCU");
		driver.findElement(By.cssSelector("input#ToTag")).sendKeys("CCU");

		// Print data from web element
		System.out.println(driver.findElement(By.cssSelector("#flightsHomeFlashSaleBanner")).getText());

		// xpath regular expression: //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//div[@id='ORtrip']/section[1]/div[1]/dl/dd/span/input[contains(@etitle,'Fro')]"))
				.sendKeys("IDR");

		Select s = new Select(driver.findElement(By.id("Adults")));
		List<WebElement> options = s.getOptions();

		for (WebElement item : options) {
			System.out.println("Dropdown values are " + item.getText());
		}

		// CSS regular expression: //tagname[attribute*='value']
		// driver.findElement(By.cssSelector("//div[@id='ORtrip']/section[1]/div[1]/dl/dd/span/input[etitle*='Fro']")).sendKeys("BHO");
		// driver.quit();

		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(30,TimeUnit.SECONDS) .pollingEvery(5,TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class);
		 * driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); WebDriverWait
		 * wait = new WebDriverWait(driver, 5); WebElement d =
		 * wait.until(ExpectedConditions.elementToBeCLickable(""));
		 */

	}

}