package pr6DifferentWaysOfCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentWaysOfWritingCssSelector {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
				
		//locating by CssSelector - normal way
		driver.findElement(By.cssSelector("input[color='red']")).sendKeys("subbu");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[color='red']")).clear();
		Thread.sleep(1000);
		
		//locating by CssSelector - Using Multiple attributes
		driver.findElement(By.cssSelector("input[id='firstname'][class='beautifultextbox']")).sendKeys("venkat");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='firstname'][class='beautifultextbox']")).clear();
		Thread.sleep(1000);
		
		//Locating by CssSelector by using tag name and id
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("Suresh");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#firstname")).clear();
		Thread.sleep(1000);

		//Locating by CssSelector by using only id
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Ganesh");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#firstname")).clear();
		Thread.sleep(1000);
		
		//Locating by CssSelector by using tagName.className
		driver.findElement(By.cssSelector("input.text")).sendKeys("Harish");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.text")).clear();
		Thread.sleep(1000);
		
		//Locating by CssSelector by using tagName.multiple classNames
		driver.findElement(By.cssSelector("input.text.primary-text.primary-table-text.js-text")).sendKeys("Kumar");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.text.primary-text")).clear();
		Thread.sleep(1000);
		
		//		//Locating by xpath using regular expression
//		driver.findElement(By.xpath("//*[@color='red']")).sendKeys("venkat");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@color='red']")).clear();
//		Thread.sleep(1000);
//		
//		//Locating by xpath using contains
//		driver.findElement(By.xpath("//input[contains(@class,'xpaths')]")).sendKeys("Ganesh");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[contains(@class,'xpaths')]")).clear();
//		Thread.sleep(1000);
//		
//		//Locating by xpath using starts-with
//		driver.findElement(By.xpath("//input[starts-with(@id,'last')]")).sendKeys("Suresh");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[starts-with(@id,'last')]")).clear();
//		Thread.sleep(1000);
//		
//		//Locating by xpath using end-with
////		driver.findElement(By.xpath("//input[ends-with(@id,'name')]")).sendKeys("Ramesh");
////		Thread.sleep(1000);
////		driver.findElement(By.xpath("//input[ends-with(@id,'name')]")).clear();
////		Thread.sleep(1000);
//		
//		//Locating by xpath using parent child relationship
//		driver.findElement(By.xpath("//div[@id='divtextbox']/div/div/input")).sendKeys("Naresh");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@id='divtextbox']/div/div/input")).clear();
//		Thread.sleep(1000);
//		
//		//Locating by xpath using following sibling
//		String follwingsibbling1 = driver.findElement(By.xpath("//div[@id='child4']//following-sibling::div[1]")).getText();
//		System.out.println(follwingsibbling1);
//		Thread.sleep(1000);
//		
//		//Locating by xpath using preceding sibling
//		String precedingsibbling1 = driver.findElement(By.xpath("//div[@id='child4']//preceding-sibling::div[1]")).getText();
//		System.out.println(precedingsibbling1);
//		Thread.sleep(1000);
//		
//		//Locating by xpath using parent
//		String parentdes = driver.findElement(By.xpath("//div[@id='child4']//parent::div")).getText();
//		System.out.println(parentdes);
//		Thread.sleep(1000);
//		
//		//Locating by xpath using ancestor
//		String ancestordes = driver.findElement(By.xpath("//div[@id='child4']//ancestor::div")).getText();
//		System.out.println(ancestordes);
//		Thread.sleep(1000);
		
		driver.close();
	}
}
