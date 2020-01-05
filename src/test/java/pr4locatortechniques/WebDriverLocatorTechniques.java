package pr4locatortechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLocatorTechniques {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		
		//locating by id
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).clear();
		
		//locating by name
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).clear();
		Thread.sleep(1000);
		
		//locating by class name
		Thread.sleep(1000);
		driver.findElement(By.className("beautifultextbox")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.className("beautifultextbox")).clear();
		Thread.sleep(1000);
		
		//locating by link text
		Thread.sleep(1000);
		driver.findElement(By.linkText("google the top search engine")).click();
		Thread.sleep(1000);
		driver.close();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		
		//locating by partial link text
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("top search engine")).click();
		Thread.sleep(1000);
		driver.close();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
		
		//locating by tagname
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@color='red']")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@color='red']")).clear();
		Thread.sleep(1000);
		
		//locating by xpath
		Thread.sleep(1000);
		driver.findElements(By.tagName("input")).get(2).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElements(By.tagName("input")).get(2).clear();
		Thread.sleep(1000);
		
		//locating by css selector
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[color='red']")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[color='red']")).clear();
		Thread.sleep(1000);
		driver.close();
	}

}
