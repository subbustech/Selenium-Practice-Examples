package pk3webdrivernavigatemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigating to a page
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		
		//Navigating to another page
		driver.navigate().to("http://www.yahoo.com");
		Thread.sleep(2000);
		
		//Navigating back
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Navigating forward
		driver.navigate().forward();
		Thread.sleep(2000);
		
		//Refreshing a page
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}
