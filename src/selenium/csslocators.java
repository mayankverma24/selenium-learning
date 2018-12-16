package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class csslocators {

	public static void main(String[] args) {
		//System.out.println("Hello mn");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mayan\\eclipse-workspace\\selenium-learning\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		//-Creating custom xpath //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@etitle='From']")).sendKeys("BOM");
		
		/*-Creating custom css
		tagname[attribute='value']
		tagname#id
		tagname.classname*/
		//driver.findElement(By.cssSelector("input[etitle='To']")).sendKeys("CCU");
		driver.findElement(By.cssSelector("input#ToTag")).sendKeys("CCU");
		
		//Print data from web element
		System.out.println(driver.findElement(By.cssSelector("#flightsHomeFlashSaleBanner")).getText());
		
		driver.quit();
		
		
	}

}