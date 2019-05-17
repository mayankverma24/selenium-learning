package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class submenu {

	public static void main(String[] args) {

		String username = System.getenv("USERNAME");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\" + username
				+ "\\eclipse-workspace\\selenium-learning\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://themeforest.net/");

		Actions actions = new Actions(driver);
		WebElement menuHoverLink = driver.findElement(By.cssSelector("a[href='/category/all']"));
		actions.moveToElement(menuHoverLink);
		WebElement subLink = driver.findElement(By.cssSelector("a[href=\'/top-sellers\']"));
		actions.moveToElement(subLink);
		actions.click();
		actions.perform();

	}

}