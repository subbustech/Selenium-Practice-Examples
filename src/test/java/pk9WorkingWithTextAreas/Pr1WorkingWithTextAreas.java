package pk9WorkingWithTextAreas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1WorkingWithTextAreas {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("description")).clear();

		driver.findElement(By.id("description")).sendKeys("Welcome to selenium classes");;

		Thread.sleep(3000);
		
		driver.close();
	}
}