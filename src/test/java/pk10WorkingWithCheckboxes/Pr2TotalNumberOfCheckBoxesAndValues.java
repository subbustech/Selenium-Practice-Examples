package pk10WorkingWithCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr2TotalNumberOfCheckBoxesAndValues {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");

		Thread.sleep(2000);

		int no_check_boxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();

		System.out.println("No. of checkboxes are "+no_check_boxes);

		for(int i=0; i<no_check_boxes; i++) {
			String cbvalue = driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("value");
			System.out.println(cbvalue);
		}


	}

}
