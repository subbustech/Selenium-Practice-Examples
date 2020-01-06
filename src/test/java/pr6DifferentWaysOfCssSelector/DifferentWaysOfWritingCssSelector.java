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
		
		//Locating by CssSelector by using .className
		driver.findElement(By.cssSelector(".text")).sendKeys("Pavan");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".text")).clear();
		Thread.sleep(1000);
				
		//Locating by CssSelector by using .multiple classNames
		driver.findElement(By.cssSelector(".text.primary-text.primary-table-text.js-text")).sendKeys("Virat");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".text.primary-text")).clear();
		Thread.sleep(1000);
		
		//Locating by CssSelector using starting text match using symbol ^
		driver.findElement(By.cssSelector("input[class^='more']")).sendKeys("Kohli");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class^='more']")).clear();
		Thread.sleep(1000);
				
		//Locating by CssSelector using ending text match using symbol $
		driver.findElement(By.cssSelector("input[class$='xpaths']")).sendKeys("Dravid");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class$='xpaths']")).clear();
		Thread.sleep(1000);
				
		//Locating by CssSelector using anywhere text match using symbol *
		driver.findElement(By.cssSelector("input[class*=' text ']")).sendKeys("Gambhir");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class*=' text ']")).clear();
		Thread.sleep(1000);
		
		//Locating by CssSelector using Child Locators
		driver.findElement(By.cssSelector("form>label>input[id='firstname']")).sendKeys("Vikas");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("form>label>input[id='firstname']")).clear();
		Thread.sleep(1000);
				
		//More than one element use findElements and then get()
		driver.findElements(By.cssSelector("input[class*='text']")).get(0).sendKeys("Khumble");
		Thread.sleep(1000);
		driver.findElements(By.cssSelector("input[class*='text']")).get(0).clear();
		Thread.sleep(1000);
		
		driver.close();
	}
}
