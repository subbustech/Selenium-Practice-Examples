package pr1differentbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "server/MicrosoftWebDriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		System.out.println(System.getProperty("user.dir"));
		
		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");

	}

}
