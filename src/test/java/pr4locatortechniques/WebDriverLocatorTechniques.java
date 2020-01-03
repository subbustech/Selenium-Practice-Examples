package pr4locatortechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLocatorTechniques {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println(System.getProperty("user.dir"));
		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		
		//locating by id
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(1000);
		
		driver.close();
	}

}
