package pk7findElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
				
		//sendKeys() Method
		driver.findElement(By.xpath("//input[@color='red']")).sendKeys("subbu");
		Thread.sleep(1000);
		
		//clear() method
		driver.findElement(By.xpath("//input[@color='red']")).clear();
		Thread.sleep(1000);
		
		//Click method
		driver.findElement(By.xpath("//input[@value='female']")).click();
		Thread.sleep(1000);
		
		//getAttribute method
		String type = driver.findElement(By.xpath("//input[@value='female']")).getAttribute("type");
		System.out.println(type);
		
		//getCssValue method
		String display = driver.findElement(By.xpath("//input[@value='female']")).getCssValue("display");
		System.out.println(display);
		
		//Getting the tag name
		String tagname = driver.findElement(By.xpath("//input[@value='female']")).getTagName();
		System.out.println(tagname);
		
		//Getting the tag name
		String text = driver.findElement(By.xpath("//div[@id='child4']")).getText();
		System.out.println(text);

		//Check if an element is displayed or hidden
		boolean displayed = driver.findElement(By.xpath("//div[@id='hiddentext']")).isDisplayed();
		System.out.println("displayed - "+displayed);
		
		//Check if an element is enabled or disabled
		boolean enabled = driver.findElement(By.xpath("//input[@id='disabled']")).isEnabled();
		System.out.println("enabled - "+enabled);
				
		//Check if an element is enabled or disabled
		boolean selected = driver.findElement(By.xpath("//input[@name='vehicle3']")).isSelected();
		System.out.println("selected - "+selected);
		
		driver.close();
	}

}
