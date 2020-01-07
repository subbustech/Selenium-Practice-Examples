package pk1differentbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "server/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		System.out.println(System.getProperty("user.dir"));
		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");

	}

}
