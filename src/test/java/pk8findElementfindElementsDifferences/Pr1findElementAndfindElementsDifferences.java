package pk8findElementfindElementsDifferences;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1findElementAndfindElementsDifferences {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		
		//findElement returns a single WebElement
		WebElement el = driver.findElement(By.id("first name"));
		el.sendKeys("By findElement Method");
		Thread.sleep(1000);
		
		//Find Element returns a list of WebElement
		List<WebElement> ls = driver.findElements(By.tagName("input"));
		ls.get(0).sendKeys("By findElements Method");
		Thread.sleep(1000);
		ls.get(1).sendKeys("By findElements Method");
		Thread.sleep(1000);
		
		driver.close();
	}
}