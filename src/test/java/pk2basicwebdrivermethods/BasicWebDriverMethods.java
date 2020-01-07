package pk2basicwebdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		Thread.sleep(2000);
		System.out.println("Title is - "+driver.getTitle());
		System.out.println("Current URL is - "+driver.getCurrentUrl());
		//System.out.println("Page Source - "+driver.getPageSource());
		System.out.println("Current window handle - "+driver.getWindowHandle());
		Thread.sleep(3000);
		driver.close();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		//Opening child window and getting the window handles
		driver1.findElement(By.linkText("Google Link")).click();
		System.out.println("Window Handles - "+driver1.getWindowHandles());
		Thread.sleep(3000);
		driver1.quit();
	}
}
