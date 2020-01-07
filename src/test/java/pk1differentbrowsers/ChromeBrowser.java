package pk1differentbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println(System.getProperty("user.dir"));
		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");
	}

}
