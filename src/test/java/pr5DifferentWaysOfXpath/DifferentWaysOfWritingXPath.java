package pr5DifferentWaysOfXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWaysOfWritingXPath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
				
		//locating by xpath - normal way
		driver.findElement(By.xpath("//input[@color='red']")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@color='red']")).clear();
		
		//Locating by xpath using regular expression
		driver.findElement(By.xpath("//*[@color='red']")).sendKeys("venkat");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@color='red']")).clear();
		Thread.sleep(1000);
		
		//Locating by xpath using contains
		driver.findElement(By.xpath("//input[contains(@class,'xpaths')]")).sendKeys("Ganesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@class,'xpaths')]")).clear();
		Thread.sleep(1000);
		
		//Locating by xpath using starts-with
		driver.findElement(By.xpath("//input[starts-with(@id,'last')]")).sendKeys("Suresh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[starts-with(@id,'last')]")).clear();
		Thread.sleep(1000);
		
		//Locating by xpath using end-with
//		driver.findElement(By.xpath("//input[ends-with(@id,'name')]")).sendKeys("Ramesh");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[ends-with(@id,'name')]")).clear();
//		Thread.sleep(1000);
		
		//Locating by xpath using parent child relationship
		driver.findElement(By.xpath("//div[@id='divtextbox']/div/div/input")).sendKeys("Naresh");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='divtextbox']/div/div/input")).clear();
		Thread.sleep(1000);
		
		//Locating by xpath using following sibling
		String follwingsibbling1 = driver.findElement(By.xpath("//div[@id='child4']//following-sibling::div[1]")).getText();
		System.out.println(follwingsibbling1);
		Thread.sleep(1000);
		
		//Locating by xpath using preceding sibling
		String precedingsibbling1 = driver.findElement(By.xpath("//div[@id='child4']//preceding-sibling::div[1]")).getText();
		System.out.println(precedingsibbling1);
		Thread.sleep(1000);
		
		//Locating by xpath using parent
		String parentdes = driver.findElement(By.xpath("//div[@id='child4']//parent::div")).getText();
		System.out.println(parentdes);
		Thread.sleep(1000);
		
		//Locating by xpath using ancestor
		String ancestordes = driver.findElement(By.xpath("//div[@id='child4']//ancestor::div")).getText();
		System.out.println(ancestordes);
		Thread.sleep(1000);
		
		driver.close();
	}

}
