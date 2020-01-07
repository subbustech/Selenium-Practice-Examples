package pk10WorkingWithCheckboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr1SelectingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///"+System.getProperty("user.dir")+"\\practicesite\\index\\index.html");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='vehicle1']")).click();

		Thread.sleep(2000);

		boolean selected = driver.findElement(By.xpath("//input[@name='vehicle3']")).isSelected();

		if(selected) {
			System.out.println("Vehicle3 is already checked. Unchecking vehicle3");
			driver.findElement(By.xpath("//input[@name='vehicle3']")).click();
		}

		Thread.sleep(3000);

		driver.close();
	}

}
